package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTestTwo {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	
		// every word should start with small letter
		
		ChromeDriver driver = new ChromeDriver();
		
		//className object = new className(); this is for creating object
		// Chrome from ChromeDriver should start with capital letter because this is a class
		// we have to import from ChromeDriver after creating object
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		// we use get method for loading url
		
		driver.manage().window().maximize();
		// this is for maximizing window
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//implicitly wait. this is an indirect wait. it will give "no such element exception"
		// this is applicable for every step which starts from driver.
		Thread.sleep(2000);
		//this is an explicit wait(select first sleep). then import(add throws declaration). "it will give interrupted exception
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// here we used "" because this a string types data and we use sendkeys for inserting something
		//here whatever we put, this is called test data i.e DemoSalesManager
		// whatever we copy from DOM, that is called locator value i.e username 
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		// here we used click() function because this is a click
		
        driver.findElementByLinkText("CRM/SFA").click();
        // here we used CRM/SFA because this is a text belong to this link. we dont use link, we use linktext
        
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
        
        //click create lead
        driver.findElementByClassName("smallSubmit").click();
        
        // click request catalog using partial linktext
        driver.findElementByPartialLinkText("Request").click();
        // here full text is Request Catalog but we used request only because we are using partial link text
		
		driver.close();
		// this is for closing browser

	}

}
