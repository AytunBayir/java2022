package oop1;

public class IndividualCustomer extends Customer { // �ndividual customer is an extention of customer. extends ifadesi
													// ile customer s�n�f�nda tan�mlad���m�z(id,phone, vb) hem bireysel hemde kurumsal i�in ortak olan de�i�kenleri
													// bu s�n�fa da dahil etmi� olduk.
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
