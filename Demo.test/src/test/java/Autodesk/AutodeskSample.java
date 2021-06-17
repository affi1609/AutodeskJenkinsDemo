package Autodesk;

import org.testng.annotations.Test;

public class AutodeskSample {
@Test
	
	public void sampleTest() {
		System.out.println("HI");
		String USER = System.getProperty("User");
		String BROWSER = System.getProperty("Browser");
		
		System.out.println(USER);
		System.out.println(BROWSER);
		
	}
}
