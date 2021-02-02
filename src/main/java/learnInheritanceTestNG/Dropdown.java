package learnInheritanceTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class Dropdown extends ProjectSpecificWrapper {

	// extends for the inheritance
		
	@Test
	public void dropdown() {
	
        
        					// dropdown "source" 
        
        WebElement source = driver.findElementById("createLeadForm_dataSourceId");
        
        /* we start this line from driver.find..., then for every dropdown we need to create object 
         that means we have to press ctrl+2 then press L. then write down the name of the object 
         for this particular element i.e source*/
         
        Select dd = new Select(source);
        /* here we have to create the variable of this particular element. Select have starts from capital S.
         then we have to import from Select. then we have pass the element with the variable i.e 
         Select(source). when we pass the variable we don't need "".*/
          
        dd.selectByVisibleText("Employee");
        // we have call with the variable i.e dd
        
        				// dropdown "Marketing Campaign"
        WebElement mktcampaign = driver.findElementByName("marketingCampaignId");
        Select dd1 = new Select(mktcampaign);
        // here we dont need to import from select again. we only need one time import
        // variable i.e dd1 should change for every different dropdown
        dd1.selectByValue("CATRQ_AUTOMOBILE");
        // here "CATRQ_AUTOMOBILE" belong to Automobile because we used value
        
        				// dromdown "Industry"
        WebElement industry = driver.findElementByXPath("//select[@id='createLeadForm_industryEnumId']");
        Select dd2 = new Select(industry);
        dd2.selectByIndex(4);
        // here we put 4 that means it gonna select Finance from the dropdown industry
        
        				// dropdown "Ownership" 
        WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
        Select dd3 = new Select(ownership);
        dd3.selectByVisibleText("Partnership");

	}

}
