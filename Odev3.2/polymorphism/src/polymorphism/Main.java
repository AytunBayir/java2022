package polymorphism;

public class Main {

	public static void main(String[] args) {
		// plug and play (tak calistir)
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger() };
		for (BaseLogger logger : loggers) {
			logger.log("Log mesaji");
		}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
