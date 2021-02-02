package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {

	//public static void main(String[] args) {
	// we can delete main method 
	
	@Test
	// testNG starts from @ and capital letter i.e Test
	// we have to import from @Test
	
	public void browserTest() {
		// instead of main method we have to use a method
		// method name should be the same name as the class name
		// method name starts from small letter i.e browserTest()


		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
	}

}
