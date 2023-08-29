package firstscript;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				//Declaring implicit wait
				//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
				//declaring explicit wait
				WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				
						
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
							
				WebElement useranme=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
				useranme.sendKeys("Admin");
				
				
				WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
				password.sendKeys("admin123");
			
			}

		
		
		
		
		
		
	}


