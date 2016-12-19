package com.travelers.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.travelers.utils.BrowserFactory;

public class RegistrationPage {	
	
	 WebDriver driver;
	 
	 public RegistrationPage(WebDriver driver){
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(css="div#primary header h1.entry-title")
	 private static WebElement pageTitle;
	 
	 @FindBy(id="name_3_firstname")	 
	 private static WebElement firstName;
	 
	 @FindBy(name="radio_4[]")	 
	 private static List<WebElement> maritalStatus;
	 
	 @FindBy(name="checkbox_5[]")	 
	 private static List<WebElement> hobby;
	 
	 @FindBy(id="dropdown_7")	 
	 private static WebElement country;
	 
	 @FindBy(id="mm_date_8")	 
	 private static WebElement months;
	 
	 @FindBy(id="dd_date_8")	 
	 private static WebElement days;
	 
	 @FindBy(id="yy_date_8")	 
	 private static WebElement years;
	 
	 @FindBy(id="phone_9")	 
	 private static WebElement phoneNumber;
	 
	 @FindBy(id="username")	 
	 private static WebElement username;
	 
	 @FindBy(id="email_1")	 
	 private static WebElement email;
	 
	 @FindBy(id="profile_pic_10")	 
	 private static WebElement picture;	 
	 
	 @FindBy(id="description")	 
	 private static WebElement aboutYourSelf;
	 
	 @FindBy(id="password_2")	 
	 private static WebElement password;
	 
	 @FindBy(id="confirm_password_password_2")	 
	 private static WebElement confirmPassword;
	 
	 @FindBy(id="pie_submit")	 
	 private static WebElement submit;
	 
	public boolean isShown(){
		boolean displayed= false;
		if(pageTitle.isDisplayed()){
			displayed= true;
		}
		return displayed;
	}
	
	public void setFirstName(String name){
		firstName.sendKeys(name);		
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
