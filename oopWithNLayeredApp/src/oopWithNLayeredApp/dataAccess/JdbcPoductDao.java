package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product; //Package import ettik. Inheritance gibi ama deðil. Katmanlý mimari. Önceki örneklerde tek katmanlý bir yapýda çalýþýyorduk.

public class JdbcPoductDao implements ProductDao { //JdbcProductDao bir ProductDao implementasyonuur yani PoductDao nun kuralarýna uymak zorunda.
	public void add(Product product) { //add fonksiypnunu kullanabilemk için product nesnesini  çaðýrdýk
		//sadece ve sadece db eriþim kodlarý buraya yazýlýr....SQL
		System.out.println("JDBC ile veritabanýna eklendi");
	}
}
//
//Hibernate çýktý ve jdbc yerine ona geçilmek istendi ne yapmalý (sürdürülebilir bir ko için).
//Tektek deðiþirmek sýkýntý.