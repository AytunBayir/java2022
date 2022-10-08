package intro;

public class Main {
	//main java'da baþlangýç noktasýdýr.
	public static void main(String[] args) {
		
		System.out.println("Hello World!!"); // class(System) --> method(println)
		//java'da deðiþken isimlendirmeleri camelCase yazýlýr.
		String ortaMetin = "Ýlginizi çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin); // Tanýmladýðýmýz String (Metinsel) veriyi (deðiþkeni) yazdýrýdýk. 
		System.out.println(altMetin);
		//HalkBank uygulamasýndan örnekler
		@SuppressWarnings("unused")
		int vade = 12; //integer
		
		double dolarDun = 18.20; //float veya long olarak da yazýlabilirdi tutulan verilerin boyutlarý farklý durruma göre seçilir
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
		
		//Veri listeleri örnek: Banka sitesindeki çýkan seçenekler.
		// Arraylerle tutulur.
		
		String[] krediler = {"Hýzlý Kredi", "Maaþýný Halkbanktan", "Mutlu Emekli"}; // Geçek bir projede bu manuel girilen veriler DataBase den gelir.
		
		
		for (int i = 0; i < krediler.length; i++) { //.length eleman sayýsýný verir. Data base de ne kadar veri olursa olsun  bu metod ile yazdýrýlabilir.
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
