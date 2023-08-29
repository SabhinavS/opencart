package Pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest  {
	
	WebDriver driver;
	//Loginpage lp;
	
	Pagefactory lp;
	
	@BeforeClass
	void setup() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testlogo() {
		//lp=new Loginpage(driver);
		lp=new Pagefactory(driver);
		Assert.assertEquals(lp.checklogo(), true);
	}
	
	
	@Test(priority=2)
	void testlogin() {
		lp.setusername("admin");
		lp.setpassword("Admin123");
		lp.submit();
		
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");	
	}
	
	
	@AfterClass
	void teardown( ) {
		driver.close();
	}
	
	
}
