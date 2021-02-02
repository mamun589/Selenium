package alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlart {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		
		String simpleAlertTxt = driver.switchTo().alert().getText();
		//if we need to get or see any text from alert, we need to create a variable (that means store this to variable)
		// ctrl+2 and L, String will come automatic because this is a String type data 
		
		System.out.println(simpleAlertTxt);
		//without sisout statement we cannot see anything in console
		
		driver.switchTo().alert().accept();
		// to press ok on alert we use this code

	}

}
