package webDriverCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class HowToOpenBrowserAndApplication {
		//instance variable for whole class
		WebDriver driver;
		
		//for testNG
		@Test 
		public void openApplicationWithChrome () {
			//how do you open a browser
			 driver = new ChromeDriver();
			 //how do you open application
			 driver.get("https://www.facebook.com/");
			 //how do you close a browser
			 driver.close();
		}
		@Test
		public void openApplicationWithEdge() {
			//how do you open a edge browser
			driver = new EdgeDriver();
			driver.get("https://mvnrepository.com/");
			driver.close();
			
		}
		
		@Test
		public void openApplicationWithFirefox() {
			//how do you open a edge browser
			driver = new EdgeDriver();
			driver.get("https://github.com/Faruq2014/");
			driver.close();
		}
		

}
