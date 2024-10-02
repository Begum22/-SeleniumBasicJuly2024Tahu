package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookUrlAndLoginTest2 {
	WebDriver driver;

	// open Application
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	// do login tests
	@Test

	public void validLoginTest() {

	}

	// close the application
	@AfterMethod
	public void closeApp() {
		driver.quit();

	}
}
