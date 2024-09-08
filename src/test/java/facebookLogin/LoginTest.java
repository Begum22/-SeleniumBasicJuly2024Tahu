package facebookLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	void titleTest() {
		String ActualTitle ="Connect friends";
		String expectedTitle = driver.getTitle();
		System.out.println("facebook title is:  " +expectedTitle);
		
		//validation/ assertion --> actual does it match with expected
		Assert.assertEquals(ActualTitle, expectedTitle, "Reasons for failing>>>>");
		
		

	}
	
	@Test
	public void urlTest() {
		String actualUrl = "https://www.facebook.com/";
		String expectedUrl = driver.getCurrentUrl();
		System.out.println("Facebook URL is " + expectedUrl);
		Assert.assertEquals(actualUrl, expectedUrl, "Reasons for failing >>>> ");
	}
	
	@AfterTest
	public void closeApp() {
		driver.quit();
		
		
		
	}
	
	
	
}
