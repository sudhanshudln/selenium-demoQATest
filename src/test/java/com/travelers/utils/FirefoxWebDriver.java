package com.travelers.utils;

import static com.travelers.config.Constant.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxBrowser implements Browser{	
	
	@Override
	public WebDriver getWebDriver() {
		System.setProperty(Firefox_Driver,PATH_FIREFOX);
		WebDriver driver=new FirefoxDriver();	
		return driver;
	}

}
