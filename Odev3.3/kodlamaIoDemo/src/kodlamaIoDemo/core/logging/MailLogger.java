package kodlamaIoDemo.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged to the e-mail adress: " + data);
		
	}

}
