package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		
		/* here we used xpath. this is a customized locator. for this, we have to go to DOM, then we take 
		 attribute i.e id and attribute value i.e username for those particular element i.e Username.
		 we have to press ctrl+f in dom so that we can write down the xpath.
		 instead of id we can use any of the attribute i.e class but in this case we have to use the
		 value of class. and everything should be 1 of 1
		 this is attribute based xpath */
		
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		// here we used different attribute i.e name and value i.e PASSWORD. and this is 1 of 1
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		 driver.findElementByLinkText("CRM/SFA").click();
		 // in case of any link normally we dont use xpath.  we goona use direct locator that is linktext
		 
		 driver.findElementByXPath("//a[text()='Leads']").click();
		 // here we used text base xpath which is based on the text of the element i.e Leads 
		 
		 driver.findElementByXPath("//a[contains(text(),'Create')]").click();
		 /* here we used partial textbase xpath. here a is tagname, contains and text is function from
		  syntax, coma, create is the partial text from create lead */
		
	}

}
