package interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	//constructor
	public CustomerManager(ICustomerDal customerDal){
		this.customerDal=customerDal;
	}
	public void add() {
		// business codes(logic tier)
		customerDal.add();
	}
}
