package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	void add(Product product);//bu class � implements eden di�er classlarda kullan�labilir olan metodlar� buraya tan�mlar�z(kural olarak)
}
