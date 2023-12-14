package oopWithNLayeredAppHomework.core.logging;

public class MailLogger implements ILogger {

	@Override
	public void log(String data) {
		// Logging codes for mail
		System.out.println("Logged to Mail : " + data);
		
	}

}
