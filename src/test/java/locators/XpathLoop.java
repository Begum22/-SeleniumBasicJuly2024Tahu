package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class XpathLoop extends BaseTestWithIfAndElse{
	@BeforeTest
	public void openFacebook() {
				openApplication();
	}
	
	
@Test
public void xPathLoopTest() {
	
	//if more than one matching xpath, it will not fail. It will click first li.
	//loop and indexing same thing
	driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[12]")).click();
	
}
		
	

	
	
	//@AfterTest
	public void closeFacebook() {
		closeApplication();

	 
}
}
