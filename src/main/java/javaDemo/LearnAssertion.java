package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LearnAssertion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "Asserting the Title");
		// Google is the title of google first page
		// Assertion the title is the msg as our wish
		
		//Assert.assertEquals(title, "Goople", "Asserting the Title");
		// testing false with goople
		
		boolean searchBox = driver.findElementByClassName("q").isDisplayed();
		// q is the name value in the search box field
		// is displayed is a method which return true or false
		
		Assert.assertTrue(searchBox, "varifying if the search box is displayd");
		

	}

}
