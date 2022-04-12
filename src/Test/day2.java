package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class day2 {

	@AfterMethod
	public void AftMeth() {
		System.out.println("After Every Method XYZ");
		//Selenium
	}
	
	@Test //Adding test annotation to run test. 
	public void WebLoginCRMDashboard() {
		System.out.println("Web Dashboard is present");
		//Selenium
	}

	@Test //Second Test case
	public void MobileLoginCRMDashboard() {
		System.out.println("Mobile dashboard is present");
		//Appium 
	}
	
	@Test //Third Test case
	public void LoginAPICRMDashboard() {
		//Rest API Automation
		System.out.println("API In Dashboard");
	}

}
