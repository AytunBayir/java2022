package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(); // sayiBulmaca methodunu olu�turarak Main nin i�erisine �a��d�k.
	}

	// Fonksiyon yazarak kendimizi tekrarlamaktan kurtarm�� oluruz.
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 4;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi bulundu: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi bulunamad�: " + aranacak);// String veriyi fonksiyona yolluyor.
		}
	}
	/*
	 * public void mesajVer(int aranacak) { //Parametreli metod.
	 * System.out.println("Sayi bulundu: "+aranacak); }
	 */

	public static void mesajVer(String mesaj) { // Parametreli metod. Daha dinamik bir yap�da.
		System.out.println(mesaj);
	}

}
