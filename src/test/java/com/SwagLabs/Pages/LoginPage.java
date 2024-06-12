package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utilities.Utility;

public class LoginPage
{
		private WebDriver driver;
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		//locators
		private By username=By.id("user-name");
		private By password=By.id("password");
		private By btn=By.id("login-button");
		
		//methods
		public String getAppTitle()
		{
			return driver.getTitle();
		}
		public String getAppUrl()
		{
			return driver.getCurrentUrl();
		}
		public void doLogin(String un,String psw)
		{
			driver.findElement(username).sendKeys(un);
			driver.findElement(password).sendKeys(psw);	
			Utility.screenshot(driver);
			driver.findElement(btn).click();
			}
		
		

}