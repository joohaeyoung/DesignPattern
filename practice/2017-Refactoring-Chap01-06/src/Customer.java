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
		result += rentals.stream()
				.map(r->String.format("\t%s\t%,d원\n", 
					r.getMovie().getTitle(), r.getPrice()))
				.reduce("",String::concat);
		result += String.format("총금액: %,d원\n", getTotalAmount());
		result += String.format("적립포인트: %d점\n", getTotalFrequentRentalPoints());
		return result;
	}
	private int getTotalAmount(){
		return rentals.stream().map(r->r.getPrice())
			.reduce(0, Integer::sum);
	}
	private int getTotalFrequentRentalPoints(){
		return rentals.stream().map(r->r.getFrequentRentalPoints())
				.reduce(0, Integer::sum);
	}
}
