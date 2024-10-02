package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class AppReader {

	Properties prop;  //instance variable
	
	public AppReader() {
		prop = new Properties(); // Properties class only able to read
		
		String filePath="src/main/resources/App.properties";
		
		// bridge to bring data in 
		FileInputStream fis;
		try {
		  fis = new FileInputStream( filePath);
		 prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String readBrowser() {
		return prop.getProperty("Browser");
	}
	
	public String readUrl() {
		return prop.getProperty("url");
	}
	
	
	
	
	
	
	
	
	
	
	public AppReader(Properties prop) {
		super();
		this.prop = prop;
	}














	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
