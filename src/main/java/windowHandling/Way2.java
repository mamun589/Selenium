package windowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Way2 {

	public static void main(String[] args) {
		 
		//get window handles
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Try it Yourself »").click();
		
		Set<String> allWinRef = driver.getWindowHandles();
		// if we use ctrl+2 L then set will come automatic
		
		//System.out.println(allWinRef);
		
		for (String eachWinRef : allWinRef) {
			System.out.println(eachWinRef);
			driver.switchTo().window(eachWinRef);
			//this will transfer the control from first window two second window
			System.out.println(driver.getTitle());
			// it will print only title of the both window
		}
		

	}

}
