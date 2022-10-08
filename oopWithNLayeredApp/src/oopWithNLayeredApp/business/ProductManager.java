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
	//private List<Logger> loggers; //array de kullan�l�r asl�nda
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers ) {
		this.productDao = productDao;
		this.loggers = loggers; 
	}


	public void add(Product product) throws Exception { //�� katman�na bir nesne geldi.
		//i� kurallar� yaz�l�yor.
		if(product.getUnitPrice()<10) {
			//10 tl den d���k fiyatl� bir �r�n olamaz
			throw new Exception("�r�n fiyat� 10'dan k���k olamaz"); //throw metodu hata g�nderir.
		}
		
		//JdbcPoductDao productDao = new JdbcPoductDao(); jdbc den hibernate ye ge�ince o classa e�tik.
		//ProductDao productDao = new HibernateProductDao();//referanslar�n� tuttu�u i�in new dan sonra implemnt edilen her class yaz�labilir(derrs 2 deki inheritance gibi)
		productDao.add(product);//veri eri�im kodum
		//yukarddaki kod k�t� kod �rne�i
		for (Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());
		}
	}

}
