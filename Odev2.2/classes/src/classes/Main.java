package classes;

public class Main {

	public static void main(String[] args) {
		//referance type
		CustomerManager customerManager = new CustomerManager(); //Inıtialization
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		//value type
		int sayi1 = 10;
		int sayi2 = 20 ;
		sayi2 = sayi1; // sayi2 = 10
		sayi1 = 30;  // sayi1 in değişmesi sayi2 yi değiştirmez zaten sayi2 sayi1 in önceki haline eşitlenmiştir.
		System.out.println(sayi2);
		//refeance type
		int[] sayilar1 = new int[] {1,2,3}; //int[] sayilar1 = {1,2,3} şeklinde de yazılabilir.
		int[] sayilar2 = new int[] {4,5,6}; //Arrayler referans tiptir.
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
	}

}
