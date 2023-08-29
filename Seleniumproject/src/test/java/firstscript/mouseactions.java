package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://demo.opencart.com/");
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();

		/*	
	WebElement desktop=	driver.findElement(By.xpath("(//a[normalize-space()='Desktops'])[1]"));
	WebElement mac=	driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
	//to call mouse actions we have to create object 
	Actions act=new Actions(driver);
	
	//to perform mouse over "build" method create action "perform" completes the action
	
	act.moveToElement(desktop).moveToElement(mac).click().build().perform();
	
	//to perform right click we have to use contextclick();
	
	write webelement
	
	act.contextClick(desktop).build().perform();
	
	//write webelement
	*/
	driver.switchTo().frame("iframeResult");
	
WebElement f1=	driver.findElement(By.xpath("//input[@id='field1']"));
	f1.clear();
	f1.sendKeys("Welcome");

WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

	Actions act=new Actions(driver);
	act.doubleClick(button).perform();
	
WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
String copiedtext=	f2.getAttribute("value");
System.out.println("the value is " +copiedtext);

	if(copiedtext.equals("Welcome"))
	{
	System.out.println("test is passed");
	}
	else
	{
		System.out.println("test is failed");
	}
}
	}


