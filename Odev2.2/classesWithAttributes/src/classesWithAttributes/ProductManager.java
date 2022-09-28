package classesWithAttributes;
//ürün ile alakalý operasyonlarý içeern class.
public class ProductManager {
	public void Add(Product product) {
		//JDBC kodlarý ile veri tabanýna kaydedeceðiz.
		System.out.println("Ürün Eklendi: " + product.getName());
	}
	//hatalý kullaným!!
	/*public void Add2(int id, String name, String description, int stockAmount, double price) {
	 *	
	}*/
}
