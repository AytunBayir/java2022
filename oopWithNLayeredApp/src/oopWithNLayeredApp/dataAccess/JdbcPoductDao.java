package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product; //Package import ettik. Inheritance gibi ama de�il. Katmanl� mimari. �nceki �rneklerde tek katmanl� bir yap�da �al���yorduk.

public class JdbcPoductDao implements ProductDao { //JdbcProductDao bir ProductDao implementasyonuur yani PoductDao nun kuralar�na uymak zorunda.
	public void add(Product product) { //add fonksiypnunu kullanabilemk i�in product nesnesini  �a��rd�k
		//sadece ve sadece db eri�im kodlar� buraya yaz�l�r....SQL
		System.out.println("JDBC ile veritaban�na eklendi");
	}
}
//
//Hibernate ��kt� ve jdbc yerine ona ge�ilmek istendi ne yapmal� (s�rd�r�lebilir bir ko i�in).
//Tektek de�i�irmek s�k�nt�.