package firstscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
	
		//dropdown with select tag
 WebElement drp=	driver.findElement(By.xpath("//select[@class='custom-select']"));
	Select drpdn=new Select(drp);
	
		//1.selecting option from dropdown by visibletext
	/*drpdn.selectByVisibleText("Italy");*/
	
	
	//2.selecting option from dropdown by value tag in html
	//drpdn.selectByValue("10");   
	
	//get no of options in dropdown
	List<WebElement> options=drpdn.getOptions();
	System.out.println("total no of options" +options.size());
	
	//print options
/*or(int i = 0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
	*/
	
	//enhanced for loop
	for(WebElement op:options)
	{
	     System.out.println(" options "+op.getText());
	}
	}

}
