package oopOdev.core.logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
		// Logging codes for file
		System.out.println("Logged to File : " + data);
		
	}

}
