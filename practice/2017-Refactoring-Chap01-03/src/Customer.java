import java.util.ArrayList;


public class Customer {
	private String name;
	private ArrayList<Rental> rentals = new ArrayList<>();
	public Customer(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void addRental(Rental rental){
		rentals.add(rental);
	}
	public String statement(){
		int totalAmount = 0;
		int frequentRentalPoints = 0;
		String result = String.format("고객 %s님의 대여목록:\n", name);
		for(Rental rental: rentals){
			int thisAmount = rental.getPrice();
			frequentRentalPoints += rental.getFrequentRentalPoints();
			result += String.format("\t%s\t%,d원\n", rental.getMovie().getTitle(), thisAmount);
			totalAmount += thisAmount;
		}
		result += String.format("총금액: %,d원\n", totalAmount);
		result += String.format("적립포인트: %d점\n", frequentRentalPoints);
		return result;
	}
}
