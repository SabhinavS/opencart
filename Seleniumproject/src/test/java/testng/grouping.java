package testng;

import org.testng.annotations.Test;

public class grouping {
//in every test methods we have to add groups and prioritize what to automate
	@Test(priority=1,groups= {"sanity","regression"})
	void loginbyfacebook() {
		 System.out.println("facebook");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginbytwitter() {
		 System.out.println("twitter");
	}
	
	@Test(priority=3,groups= {"regression"})
	void loginbyInsta() {
		 System.out.println("Insta");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void loginbyEmail() {
		 System.out.println("email");
	}
	
	@Test(priority=5,groups= {"sanity","regression"})
	void loginbygmail() {
		 System.out.println("gmail");
	}
	
}
