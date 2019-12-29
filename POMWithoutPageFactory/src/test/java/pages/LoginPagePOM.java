package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPagePOM {
	
	@FindBy(name="userName") 
	WebElement userName;
	
	@FindBy(name="password") 
	WebElement passWord;
	
	@FindBy(name="login") 
	WebElement loginBtn;
	
	public void LoginApp() 
	{
		Assert.assertTrue(loginBtn.isDisplayed());
		userName.sendKeys("kedar");
		passWord.sendKeys("kedar");
		loginBtn.click();
		System.out.println("User Login successful.");
		
	}

}
