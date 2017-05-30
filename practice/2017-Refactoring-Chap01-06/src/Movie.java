
public class Movie {
	public enum PriceCode {
		CHILDRENS {
			@Override
			public int getPrice(int daysRented) {
				int price = 1500;
				if(daysRented>3)
					price += (daysRented-3)*1500;
				return price;
			}
		}, 
		REGULAR {
			@Override
			public int getPrice(int daysRented) {
				int price = 2000;
				if(daysRented>2)
					price += (daysRented-2)*1500;
				return price;
			}
		}, 
		NEW_RELEASE {
			@Override
			public int getPrice(int daysRented) {
				return daysRented*2000;
			}

			@Override
			public int getFrequentRentalPoints(int daysRented) {
				if(daysRented>1) return 200;
				else return super.getFrequentRentalPoints(daysRented);
			}
		};
		public abstract int getPrice(int daysRented);
		public int getFrequentRentalPoints(int daysRented){
			return 100;
		}
	};
	private String title;
	private PriceCode priceCode;
	public Movie(String title, PriceCode priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}
	public String getTitle() {
		return title;
	}
	public PriceCode getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(PriceCode priceCode) {
		this.priceCode = priceCode;
	}
	public int getPrice(int daysRented){
		return priceCode.getPrice(daysRented);
	}
	public int getFrequentRentalPoints(int daysRented){
		return priceCode.getFrequentRentalPoints(daysRented);
	}
}
