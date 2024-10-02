package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class DirectLocators extends BaseTestWithIfAndElse{
	
	/*
	 *  two test design -- beforemethod  --- more popular -- one window all test cases are here-- open once, close once-- saves time on opening & closing
	 *  								 before test --- less popular --open & close after each test case -- takes extra time
	 */
	                                   
	@BeforeTest
	@BeforeMethod
	public void openFacebook() {
				openApplication();
	}
// Direct locator know-- 1. tag  2. attributes  3. value
	@Test
	public void loginTest() {
		driver.findElement(By.id("email")).sendKeys("lklkjjj");
		driver.findElement(By.id("login")).click();
	}
	
	@Test
	public void linkTest() {
		
		/*
		 * link start with <a herf
		 * <Español>
		 */
		driver.findElement(By.linkText("Español")).click();
		
	}
	
	@Test
public void partialLinkTest() {
		
		/*
		 * link start with <a herf
		 * <Español>
		 * If link is too long
		 * if link is compound -- space in between 
		                                          special characters 
		                                          number in between
		                                          under score in between
		 * if link is dynamic
		 */
		driver.findElement(By.partialLinkText("Contact")).click();
	}
	
	@Test
	public void classAttributeTest() {
		// too compound to search so test failed for( inputtext _55r1 _6luy)
		WebElement text=driver.findElement(By.className("_8eso"));
		System.out.println("what is text :  "+text.getText());
	}
	
	// class is a good functional and system tag
	
 @AfterMethod
public void closeFacebook() {
		closeApplication();
		
}

	
}
