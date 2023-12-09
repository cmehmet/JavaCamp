package oopOdev.core.logging;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		// Logging codes for database
		System.out.println("Logged to Database : " + data);
		
	}

}
