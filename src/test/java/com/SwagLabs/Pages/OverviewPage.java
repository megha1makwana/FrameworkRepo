package com.SwagLabs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage 
{
	private WebDriver driver;
	public OverviewPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	
	//locators
	private By productinfo=By.id("checkout_summary_container");
	private By fbtn=By.id("finish");
	private By msg=By.id("checkout_complete_container");
	
	//Methods
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	public void getProductInfo()
	{
		System.out.println("Find product details are : ");
		String pinfo=driver.findElement(productinfo).getText();
		System.out.println(pinfo);
	}
	public void doFinish()
	{
		driver.findElement(fbtn).click();
		System.out.println(driver.findElement(msg).getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
