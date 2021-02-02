package javaDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
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
        
        try {
        	// enter last name
            driver.findElementById("createLeadForm_lastName").sendKeys("Ma");
            System.out.println("Entered last name successfully");
			
		} catch (Exception e) {
			System.err.println("Last name not entered successfully");
		}finally {
			File src = driver.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./snap/image.png");
			// will make a folder and an image file
			
			FileUtils.copyFile(src, dest);
			// this will make a copy
			
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
