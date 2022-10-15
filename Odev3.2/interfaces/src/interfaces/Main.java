package interfaces;

public class Main {
	// A class can implement more than one interfaces unlike abstract classes.
	// A class can inherit only one class.
	// An interface can only hold a reference
	public static void main(String[] args) {
		/*
		 * ICustomerDal customerDal = new MySqlCustomerDal(); 
		 * customerDal.add();
		 */
		//if you use strategy design pattern you should add the code at the line 15.
		//W/ this code we used interfaces w/ polymorphism
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal = new SqlServerDal();
		customerManager.add();
		
	}

}
