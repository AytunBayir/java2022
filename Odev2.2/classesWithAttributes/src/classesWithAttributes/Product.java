package classesWithAttributes;

//özellik(attribute | field) tutan sýnýflar.
//ürüne ait bilgileri tutmuþ olduk.
public class Product {
	//Constructor w/o parameters.
	public Product() {
		System.out.println("Yapýcý Blok Çalýþtý");
	}
	//Constructor w paramters
	public Product(int id, String name, String description, int price, int stockAmount, String renk) {
		System.out.println("Yapýcý Blok Çalýþtý");
		//set etmek için
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;	
	}
	// hiçbir þey yazýlmadýðýnda public olarak tanýmlanýr her yerden eriþilebilir.
	// private tanýmlandýðýnda sadece içinde bulunduðu sýnýfta kullanýlabilir.
	private double price;
	private int stockAmount;
	private int id;
	private String name;
	private String description;
	private String renk;
	@SuppressWarnings("unused")
	private String kod;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {  //kodu kullanýcýnýn yazmasýna engel olundu
		return this.name.substring(0, 1) + id;
	}


	/*
	 * public int getId() { 
	 * return _id;
	 *}
	 * 
	 * public void setId(int id) {
	 *  _id = id; 
	 *}
	 * 
	 * /* public void setId(int id) { 
	 * this.id = id; //this = içerisinde bulunduðun class. 
	 * }
	 */
}
