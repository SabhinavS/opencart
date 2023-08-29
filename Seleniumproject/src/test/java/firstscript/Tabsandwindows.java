package firstscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tabsandwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.WINDOW); //opens new Window
		driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		
		
		driver.get("https://demo.opencart.com/");

	}

}
