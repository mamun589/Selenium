package wrapperForParameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapperForParameter {
	
	// here we used before and after method so that we can use publicly
	
		public ChromeDriver driver;
		//here in this area is called class level
		// here we have to declare ChromeDriver publicly so that any sub class can access
		
		@Parameters({"url","uname","pwd"})
		// this name i created in testingParameters.xml file
		
		@BeforeMethod
		public void login(String url, String uname,  String pwd) throws InterruptedException {
		// this names we have to pass here as an arguments in String
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			// because of ChromeDriver we used publicly thats why we cut from here
			
			driver.get(url);
			// used the name instead of full url address

			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			Thread.sleep(2000);
			
			driver.findElementById("username").sendKeys(uname);
			// used the name instead DemoSalesManager
			
			driver.findElementById("password").sendKeys(pwd);
			// used the name instead of password crmsfa
			
			driver.findElementByClassName("decorativeSubmit").click();
			
	        driver.findElementByLinkText("CRM/SFA").click();
	         
	        driver.findElementByLinkText("Leads").click();
	        
	        driver.findElementByLinkText("Create Lead").click();
			
		}
		
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
		
		@DataProvider
		// DataProvider is the annotation for Dynamic data
		//import
		
		public String[][] getData() {
			//public void getData() { this is how we have write down first
			// public String[][] getData() { this is how it is after import
			// getData is the method name
			
			String [][] data = new String[2][3];
			// data is the object name
			// String [][] this is how we declare two dimension array
			// String[2][3] means we want to use 2 row and 3 column 
			
			data [0][0] = "TCS"; //using indexing, row 1 column 1
			data [0][1] = "Mamun"; // row 1 column 2
			data [0][2] = "Rahman"; // row 1 column 3
			
			data [1][0] = "ABC"; // row 2 column 1
			data [1][1] = "Hello"; // row 2 column 2
			data [1][2] = "Hi"; // row 2 column 3
			
			return data;
			// data is the object
			// here we have to import return type then void will change to String[][]
			// Check screenshot before and after import
		}

	}

