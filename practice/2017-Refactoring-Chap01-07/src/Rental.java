
public class Rental {
	private Movie movie;
	private int daysRented;
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	public Movie getMovie() {
		return movie;
	}
	public int daysRented() {
		return daysRented;
	}
	public int getPrice(){
		return getMovie().getPrice(daysRented);
	}
	public int getFrequentRentalPoints(){
		return getMovie().getFrequentRentalPoints(daysRented);
	}
}
