package polymorphism;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;

	}

	public void add() {
		System.out.println("Customer added "); // database e musteri ekleme kodlari
		/*
		 * DatabaseLogger logger = new DatabaseLogger(); logger.Log("Log mesaji"); bu
		 * kod programi bagimli hale getiren bir kod
		 */
		this.logger.log("Log mesaji");
	}
}
