package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helper {
	
	public static WebDriver openBrowser()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println("Page Title: "+driver.getTitle());
		return driver;		
	}
}
