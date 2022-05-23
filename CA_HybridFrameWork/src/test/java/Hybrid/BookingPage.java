package Hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPage {

	WebDriver driver;
	public BookingPage(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//a[@href='/terms-of-offer-for-sale?src=g_footer']") WebElement Bed_click;
	

	public void bedlogin() throws InterruptedException
	{
		
		Bed_click.click();
		//addto_cart.click();
		Thread.sleep(1000);
		//System.out.println("addto cart"+ addto_cart.getText());
		driver.navigate().back();
		
		Helperclass.captureScreenshots(driver);

	}
}
