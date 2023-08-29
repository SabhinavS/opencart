package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.Basepage;

public class testcase3  extends Basepage{

	public testcase3(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@Test
public void method() {
	int x=10;
	System.out.println(x);
}
	
}

