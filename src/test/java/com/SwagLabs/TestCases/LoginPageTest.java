package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.Utilities.Utility;

public class LoginPageTest extends BaseClass
{
	@Test(priority=1)
	public void verifyTitle() 
	{
		String actTitle=lp.getAppTitle();
		Assert.assertTrue(actTitle.contains("Swag Labs"),"Title not Matched!");
		System.out.println("Title matched!");
	}
	@Test(priority=2)
	public void verifyUrl() 
	{
		String curl=lp.getAppUrl();
		Assert.assertTrue(curl.contains("saucedemo"),"Url not matched!");
		System.out.println("Url matched");
		Utility.screenshot(driver);
	}
	@Test(priority=3)
	public void validateLogin() 
	{
		lp.doLogin("standard_user", "secret_sauce");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"login failed");
		System.out.println("login completed");
	}
}
