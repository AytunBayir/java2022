package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao { //ProductDao da add2 olmadýðý için add2 metodu kullanýlamaz olur.
	public void add(Product product) { //add fonksiypnunu kullanabilemk için product nesnesini  çaðýrdýk
		//sadece ve sadece db eriþim kodlarý buraya yazýlýr....SQL
		System.out.println("Hibernate ile veritabanýna eklendi");
	}

}
