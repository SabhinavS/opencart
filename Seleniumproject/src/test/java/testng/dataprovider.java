package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	
	WebDriver driver;
	
	@BeforeClass
	void login()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp")
	void test(String Email, String Password)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(Email);
		
WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys(Password);
		
		

driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String exp_title = "OrangeHRM";
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
	}
	
	@AfterClass
	void logout()
	{
driver.close();
	}
	
	@DataProvider(name="dp",indices= {0,2}) //indices run only value which we want to run 0,2 indexvalues
	
	String[][] logindata()
	{
		String data[][]= {   //this data should come from excel
			
				{"xyz","234"},  //tests multiple data
				{ "dragonkings411@gmail.com", "Abhi321n@v" },
				{ "Admin", "admin123" },
				{ "pavanoltraining@gmail.com", "test@123" } ,
				{ "pavanoltraining@gmail.com", "test3" },
				{ "pavanoltraining@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test@123" }
					};
		return data;
	}
	
}
