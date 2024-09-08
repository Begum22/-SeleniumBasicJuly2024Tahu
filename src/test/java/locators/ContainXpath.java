package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class ContainXpath extends BaseTestWithIfAndElse{
	@BeforeTest
	public void openFacebook() {
				openApplication();
	}
	
	
	//@Test
	public void containMethod() {
		//text always stays in between <> search link through text it contains. Title will not be inside <>
		driver.findElement(By.xpath("//a[contains(text(),'Español')]")).click();
		
	}
	 @Test
	public void partialContainTextMethod() {
		 //you can use partial text instead of writing the whole thing
		 //can do validation testing to check eg. Tahura's account is there.
		 
		WebElement connectFriend=driver.findElement(By.xpath("//h2[contains(text(),'Connect with')]"));
		System.out.println("text is :  " +connectFriend.getText());
		
	}
	

	
	
	//@AfterTest
	public void closeFacebook() {
		closeApplication();

	 
}
}
