package pomWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pf_LoginPage {
    WebDriver driver;

	public Pf_LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email") public WebElement uName;
	
	public WebElement userName(String enterUserName) {
		uName.sendKeys(enterUserName);
		return uName;
	}
	
	public WebElement userName1 (String enterUserName) {
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys(enterUserName);
		return uname;
		
	}
@FindBy(id="pass") public WebElement pass;
	
	public WebElement password(String enterYourPassword) {
		uName.sendKeys(enterYourPassword);
		return pass;
	}
	
	public void loginButton() {
		//loginButton.click();
	}

}
