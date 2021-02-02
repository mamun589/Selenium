package javaDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnContainsEquals {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		Thread.sleep(2000);
		//this is an explicit wait(select first sleep). then import(add throws declaration). "it will give interrupted exception
		
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
        
        			// use of Equals
        String firstName = driver.findElementById("createLeadForm_firstName").getText();
        System.out.println(firstName);
        
        if (firstName.equals("Hema")) {
        	System.out.println("Name is matched");
			
		} else {
			System.out.println("Name does not macthed");
		}
        
        
        
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
