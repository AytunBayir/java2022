package overriding;

public  class BaseKrediManager {
	//we can prevent overriding by using "final" keyword
	public  double calculate(double total) {
		return total*1.18;
	}
}
