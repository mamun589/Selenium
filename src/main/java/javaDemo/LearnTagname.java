package javaDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTagname {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List inputList = driver.findElementsByTagName("input");
		// find elements
		
		int total = inputList.size();
		
		System.out.println(total);
		
				// another way
		
		List inputList2 = driver.findElementsByTagName("input");
		
		System.out.println(inputList2.size());

	}

}
