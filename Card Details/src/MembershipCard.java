public class MembershipCard extends Card {
	private int rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public void display() {
		
		System.out.println(getHolderName()+"Membership Card Details: ");
		System.out.println("Card Number :"+getCardNumber());
		System.out.println("Rating :"+getRating());
		
		//System.out.println(""+getExpiryDate());
	}
	
	

}
