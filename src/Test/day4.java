package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	@Test(dataProvider="getData") //Adding test annotation to run test. 
	public void CRMUserList(String username, String password) {
		System.out.println("Activity List is Present");
		System.out.println("Username is: " + username + " and password is: " + password);		
	}

	@Test(groups= {"Smoke"}) //Second Test case
	public void CRMUserProfile() {
		System.out.println("Reports loaded correctly");
	}
	
	@DataProvider
	public Object[][] getData( ) {
		//1st Combination - username and password
		//2nd Comb - Wrong username and password
		//3rd Comb - Good Username and bad password
		//SOLUTION: Multi dimentional array... ROWS x COLUMN (3x2)
		Object[][] data = new Object[3][2];
		//1st Set
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		//2nd Set
		data[1][0] = "wrongusername";
		data[1][1] = "wrongpassword";
		//3rd Set
		data[2][0] = "goodusername";
		data[2][1] = "wrongpassword";
		
		return data;
	}
}
