package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LoginPagePOM;
import pages.helper;

public class VerifySignInPOM {
	
	@Test
	public void TC()
	{
		/*
		 * System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("http://newtours.demoaut.com/");
		 */		
		WebDriver driver=helper.openBrowser();
		
		LoginPagePOM loginPage= PageFactory.initElements(driver, LoginPagePOM.class);
		loginPage.LoginApp();
		driver.close();
	}
}
