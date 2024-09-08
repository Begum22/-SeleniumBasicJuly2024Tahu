  package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class DynamicXpath extends BaseTestWithIfAndElse{
	//@BeforeMethod
	@BeforeTest
	public void openFacebook() {
				openApplication();
	}
	
	@Test
	public void userNameTest() {
		//beginning text
		driver.findElement(By.xpath("//*[contains(@class,'inputtext')]")).sendKeys("gg123 ");
	}
	
	@Test
	public void passTest() {
		//took text from ending 
		driver.findElement(By.xpath("//*[contains(@class,'55r1 _6luy _9npi')]")).sendKeys("7gdh");
	}
	
	@Test
	public void dynamicxpathFormula() {
		//everytime u refresh, close, open -- session based dynamic changes, same xpath doesnt work next time
		//tag[starts-with(@id,'value')]
		driver.findElement(By.xpath("//button[starts-with (@id,'u_0_5_')]")).click();
		
	}
	
//@Test
public void containFunction() {
	//sometimes value change in beginning. it doesn't matter where it change, it will find this.
	driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
}
	
	
	//@AfterMethod
@AfterTest
	public void closeFacebook() {
		closeApplication();

	 
}
}
