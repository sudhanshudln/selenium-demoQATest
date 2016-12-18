package com.travelers.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.travelers.utils.BrowserFactory;

public class RegistrationPage {	
	private WebDriver firefoxDriver;
	
	private static By pageTitle 				= 	By.cssSelector("div#primary header h1.entry-title");	
	private static By input_field_firstName 	= 	By.id("name_3_firstname");
	/*private static By input_field_lastName 		= 	By.id("name_3_lastname");
	private static By radio_button_Marital_Status = By.name("radio_4[]");
	private static By radio_button_Hobby 		= 	By.name("checkbox_5[]");
	private static By select_box_country 		= 	By.id("dropdown_7");
	private static By select_box_months 		= 	By.id("mm_date_8");
	private static By select_box_days 			= 	By.id("dd_date_8");
	private static By select_box_years 			= 	By.id("yy_date_8");
	private static By input_field_phoneNumber 	= 	By.id("phone_9");
	private static By input_field_username 		= 	By.id("username");
	private static By input_field_email 		= 	By.id("email_1");
	private static By upload_your_picture 		= 	By.id("profile_pic_10");
	private static By testArea_about_your_self 	= 	By.id("description");	
	private static By input_field_password 		= 	By.id("password_2");
	private static By input_field_confirmPassword = By.id("confirm_password_password_2");	
	private static By input_submit 		=	By.id("pie_submit");*/
	
	public  RegistrationPage(WebDriver firefoxDriver){
		this.firefoxDriver=firefoxDriver;
	}
	
	public boolean isShown(){
		boolean displayed= false;
		WebElement reg=firefoxDriver.findElement(pageTitle);
		if(reg.isDisplayed()){
			displayed= true;
		}
		return displayed;
	}
	
	public void setFirstName(String name){
		firefoxDriver.findElement(input_field_firstName).sendKeys(name);		
	}
	/*
	public void setLastName(String name){
		firefoxDriver.findElement(input_field_lastName).sendKeys(name);		
	}
	
	public List<WebElement> getMaritalStatus(){
		 List<WebElement> rdBtn_Mstatus = firefoxDriver.findElements(radio_button_Marital_Status);	
		return rdBtn_Mstatus;
	}
	
	public void setMaritalStatus(String name){
		List<WebElement> rdbtn= getMaritalStatus();
		for(WebElement ele:rdbtn ){
			if(ele.getAttribute("value").equals(name)){
				ele.click();
			}
		}
	}
	
	public List<WebElement> getHobby(){
		 List<WebElement> hobby = firefoxDriver.findElements(radio_button_Hobby);	
		return hobby;
	}
	
	public void setHobby(String name){
		List<WebElement> rdbtn= getHobby();
		for(WebElement ele:rdbtn ){
			if(ele.getAttribute("value").equals(name)){
				ele.click();
			}
		}
	}
	
	public Select getMonths(){
		WebElement element = firefoxDriver.findElement(select_box_months);
		Select oSelect = new Select(element);
		return oSelect;
	}
	
	public void setMonths(String options){
		Select oSelect = getMonths();
		oSelect.selectByVisibleText(options);
	}
	
	public Select getDays(){
		WebElement element = firefoxDriver.findElement(select_box_days);
		Select oSelect = new Select(element);
		return oSelect;
	}
	
	public void setDays(int index){
		Select oSelect = getDays();
		oSelect.selectByIndex(index);
	}
	
	public Select getYears(){
		WebElement element = firefoxDriver.findElement(select_box_years);
		Select oSelect = new Select(element);
		return oSelect;
	}
	
	public void setYears(String options){
		Select oSelect = getYears();
		oSelect.selectByValue(options);
	}
	
	
	public void setUserName(String name){
		firefoxDriver.findElement(input_field_username).sendKeys(name);		
	}
	
	public void setEmail(String name){
		firefoxDriver.findElement(input_field_email).sendKeys(name);		
	}
	
	public void setPassword(String name){
		firefoxDriver.findElement(input_field_password).sendKeys(name);		
	}
	
	public void setConfirmPassword(String name){
		firefoxDriver.findElement(input_field_confirmPassword).sendKeys(name);		
	}
	
	public void setDescription(String name){
		firefoxDriver.findElement(testArea_about_your_self).sendKeys(name);		
	}
	
	public void setPhoneNumber(String name){
		firefoxDriver.findElement(input_field_phoneNumber).sendKeys(name);		
	}
	
	
	public void clickSubmit(String name){
		firefoxDriver.findElement(input_submit).click();		
	}
	
	
	public Select getCountriesList(){
		WebElement element = firefoxDriver.findElement(select_box_country);
		Select oSelect = new Select(element);
		return oSelect;
	}
	
	public void setCounty(String options){
		Select oSelect = getCountriesList();
		oSelect.selectByVisibleText(options);
	}
	
*/		
}
