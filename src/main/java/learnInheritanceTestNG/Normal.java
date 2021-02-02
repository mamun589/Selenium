package learnInheritanceTestNG;

import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrapper;

public class Normal extends ProjectSpecificWrapper {

	// here we used extends because this is inheritance concept
	
	@Test
	public void normal() throws InterruptedException {
	
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

	}

}
