package firstscript;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver=new ChromeDriver();	
	driver.get("http://demo.nopcommerce.com/register");
	driver.manage().window().maximize();
		
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	System.out.println(" Logo is present " +logo.isDisplayed());
	
	WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	System.out.println	("enable status" +searchbox.isEnabled());
	System.out.println	("enable status" +searchbox.isDisplayed());

	WebElement male_rd=	driver.findElement(By.xpath("//input[@id='gender-male']"));

	WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
	//System.out.println("Selection status is "+male_rd.isSelected());
	//System.out.println("Selection status is "+female_rd.isSelected());
	male_rd.click();
	System.out.println("Selection status is "+male_rd.isSelected());
	System.out.println("Selection status is "+female_rd.isSelected());
	}

}
