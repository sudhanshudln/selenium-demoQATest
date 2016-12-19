package com.travelers.utils;

import static com.travelers.config.Constant.*;

import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxWebDriver {		
	private static FirefoxDriver INSTANCE=null;	
	private FirefoxWebDriver(){};	
	public static FirefoxDriver getFirefoxWebDriver() {
		if(INSTANCE==null){
			synchronized (FirefoxDriver.class) {
				if(INSTANCE==null){
					System.setProperty(Firefox_Driver,PATH_FIREFOX);
					INSTANCE=new FirefoxDriver();
				}
			}
		}
		return INSTANCE;
	}

}
