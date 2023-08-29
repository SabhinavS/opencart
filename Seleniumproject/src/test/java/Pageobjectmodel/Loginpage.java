package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

public	WebDriver driver;
	
	//constructor
 Loginpage(WebDriver driver) {
	this.driver=driver;
	}
	
	//locators
By img_logo=By.xpath("//div[@class='orangehrm-login-branding']");
By text_uname=By.xpath("//input[@placeholder='Username']");
By txt_pwd=By.xpath("//input[@placeholder='Password']");
By sub_button=By.xpath("//button[normalize-space()='Login']");


	//Action methods

	public void setusername(String username) {     //sends username to above locator
		driver.findElement(text_uname).sendKeys(username);
	}

	public void setpassword(String password) {
		driver.findElement(txt_pwd).sendKeys(password);
	}

	public void submit() {
		driver.findElement(sub_button).click();
	}
	
	public boolean checklogo() {
	boolean status=	driver.findElement(img_logo).isDisplayed();
		return status;
	}
	
}
