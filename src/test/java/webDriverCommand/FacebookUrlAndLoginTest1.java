package webDriverCommand;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookUrlAndLoginTest1 {

		WebDriver driver;

	    //open application
		@BeforeTest
		public void openApp() {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			//driver.manage().window().minimize();
			//driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(12));	}

		// do login tests
	 @Test

		 void validLoginTest() {
			driver.findElement(By.id("email")).sendKeys("u@umail.com");
			//driver.findElement(By.id("email")).sendKeys("jkbvghjh");
			driver.findElement(By.name("pass")).sendKeys("nnnnnnjj");
			driver.findElement(By.name("login")).click();
			
			//validation
			// expected = actual==pass
			// expected != actual==fail
			//Requirement gives you this
			String actualTitle="Log into Facebook/Asma";
			//Developer build this machine gets from selenium
			String expectedTitle=driver.getTitle();
			
			Assert.assertEquals(expectedTitle,actualTitle, "Reasons for failing");
			Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
		}
		
		@Test
		private void invalidLoginTest() {
			driver.findElement(By.id("email")).sendKeys("ki@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("fffffffff");
			driver.findElement(By.name("login")).click();
			//not equal
			String actualTitle="Log into Facebook";
			String expectedTitle=driver.getTitle();
			
			Assert.assertNotEquals(actualTitle,expectedTitle);
			Assert.assertFalse(actualTitle.equals(expectedTitle));
		}
			
		

		// close the application
		//@AfterTest
		public void closeApp() {
			driver.quit();

		}

}
