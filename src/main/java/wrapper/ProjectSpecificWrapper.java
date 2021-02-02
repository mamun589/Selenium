package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper {
	
	// here we used before and after method so that we can use publicly
	
	public ChromeDriver driver;
	//here in this area is called class level
	// here we have to declare ChromeDriver publicly so that any sub class can access

	@BeforeMethod
	public void login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		// because of ChromeDriver we used publicly thats why we cut from here
		
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
        driver.findElementByLinkText("CRM/SFA").click();
         
        driver.findElementByLinkText("Leads").click();
        
        driver.findElementByLinkText("Create Lead").click();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
