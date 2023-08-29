package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {
	
	@BeforeClass    
	//Method executes multiple times before test
	//Class executes only once before test
	void login() {
		System.out.println("login....");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("Search....");
	}
	
	@Test(priority=2)
	void advancesearch() {
		System.out.println("Advancesearch....");
	}
	
	@AfterClass 
	//Method executes multiple times after test
	//Class executes only once after test
	void logout() {
		System.out.println("logout....");
	}
	
}
