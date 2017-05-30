
public class Movie {
	public enum PriceCode {CHILDRENS, REGULAR, NEW_RELEASE};
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
		int price = 0;
		switch(priceCode){
		case REGULAR:
			price += 2000;
			if(daysRented>2)
				price += (daysRented-2)*1500;
			break;
		case NEW_RELEASE:
			price += daysRented*2000;
			break;
		case CHILDRENS:
			price += 1500;
			if(daysRented>3)
				price += (daysRented-3)*1500;
			break;
		}
		return price;
	}
	public int getFrequentRentalPoints(int daysRented){
		switch(priceCode){
		case NEW_RELEASE:
			if(daysRented>1) return 200;
		default: return 100;
		}
	}
}
