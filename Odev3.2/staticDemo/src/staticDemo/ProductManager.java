package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//veritabanina ekleyen metod
		//ProductValidator validator = new ProductValidator(); static tanimlandigi cin direkt olarak class i cagirabildik
		if(ProductValidator.isValid(product)) { //
			System.out.println("eklendi");
		}else {
			System.out.println("Urun bilgileri gecersizdir");
		}
		//bu sekilde kullan at arac niteligi tasiyan classlar icin static metodu  kullanilabilir.
		//staticler direkt olarak cagrilir ve bellekte kalici yer tutar(uygulama kpanana kadar)
		//contructorlar new lenmeden calismazlar(java icin)
		
	}
}
