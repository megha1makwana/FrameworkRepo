package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SwagLabs.Utilities.Utility;

public class CheckoutPage
{
	private WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	private By fname=By.id("first-name");
	private By lname=By.id("last-name");
	private By zcode=By.id("postal-code");
	private By cbtn=By.id("continue");
	
	//methods
	public void doContinue(String fn,String ln,String zc)
	{
		driver.findElement(fname).sendKeys(fn);
		driver.findElement(lname).sendKeys(ln);
		driver.findElement(zcode).sendKeys(zc);
		Utility.screenshot(driver);
		driver.findElement(cbtn).click();
	}
}
