package firstscript;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class netflixpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.netflix.com/in/login");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).sendKeys("dragonkings411@gmail.com");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]/input[1]")).sendKeys("Abhi2023n@v");
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/button[1]")).click();
	}

}
