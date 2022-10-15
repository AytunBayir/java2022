package staticDemo;

public class DatabaseHelper {
	public static class Crud { // Create Read Update Delete
		public static void delete() {

		}

		public static void update() {

		}
	}
	public static class Connection{
		public static void createConnection() {

		}
	}
	//Single responsibilty prensibine aykiri bir kullanim. Ayri ayri yani DatabaseHelperCrud ve DataBaseHelperConnection olarak 2 class yapmak daha dogru bir kullanim. 
}
