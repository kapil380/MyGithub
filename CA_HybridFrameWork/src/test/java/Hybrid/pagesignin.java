package Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagesignin {

	WebDriver driver;
	public pagesignin(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//a[text()='Log In']") WebElement signup ;
	@FindBy(xpath="//form//div//input[@id='spree_user_email']")WebElement Email;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement pass;
	@FindBy(xpath="//input[@class='button primary']")WebElement login;


 
	
	public void signmanu(String email,String password) throws InterruptedException
	{
		signup.click();
		Email.sendKeys(email);
		pass.sendKeys(password);
		login.click();
		Thread.sleep(2000);
	}
}
