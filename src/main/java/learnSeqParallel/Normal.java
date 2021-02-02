package learnSeqParallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Normal {

	
	@Test
	public void normal() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
	
		
		ChromeDriver driver = new ChromeDriver();
		
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
        
        // enter company name
        driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
        
        // enter first name
        driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
        
        // enter last name
        driver.findElementById("createLeadForm_lastName").sendKeys("Ma");
        
        // enter annual revenue
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("100");
        
        //enter description
        driver.findElementById("createLeadForm_description").sendKeys("Software Testing");
        
        driver.close();

	}

}
