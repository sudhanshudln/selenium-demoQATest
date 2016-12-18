package com.travelers.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.travelers.config.Constant;
import com.travelers.page.RegistrationPage;
import com.travelers.utils.BrowserFactory;

public class RegistrationTest {
	private WebDriver firefoxDriver=null;
	private RegistrationPage registration ;
	
	@BeforeTest
	public void setup(){
		firefoxDriver= BrowserFactory.getBrowser("Firefox");
		firefoxDriver.get(Constant.url);
		firefoxDriver.manage().window().maximize();
		firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		registration= new RegistrationPage(firefoxDriver);
	}
	
	@Test
	public void testRegistration(){
		
	//	assert(registration.isShown());
		registration.setFirstName("sudhanshu");
	}
	
	@Test
	public void clean(){
		firefoxDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		firefoxDriver.quit();
	}

}
