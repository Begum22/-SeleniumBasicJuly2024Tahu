package facebookInterface;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EspanolLinkTest {
	WebDriver driver;
	
	
	@BeforeTest
	public void openApplication() {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//driver.manage().window().minimize();
			//driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(12));	
		
		
	}
	
	@Test
	public void linkTest() {
		driver.findElement(By.linkText("Español")).click();
		
		//Title validation ==AsserEquals
		String ActualTitle="Facebook - Inicia sesión o registrate123";
		String expectedTitle=driver.getTitle();
		System.out.println("Developers Title:  "+expectedTitle);
		Assert.assertEquals(ActualTitle, expectedTitle);
		
	}

	//@AfterTest
	public void closeApplication() {
			driver.quit();
		
	}
	
	
}
