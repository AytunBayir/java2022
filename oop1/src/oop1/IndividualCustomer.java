package oop1;

public class IndividualCustomer extends Customer { // Ýndividual customer is an extention of customer. extends ifadesi
													// ile customer sýnýfýnda tanýmladýðýmýz(id,phone, vb) hem bireysel hemde kurumsal için ortak olan deðiþkenleri
													// bu sýnýfa da dahil etmiþ olduk.
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
