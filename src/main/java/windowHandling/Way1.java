package windowHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Way1 {

	public static void main(String[] args) {
		
		//get window handle
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// it will return the unique reference number of the current window 
		String currentWindow = driver.getWindowHandle();
		// we used ctrl+2 L method
		System.out.println(currentWindow);
		

	}

}
