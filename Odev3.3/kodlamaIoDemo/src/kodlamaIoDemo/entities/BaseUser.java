package kodlamaIoDemo.entities;

public class BaseUser {
	private int id;
	private String city;
	private String mail;
	private String adress;
	private String country;
	private String firstName;
	private String lastName;
	private String userType;

	public BaseUser() {

	}

	public BaseUser(int id, String city, String mail, String adress, String country, String firstName,
			String lastName, String userType) {

		this.id = id;
		this.city = city;
		this.mail = mail;
		this.adress = adress;
		this.country = country;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
