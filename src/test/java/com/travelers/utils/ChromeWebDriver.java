package com.travelers.utils;

import static com.travelers.config.Constant.*;

import org.openqa.selenium.WebDriver;
public class ChromeDriver {	
	private static WebDriver INSTANCE;
	private ChromeDriver(){};	
	
	public static WebDriver getChromeWebDriver() {
		if(INSTANCE==null){
			synchronized (ChromeDriver.INSTANCE) {
				if(INSTANCE==null){
					System.setProperty(Firefox_Driver,PATH_FIREFOX);
					INSTANCE=(WebDriver)new ChromeDriver();
				}
			}
		}		
	return INSTANCE;
	}

}
