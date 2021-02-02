package parametarization;

import org.testng.annotations.Test;

import wrapperForParameters.ProjectSpecificWrapperForParameter;

public class LoginStaticParameters extends ProjectSpecificWrapperForParameter {
	
	@Test(dataProvider = "getData")
	// here dataProvider is the attribute, we can use any name instead of dataProvider
	// getData is the method name in super class inside of DataProvider annotation
	// check screenshot "main"
	
	public void loginStaticParameters(String cName, String fName, String lName) {
	// we we have to create argument to to run from super class
	// we can use name instead of cName, fName, lName
	
	        // enter company name
	        driver.findElementById("createLeadForm_companyName").sendKeys(cName); // passed as an argument
	        
	        // enter first name
	        driver.findElementById("createLeadForm_firstName").sendKeys(fName); // passed as an argument
	        
	        // enter last name
	        driver.findElementById("createLeadForm_lastName").sendKeys(lName); // passed as an argument
	        
	        // enter annual revenue
	        driver.findElementById("createLeadForm_annualRevenue").sendKeys("100");
	        
	        //enter description
	        driver.findElementById("createLeadForm_description").sendKeys("Software Testing");
	        
	        //click create lead
	        //driver.findElementByClassName("smallSubmit").click();
	        
	        // click request catalog using partial linktext
	       // driver.findElementByPartialLinkText("Request").click();
	        // here full text is Request Catalog but we used request only because we are using partial link text
			
			//driver.close();
			// this is for closing browser
	}

}
