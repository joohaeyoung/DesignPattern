
public class PersonBeanImpl implements PersonBean {
	private String name;
	private Gender gender;
	private String interest;
	private int rating = 0;
	private int ratingCount = 0;
	@Override
	public String getName() {
		return name;
	}
	@Override
	public Gender getGender() {
		return gender;
	}

	@Override
	public String getInterest() {
		return interest;
	}

	@Override
	public int getHotOrNotRating() {
		if(ratingCount==0) return 0;
		return rating/ratingCount;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		++ratingCount;
	}

}
