package com.travelers.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.travelers.config.Constant;
import com.travelers.page.RegistrationPage;
import com.travelers.utils.BrowserFactory;

public class RegistrationTest {
	WebDriver driver;
	RegistrationPage regPage;

	@BeforeTest
	public void setup(){
		driver= BrowserFactory.getBrowser("Firefox");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get(Constant.url);
		System.out.println("sudhansh>>>>>>>>"+driver.getTitle());

	}
	
	@Test
	public void testRegistration(){
		regPage= new RegistrationPage(driver);
		assert(regPage.isShown());
		regPage.setFirstName("sudhanshu");
	}
	
	@AfterTest
	public void clean(){
		driver.quit();
	}

}
