package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOn {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement content = driver.findElementByClassName("menulink");
		// we have create a variable using ctrl+2 L and content is element name
		
		Actions action = new Actions(driver);
		/* we have to create an of Actions class. then we have to import from Actions because any time we
		we create an object have to import from there. then we have to pass the driver inside the
		Actions function*/
		
		action.moveToElement(content).perform();
		// any time we call a method i.e move to element by using object. 
		// then we have to pass the web element i.e content here
		
							// click on Articles
		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
		//here we used text base xpath but there are three menu thats why we used collection xpath
		
		driver.close();
		
	}

}
