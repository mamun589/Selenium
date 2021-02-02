package advanceUserInteraction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		// because this is inside a frame and we used indexing method for switching frame
		
		WebElement drag = driver.findElementById("draggable");
		WebElement drop = driver.findElementById("droppable");
		// we find element here by id locator. and created webelement 
		
		Actions action = new Actions(driver);
		// created aa object i.e action for the class Actions
		// import from Actions as always
		// and pass the driver
		
		action.contextClick(drag).perform();
		// used context click method for right click
		// passed the web element where to right click
		
		driver.close();

	}

}
