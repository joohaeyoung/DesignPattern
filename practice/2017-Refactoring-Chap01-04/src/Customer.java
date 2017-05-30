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
		String result = String.format("고객 %s님의 대여목록:\n", name);
		for(Rental rental: rentals){
			result += String.format("\t%s\t%,d원\n", 
					rental.getMovie().getTitle(), rental.getPrice());
		}
		result += String.format("총금액: %,d원\n", getTotalAmount());
		result += String.format("적립포인트: %d점\n", getTotalFrequentRentalPoints());
		return result;
	}
	private int getTotalAmount(){
		int totalAmount = 0;
		for(Rental rental: rentals)
			totalAmount += rental.getPrice();
		return totalAmount;
	}
	private int getTotalFrequentRentalPoints(){
		int totalPoints = 0;
		for(Rental rental: rentals)
			totalPoints += rental.getFrequentRentalPoints();
		return totalPoints;
	}
}
