package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paralleltesting {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {
		
		if(br.equals("chrome")) {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			  driver=new EdgeDriver();
		}
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("https://opensource-demo.orangehrmlive.com");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testlogo()
	{
		try {
boolean status=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
	Assert.assertEquals(status, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	void testpagetitle() {
	Assert.assertEquals(driver.getTitle(), "OrangeHRM","Titles are not matched");	
	}
	
	@AfterClass
	void closeapp() {
				driver.quit();
	}
}
