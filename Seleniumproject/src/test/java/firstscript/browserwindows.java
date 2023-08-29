package firstscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		//capture id's of windows
		
	Set<String> ids=driver.getWindowHandles(); 

	//we cannot retreve in the set so we have to convert to list
	/*
	List <String> windowsids=new ArrayList(ids);
	
	String parentid=windowsids.get(0); //parentid
	String childid=windowsids.get(1); //childid

//now switch to childid
	driver.switchTo().window(childid);
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM']")).click();
	
	*/
for(String windowid:ids)
{
String title=	driver.switchTo().window(windowid).getTitle();
	
	if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
		driver.findElement(By.xpath("//button[normalize-space()='Try it for Free']")).click();
			}
			
}
	}

}
