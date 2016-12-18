package com.travelers.utils;
import org.openqa.selenium.WebDriver;
public class BrowserFactory {	

	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;
		switch (browserName) {
		case "Firefox":
			FirefoxBrowser ffox= new FirefoxBrowser();		
			driver = ffox.getWebDriver();		
			break;
		default :
			System.out.println ("no browser found...");	
		}		
		return driver;
	}
}