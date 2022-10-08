package oop1;

//PascalCase classlarda ilk halfler her zaman büyük harfle yazýlýr.
public class Product {
	// Fieldlar camelCase yazýlýr.
	// veri yapýsý + field (int unitStock)
	// Private yazýnca sadece bulunduðu class içeisinde kullanýlabilir demek.
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl; // String[] imageUrls birden çok fotoðraf olsaydý.
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
