package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory {
public	WebDriver driver;
	
	//constructor
Pagefactory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	//locators pagefactory approach
	@FindBy(xpath="//div[@class='orangehrm-login-branding']") 
	WebElement img_logo;
	@FindBy(xpath="//input[@placeholder='Username']") 
	WebElement text_uname;
	@FindBy(xpath="//input[@placeholder='Password']") 
	WebElement txt_pwd;
	@FindBy(xpath="//button[normalize-space()='Login']") 
	WebElement sub_button;

	//Action methods

	public void setusername(String username) {     //sends username to above locator
(text_uname).sendKeys(username);
	}

	public void setpassword(String password) {
		(txt_pwd).sendKeys(password);
	}

	public void submit() {
	(sub_button).click();
	}
	
	public boolean checklogo() {
	boolean status=(img_logo).isDisplayed();
		return status;
	}
	
}


