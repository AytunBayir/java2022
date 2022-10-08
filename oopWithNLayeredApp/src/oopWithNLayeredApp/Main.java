package oopWithNLayeredApp;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcPoductDao;
import oopWithNLayeredApp.entities.Product;

@SuppressWarnings("unused")
public class Main { //Interface main olsun.

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone Xr", 10000);//kullanýcýdan veri alýndý
		
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);//Interface ile etkileþime eçildi
		productManager.add(product1);//kontrolden sonra uygunsa businessdan dataaccses e gönerildi

	}

}
