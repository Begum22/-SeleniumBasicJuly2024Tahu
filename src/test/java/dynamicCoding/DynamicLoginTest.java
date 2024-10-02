package dynamicCoding;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class DynamicLoginTest extends BaseTestWithIfAndElse {
	@BeforeMethod
	public void openFacebook() {
		openApplication();
	}
	@Test
	public void validLoginTest() {
		loginTest("Tahurab@gmail.com", "nxbyxv");
	}
	
	@Test
	public void invalidPasswordTest() {
		loginTest("Tahurab@gmail.com", "sjd");
		
		
	}
	@Test
	public void invalidUsernameTest() {
		loginTest("Tahub@gmail.com", "nxbyxv");
	}
		
	//helper method
	public void loginTest(String userName, String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	
		
	}
	
	@AfterMethod
	public void closeFacebook() {
		closeApplication();
		
	}
}
