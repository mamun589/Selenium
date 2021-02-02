package alart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromtAlert {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		Alert promtAlert = driver.switchTo().alert();
		System.out.println(promtAlert.getText());
		
		Thread.sleep(3000);
		
		promtAlert.sendKeys("i got the result");
		
		Thread.sleep(3000);
		
		promtAlert.accept();
		//promtAlert.dismiss();
		
		System.out.println(driver.findElementById("result").getText());
		//this line is only to see the result. we find the element here, get the text and print over here all together
		// this is a smart technique
	
	}

}
