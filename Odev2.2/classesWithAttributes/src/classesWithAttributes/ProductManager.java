package classesWithAttributes;
//�r�n ile alakal� operasyonlar� i�eern class.
public class ProductManager {
	public void Add(Product product) {
		//JDBC kodlar� ile veri taban�na kaydedece�iz.
		System.out.println("�r�n Eklendi: " + product.getName());
	}
	//hatal� kullan�m!!
	/*public void Add2(int id, String name, String description, int stockAmount, double price) {
	 *	
	}*/
}
