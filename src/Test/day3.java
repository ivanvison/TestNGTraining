package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class day3 {
	@Test //Adding test annotation to run test. 
	public void CRMActivityList() {
		System.out.println("Activity List is Present");
	}

	@Test(groups= {"Smoke"}) //Second Test case
	public void CRMReports() {
		System.out.println("Reports loaded correctly");
	}
	
	@Parameters({"URL"})
	@Test 
	public void MobileCRMReports(String urlname) {
		
		System.out.println("Mobile Rep 1 " + urlname);
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite #1");
	}
	
	@Test(dependsOnMethods={"CRMActivityList"})
	public void MobileCRMGoals() {
		System.out.println("Mobile Rep 2");
	}
	
	@Test 
	public void MobileCRMSettings() {
		System.out.println("Mobile Rep 3");
	}
	
	@Test 
	public void MobileCRMContacts() {
		System.out.println("Mobile Rep 4");
	}
	
}
