package pageObjectModel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//main is loginPage class for this class
//easy to  maintain if loginpage is the kitchen --- this is page object model
//	loginPage is main story of loginTest 
//in page no test or testNG its has main coding
public class LoginTest extends BaseTest {
	LoginPage lp;
	@BeforeMethod
	public void openFacebook() {
		openApplication();
		
	}


@Test
public void validLoginTest(){
	System.out.println("hello");
	lp = new LoginPage(driver);
	lp.connectFriends();
	lp.userName("Tahidul");
	lp.password("kkkvg88u");
	lp.loginButton();
}

@Test
public void invalidUserLoginTest(){
	System.out.println("hello");
	 lp = new LoginPage(driver);
	lp.connectFriends();
	lp.userName("Tahidul");
	lp.password("kkkvg88u");
	lp.loginButton();
}

@Test
public void invalidPassLoginTest(){
	System.out.println("hello");
    lp = new LoginPage(driver);
	lp.connectFriends();
	lp.userName("Tahidul");
	lp.password("kkkvg88u");
	lp.loginButton();
}



@AfterMethod
public void closeFacebook() {
	closeApplication();
	
}

	
}

