
public interface Price {
	int getPrice(int daysRented);
	default int getFrequentRentalPoints(int daysRented){
		return 100;
	}
}
