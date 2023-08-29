package firstscript;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		//prints no of checkboxes
	List<WebElement> checkboxes=  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("size of checkbox is " +checkboxes.size());
		
		//select 2 checkboxes
	/*	for(int i=0;i<checkboxes.size();i++)
		{
			
		if(i<2)
		{
			checkboxes.get(i).click();	
		}*/


		
		
/*	for(int i=0;i<checkboxes.size();i++)  //selects all checkboxes
		{
			checkboxes.get(i).click();	
			
		}*/


		
	for(int i=0;i<2;i++)   //selects 3 checkboxes
		{
			checkboxes.get(i).click();	
		}

	Thread.sleep(5000);
		//enhanced for loop
		for(WebElement ckb:checkboxes)  //unselect checkboxes
		{
		if(ckb.isSelected())
		{
		ckb.click();
		}
		
		
		}
	
	}
}


