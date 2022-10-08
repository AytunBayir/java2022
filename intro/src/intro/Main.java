package intro;

public class Main {
	//main java'da ba�lang�� noktas�d�r.
	public static void main(String[] args) {
		
		System.out.println("Hello World!!"); // class(System) --> method(println)
		//java'da de�i�ken isimlendirmeleri camelCase yaz�l�r.
		String ortaMetin = "�lginizi �ekebilir";
		String altMetin = "Vade S�resi";
		
		System.out.println(ortaMetin); // Tan�mlad���m�z String (Metinsel) veriyi (de�i�keni) yazd�r�d�k. 
		System.out.println(altMetin);
		//HalkBank uygulamas�ndan �rnekler
		@SuppressWarnings("unused")
		int vade = 12; //integer
		
		double dolarDun = 18.20; //float veya long olarak da yaz�labilirdi tutulan verilerin boyutlar� farkl� durruma g�re se�ilir
		double dolarBugun = 18.20;
		
		@SuppressWarnings("unused")
		boolean dolarDustuMu = true;
		
		String okYonu = "";
 
		if (dolarBugun<dolarDun) {  
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun==dolarDun){
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		//Veri listeleri �rnek: Banka sitesindeki ��kan se�enekler.
		// Arraylerle tutulur.
		
		String[] krediler = {"H�zl� Kredi", "Maa��n� Halkbanktan", "Mutlu Emekli"}; // Ge�ek bir projede bu manuel girilen veriler DataBase den gelir.
		
		
		for (int i = 0; i < krediler.length; i++) { //.length eleman say�s�n� verir. Data base de ne kadar veri olursa olsun  bu metod ile yazd�r�labilir.
			System.out.println(krediler[i]);
				
		}
		
		 String[][] sehirler = new String[3][3];
	     sehirler[0][0] = "Istanbul";
         sehirler[0][1] = "Bursa";
         sehirler[0][2] = "Bilecik";
         sehirler[1][0] = "Ankara";
         sehirler[1][1] = "Konya";
	     sehirler[1][2] = "kayseri";
         sehirler[2][0] = "Diyarbakir";
         sehirler[2][1] = "Sanliurfa";
	     sehirler[2][2] = "Gaziantep";

	     for(int i=0;i<=2;i++){
	         System.out.println("--------------");
	            for (int j = 0; j <= 2; j++){
	                System.out.println(sehirler[i][j]);
	            }
	        }
		
	}

}
