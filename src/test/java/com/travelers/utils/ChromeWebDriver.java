package com.travelers.utils;

import static com.travelers.config.Constant.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeWebDriver {	
	private static ChromeDriver INSTANCE;
	private ChromeWebDriver(){};	
	
	public static ChromeDriver getChromeWebDriver() {
		if(INSTANCE==null){
			synchronized (ChromeWebDriver.class) {
				if(INSTANCE==null){
					System.setProperty(Firefox_Driver,PATH_FIREFOX);
					INSTANCE=new ChromeDriver();
				}
			}
		}		
	return INSTANCE;
	}

}
