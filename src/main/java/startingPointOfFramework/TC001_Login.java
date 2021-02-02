package startingPointOfFramework;

import org.testng.annotations.Test;

public class TC001_Login extends GenericWrapper {
	
	// thirdly we have to create this executable class
	
    @Test
	
	public void login() {
		
		launchBrowser("http://leaftaps.com/opentaps");
		
		
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByCalssName("decorativeSubmit");
		clickByLinkText("CRM/SFA");
		
		
	}

}
