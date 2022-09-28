package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok gg�zel";
		String yeniMesaj = mesaj.substring(0, 2); // B'den ba�layarak g'ye kadar olan (0 dahil 2 dahil de�il) harfleri
													// al�r ve bir sonu� olarak verir.
		/*
		 * String yeniMesaj = ekle(); //Void bir metodla de�er yollanamayaca�� i�in hata
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

	// void operasyonlar� (methodlar�)
	// Yap�lmas� istenen �eyleri yapar.
	public static void ekle() { // veri taban�na bi�ey ekleyen bir metod.
		System.out.println("Eklendi");
	}

	public static void sil() { // veri taban�ndan bi�ey silen bir metod.
		System.out.println("Silindi");
	}

	public static void g�ncelle() { // veri taban�n� g�ncelleyen bir metod.(ekrana yaz edik yazd�.)
		System.out.println("G�ncellendi");
	}

	public static int topla(int sayi1, int sayi2) { // Integer bir de�er yollayan bir metod.
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) { // Veriable arguments (...) sayiler int array gibi �al���yor.
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam; //Integer bir de�er yolluyor.

	}

	public static String sehirVer() {
		return "Ankara"; //String bir veri yolluyor.
	}

}
