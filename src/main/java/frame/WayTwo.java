package frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WayTwo {

	public static void main(String[] args) {
		// using index number
		
System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		// we used 0 because there is only one frame. ( index starts from 0)
		
						//click item 1
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
		/* here we used parent to child xpath. here ol is the parent tag name, then another / for syntax,
		 then li is the child tag name, then [1] is the index for selecting the first item.
		 */
		
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
		// [3] for selecting the third item
		
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
