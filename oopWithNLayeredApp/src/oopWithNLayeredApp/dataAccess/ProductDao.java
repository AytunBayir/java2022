package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	void add(Product product);//bu class ý implements eden diðer classlarda kullanýlabilir olan metodlarý buraya tanýmlarýz(kural olarak)
}
