package oop1;

public class CorporateCustomer extends Customer { //Kurumsal kullanýcýyýda kullanýcýlar sýnýfýna dahil etmiþ olduk.
	private String companyName;
	private String taxNumber;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
