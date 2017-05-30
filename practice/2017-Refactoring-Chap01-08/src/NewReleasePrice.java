
public class NewReleasePrice implements Price {

	@Override
	public int getPrice(int daysRented) {
		return daysRented*2000;
	}
	@Override
	public int getFrequentRentalPoints(int daysRented) {
		if(daysRented>1) return 200;
		else return Price.super.getFrequentRentalPoints(daysRented);
	}
}
