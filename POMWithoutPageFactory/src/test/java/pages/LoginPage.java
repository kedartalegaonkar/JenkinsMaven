package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	By username= By.name("userName");
	By password= By.name("password");
	By loginBtn= By.name("login");
	
	 public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
	}
		
	public void LoginApp() 
	{
		driver.findElement(username).sendKeys("kedar");
		driver.findElement(password).sendKeys("kedar");
		driver.findElement(loginBtn).click();
	}

}
