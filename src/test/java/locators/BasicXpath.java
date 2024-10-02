package locators;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import facebookBase.BaseTestWithIfAndElse;

public class BasicXpath extends BaseTestWithIfAndElse{
	@BeforeTest
	public void openFacebook() {
				openApplication();
	}
	
	//@Test
	public void relationalxPathFormula() {
		//tag[@attribute='value']
		//tag-- input, button, link, dropdown
		//attribute-- ID, NAME, CLASS
		//direct locator = " "
		//value = ' '
		//input[@id='email'] --- relational xpath starts from node
		///html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input --- absolute xpath from beginning of html body to current thing you are looking at
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rr4");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("woww");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
@Test
public void linkXpath() {
	
	//sometimes there is no text only title for links
	driver.findElement(By.xpath("//a[@title='Spanish']")).click();
}
	
	
	//@AfterTest
	public void closeFacebook() {
		closeApplication();

	 
}
}
