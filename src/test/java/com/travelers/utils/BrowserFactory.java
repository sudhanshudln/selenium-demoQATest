package com.travelers.utils;
import org.openqa.selenium.WebDriver;
public class BrowserFactory {	

	public static WebDriver getBrowser(String browserName) {
		WebDriver driver = null;
		switch (browserName) {
		case "Firefox":			
			driver = FirefoxWebDriver.getFirefoxWebDriver();		
			break;
		case "Chrome":			
			driver = ChromeWebDriver.getChromeWebDriver();		
			break;	
		}		
		return driver;
	}
}