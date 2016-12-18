package com.travelers.utils;

import org.openqa.selenium.WebDriver;

public class BrowserLoadTest {

	public static void main(String[] args) {
		WebDriver firefoxDriver= BrowserFactory.getBrowser(BrowserType.Firefox.name());
		firefoxDriver.get("https://www.google.co.in/");
		System.out.println("broser Anme "+ firefoxDriver.getTitle());
	}

}
