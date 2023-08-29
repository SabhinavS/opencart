package firstscript;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//System.out.println("the current title is "+driver.getTitle());
	//System.out.println("the current url is " +driver.getCurrentUrl());
	//String ps=driver.getPageSource();
	//System.out.println(ps.contains("html"));
	//System.out.println(driver.getWindowHandles());
	
	Thread.sleep(3000);
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String> windowsid=driver.getWindowHandles();
	
	for(String winid:windowsid)
	{ 
		System.out.println(winid);	
	}
	
	}

}
