package kodlamaIoDemo.entities;

public class StudentUser extends BaseUser {
	private String cardNumber;

	public StudentUser(String cardNumber) {
		super();
		this.cardNumber = cardNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

}
