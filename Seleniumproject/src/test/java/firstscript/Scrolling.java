package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)", "");
		
		//scroll to till element is present
	WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of Niger']"));
		js.executeScript("arguments[0].scrollIntoView();", flag);
	
		//scroll to end of page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll to top of page
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
	}

}
