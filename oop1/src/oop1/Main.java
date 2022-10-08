package oop1;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String mesaj = "Vade oran�";

		Product product1 = new Product(); // �r�n� tan�mlamak i�in olu�turdu�umuz class. ��erisinde �ablonunu
										  // olu�turudu�umuz �zellikleri bar�nd�ran bir class.
		product1.setName("Delonghi Kahve Makinesi");  
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
	
		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");  
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		
		product3.setName("Kitchen Kahve Makinesi");  
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");
        
			
		// Bir �ok �r�n� ayn� anda g�stermek istersek. Classlar� array i�erisinde de
		// tutabiliriz
		
		Product[] products = {product1,product2,product3};
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>"+ product.getName() +"</li>");
		}
		System.out.println("</ul>");
		
		/*for (int i = 0; i < products.length; i++) {
			Product product = products[i];
			System.out.println("<li>"+ product.getName() +"/li");
			
		}*/
		//Inheritance
		IndividualCustomer individualCustomer =  new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("1254654");
		individualCustomer.setCustomerNumber("1654134");
		individualCustomer.setFirstName("Abuzer");
		individualCustomer.setLastName("Kaday�f");
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("Itune.co");
		corporateCustomer.setPhone("1646546165");
		corporateCustomer.setTaxNumber("4645164");
		
		@SuppressWarnings("unused")
		Customer[] customers = {individualCustomer, corporateCustomer}; // Farkl� tipte olmas�na ra�men hata almamam�z�n sebebi extends ifadesi ile hem bieysel hem de 
		                                                                //kurumsal m��terilerin m��teri olmas�d�r.
		
	}

}
