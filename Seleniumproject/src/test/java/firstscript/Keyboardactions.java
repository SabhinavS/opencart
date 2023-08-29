package firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();

driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hi how are you doing");
Actions act=new Actions(driver);	

//Ctrl+A
act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

//keydown presses and holds the cntrl and keysup releases the ctrl button

//CTRL C
act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

//Tab
//act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
act.sendKeys(Keys.TAB).perform();  //to click singlekey


//CTRL+V
act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();



	}

}
