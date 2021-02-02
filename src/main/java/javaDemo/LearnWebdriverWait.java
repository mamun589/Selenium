package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebdriverWait {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
        driver.findElementByLinkText("CRM/SFA").click();
        
        driver.findElementByLinkText("Leads").click();
        
        driver.findElementByLinkText("Create Lead").click();
        
        // enter company name
        driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
        
        					// use of web driver wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        // import
        // pass the driver inside the function as an argument
        // 15 second
        
        wait.until(ExpectedConditions.elementToBeClickable(By.id("createLeadForm_firstName")));
        // "createLeadForm_firstName" id value of the first name field
       
        
        // enter first name
        driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
        
        // enter annual revenue
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("100");
        
        //enter description
        driver.findElementById("createLeadForm_description").sendKeys("Software Testing");
        
        //click create lead
        driver.findElementByClassName("smallSubmit").click();
        
        // click request catalog using partial linktext
        driver.findElementByPartialLinkText("Request").click();
       
		driver.close();
		

	}

}
