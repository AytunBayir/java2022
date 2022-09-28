package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(); // sayiBulmaca methodunu oluþturarak Main nin içerisine çaðýdýk.
	}

	// Fonksiyon yazarak kendimizi tekrarlamaktan kurtarmýþ oluruz.
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
			mesajVer("Sayi bulunamadý: " + aranacak);// String veriyi fonksiyona yolluyor.
		}
	}
	/*
	 * public void mesajVer(int aranacak) { //Parametreli metod.
	 * System.out.println("Sayi bulundu: "+aranacak); }
	 */

	public static void mesajVer(String mesaj) { // Parametreli metod. Daha dinamik bir yapýda.
		System.out.println(mesaj);
	}

}
