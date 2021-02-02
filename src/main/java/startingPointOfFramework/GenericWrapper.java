package startingPointOfFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods {
	
	// secondly we have to create this class
	
	ChromeDriver driver;


	public void launchBrowser(String url) {


		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		// load URL
		driver.get("http://leaftaps.com/opentaps");
		// maximize
		driver.manage().window().maximize();
		//implecitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}

	public void enterById(String locatorValue, String data) {

		driver.findElementById(locatorValue).sendKeys(data);

	}

	public void enterByName(String locatorValue, String data) {

		driver.findElementByName(locatorValue).sendKeys(data);

	}

	public void enterByXpath(String locatorValue, String data) {
		driver.findElementByXPath(locatorValue).sendKeys(data);

	}

	public void enterByClassName(String locatorValue, String data) {
		driver.findElementByClassName(locatorValue).sendKeys(data);

	}

	public void enterByLinkText(String locatorValue, String data) {
		driver.findElementByLinkText(locatorValue).sendKeys(data);

	}

	public void cssSelector(String locatorValue, String data) {
		driver.findElementByCssSelector(locatorValue).sendKeys(data);

	}

	public void enterByPartialLinkText(String locatorValue, String data) {
		driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
	}

	public void clickById(String locatorValue) {
		driver.findElementById(locatorValue).click();

	}

	public void clickByName(String locatorValue) {
		driver.findElementByName(locatorValue).click();

	}

	public void clickByCalssName(String locatorValue) {
		driver.findElementByClassName(locatorValue).click();

	}

	public void clickByXpath(String locatorValue) {
		driver.findElementByXPath(locatorValue).click();

	}

	public void selectVisibleTextById(String Id, String value) {
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);


	}

	public void selectVisibleTextByName(String Name, String value) {
		WebElement ele = driver.findElementById(Name);
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);

	}

	public void selectIndexById(String Id, int value) {
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByIndex(value);

	}

	public void selectValueById(String Id, String value) {
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByValue(value);

	}

	public void getTextById(String Id) {
		WebElement text = driver.findElementById(Id);
		System.out.println(text);


	}

	public void closeBrowser() {
		driver.close();

	}

	public void clickByLinkText(String locatorValue) {
		driver.findElementByLinkText(locatorValue).click();
		
	}

}
