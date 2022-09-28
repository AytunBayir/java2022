package classesWithAttributes;

//�zellik(attribute | field) tutan s�n�flar.
//�r�ne ait bilgileri tutmu� olduk.
public class Product {
	//Constructor w/o parameters.
	public Product() {
		System.out.println("Yap�c� Blok �al��t�");
	}
	//Constructor w paramters
	public Product(int id, String name, String description, int price, int stockAmount, String renk) {
		System.out.println("Yap�c� Blok �al��t�");
		//set etmek i�in
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;	
	}
	// hi�bir �ey yaz�lmad���nda public olarak tan�mlan�r her yerden eri�ilebilir.
	// private tan�mland���nda sadece i�inde bulundu�u s�n�fta kullan�labilir.
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

	public String getKod() {  //kodu kullan�c�n�n yazmas�na engel olundu
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
	 * this.id = id; //this = i�erisinde bulundu�un class. 
	 * }
	 */
}
