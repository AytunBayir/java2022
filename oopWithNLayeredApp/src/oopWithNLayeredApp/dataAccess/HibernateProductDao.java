package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao { //ProductDao da add2 olmad��� i�in add2 metodu kullan�lamaz olur.
	public void add(Product product) { //add fonksiypnunu kullanabilemk i�in product nesnesini  �a��rd�k
		//sadece ve sadece db eri�im kodlar� buraya yaz�l�r....SQL
		System.out.println("Hibernate ile veritaban�na eklendi");
	}

}
