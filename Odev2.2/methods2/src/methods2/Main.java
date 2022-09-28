package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok ggüzel";
		String yeniMesaj = mesaj.substring(0, 2); // B'den baþlayarak g'ye kadar olan (0 dahil 2 dahil deðil) harfleri
													// alýr ve bir sonuç olarak verir.
		/*
		 * String yeniMesaj = ekle(); //Void bir metodla deðer yollanamayacaðý için hata
		 * verdi.
		 */
		String yeniYeniMesaj = sehirVer();
		System.out.println(yeniYeniMesaj);
		System.out.println(yeniMesaj);
		int sayi = topla(50, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 7, 5, 6, 5, 8);
		System.out.println(toplam);

	}

	// void operasyonlarý (methodlarý)
	// Yapýlmasý istenen þeyleri yapar.
	public static void ekle() { // veri tabanýna biþey ekleyen bir metod.
		System.out.println("Eklendi");
	}

	public static void sil() { // veri tabanýndan biþey silen bir metod.
		System.out.println("Silindi");
	}

	public static void güncelle() { // veri tabanýný güncelleyen bir metod.(ekrana yaz edik yazdý.)
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) { // Integer bir deðer yollayan bir metod.
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) { // Veriable arguments (...) sayiler int array gibi çalýþýyor.
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam; //Integer bir deðer yolluyor.

	}

	public static String sehirVer() {
		return "Ankara"; //String bir veri yolluyor.
	}

}
