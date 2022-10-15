package staticDemo;

public class ProductValidator {
	//eklenecek urun gecerli mi degil mi kontrol etmek icin kullanilan bir yapi
	//gecerli olabilmesi icin  urunun hem ismi hem fiyat bilgisinin girilmis olmasi gereklidir
	
	static {
		System.out.println("Static Constuctor");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	//inner class
	public static class BaskaBirClass{
		public static void sil() {
			
		}
	}
}
