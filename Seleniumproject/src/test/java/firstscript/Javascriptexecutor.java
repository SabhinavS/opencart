package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	//	driver.switchTo().frame(0);
		
		//typecasting assigning JSexecutor to driver

		JavascriptExecutor js=(JavascriptExecutor) driver;
	
		//Sending input without using sendkeys
		WebElement inputbox=driver.findElement(By.id("name"));
		js.executeScript("arguments[0].setAttribute('Value','john')",inputbox);
		
		//selecting radiobutton
		WebElement	male_Rd=driver.findElement(By.id("male"));
		//male_Rd.click();  //ClickInterceptedException
		js.executeScript("arguments[0].click();",male_Rd);
		
		//Checkbox
		WebElement chkbox=driver.findElement(By.id("monday"));
		js.executeScript("arguments[0].click();",chkbox);

		//Button
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']"));
		js.executeScript("arguments[0].click();",button);

	
	}
	

}
