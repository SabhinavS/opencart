package firstscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		WebElement	frm1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frm1);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("07/26/2022");
		
		String year="2023";
		String month="November";
		String day="4";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		while(true) 
		{
			//inspect element month
	String mon=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			//inspect element year
	String 	yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
		if(mon.equals(month) && yr.equals(year))
		{
			break;
		}
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		}
		
		//to get date
List<WebElement> dts =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		//x path of all date coloums rows in datepicker
for(WebElement dt:dts)
{
	if(dt.getText().equals(day))
	{
		dt.click();
		break;
	}
}

	}

}
