package abstractDemo;

public class Main {

	public static void main(String[] args) {
		//strategy pattern
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();//w/o the code in line 8 we can't use the object customerManager.
		//S.O.L.I.D --> 2nd letter O is stands for open-close principle
		// 3 fundamental structures of OOP are classes, abstract classes and interfaces.
		
		
	}

}
