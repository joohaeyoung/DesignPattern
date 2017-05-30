
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
		int price = 0;
		switch(getMovie().getPriceCode()){
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
	public int getFrequentRentalPoints(){
		int frequentRenterPoints = 100;
		if((getMovie().getPriceCode()
				==Movie.PriceCode.NEW_RELEASE) &&
			daysRented>1)
			frequentRenterPoints += 100;
		return frequentRenterPoints;
	}
}
