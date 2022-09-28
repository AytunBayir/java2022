package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Siyah");
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		// yeni bir �zellik eklenmesi gerekirse hepsinde ay� ay� operasyon d�zelenmesi
		// gerekir.
		// bu sebeple hatal� bir kullan�md�r.
		/*
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200); 
		 * productManager.Add2(1, "", "", 2, 200);
		 * productManager.Add2(1, "", "", 2, 200);
		 * productManager.Add2(1, "", "", 2, 200);
		 */
	}

}
