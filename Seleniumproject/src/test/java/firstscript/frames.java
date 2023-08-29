package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-tree.html");
		//driver.manage().window().maximize();
	
		//using framename/id
		
	/*	driver.switchTo().frame("packageListFrame");//frame-1
		driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click(); 
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");//frame-2
		driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");//frame-3
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Overview']")).click();
	*/
		
		//using webelement
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		WebElement	frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("1111");	
		
		driver.switchTo().defaultContent();
		
		WebElement	frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("1111");	
		
		//innerframe
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//iframe[normalize-space()='Loading...']")).click();
		
		//select first radiobuttton
		driver.findElement(By.xpath("//iframe[normalize-space()='Loading...']")).click();
		
	}

}
