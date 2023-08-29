package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ThirdTest {
	//Suite>>test>>classes>>methods
    //Annotations before class after class //mostly used
    //before method after method  //mostly used
    //Before test after test
    //Before suite after suite
	
      WebDriver driver;

      @BeforeMethod
      public void setUp() {
          System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\Public\\Desktop\\Google Chrome.lnk\"");
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://www.netflix.com/in/Login");
      }

      @Test
      public void testLogin() {
          // Enter your Gmail credentials
          String username = "abhinavsabhis@gmail.com";
          String password = "Abhi2023n@v";

          // Locate and interact with the email and password fields
          driver.findElement(By.xpath("//input[@id='id_userLoginId']")).sendKeys(username);
         
          driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys(password);
          driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

          // Wait for the Gmail inbox page to load
      //    driver.findElement(By.cssSelector(".nU.n1")).isDisplayed();

          // Assert that the Gmail inbox is loaded after successful login
         // Assert.assertTrue(driver.getCurrentUrl().contains("inbox"), "Login Failed!");
      }

      @AfterMethod
      public void tearDown() {
          driver.quit();
      }
  }

