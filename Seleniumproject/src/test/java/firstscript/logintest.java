package firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	public static void main(String[] args) throws InterruptedException {
		
//	WebDriverManager.chromedriver().setup();  //old approach

		
		//launch browser
		//ChromeDriver driver=new ChromeDriver();	//launch driver
		WebDriver driver=new ChromeDriver();  //working on multiple browsers
		
	//open url on browser
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	//provide username approach-1
	//WebElement text=driver.findElement(By.name("username"));
	//text.sendKeys("Admin");
	
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	driver.findElement(By.name("password")).sendKeys("admin23");
	
	//submit and click then Login to page
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	//Verify title of webpage
/*	String act_title=driver.getTitle();
	String exp_title="OrangeHRM";
	
	if(act_title.equals(exp_title))
	{
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
	
	//Close the driver
	driver.quit(); */

	//verify with invalid credentials dashboard xpath
	String db="";
try {
	db=driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
}
	catch(NoSuchElementException e){
		
	}

String ep_lable="Dashboard";
	
	if(db.equals(ep_lable))
	{
	System.out.println("Passed");	
	}
	else
	{
		System.out.println("failed");	
	}
	driver.quit();
	
	}
   

}
