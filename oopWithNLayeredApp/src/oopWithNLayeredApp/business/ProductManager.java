package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
//import oopWithNLayeredApp.dataAccess.JdbcPoductDao;
import oopWithNLayeredApp.entities.Product;

@SuppressWarnings("unused")
public class ProductManager { //PrroductServiceImpl veya ProductService
	private ProductDao productDao;
	//private List<Logger> loggers; //array de kullanýlýr aslýnda
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers ) {
		this.productDao = productDao;
		this.loggers = loggers; 
	}


	public void add(Product product) throws Exception { //Ýþ katmanýna bir nesne geldi.
		//iþ kurallarý yazýlýyor.
		if(product.getUnitPrice()<10) {
			//10 tl den düþük fiyatlý bir ürün olamaz
			throw new Exception("Ürün fiyatý 10'dan küçük olamaz"); //throw metodu hata gönderir.
		}
		
		//JdbcPoductDao productDao = new JdbcPoductDao(); jdbc den hibernate ye geçince o classa eçtik.
		//ProductDao productDao = new HibernateProductDao();//referanslarýný tuttuðu için new dan sonra implemnt edilen her class yazýlabilir(derrs 2 deki inheritance gibi)
		productDao.add(product);//veri eriþim kodum
		//yukarddaki kod kötü kod örneði
		for (Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());
		}
	}

}
