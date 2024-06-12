package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartPageTest extends BaseClass
{
	@Test(priority=1)
	public void verifyCartPage()
	{
		ap.getCartPage();
		  addPause();
	}
  @Test(priority=2)
  public void validateRemove() 
  {
	  ap.doRemove();
	  addPause();
  }
  @Test(priority=3)
  public void validateContinue() 
  {
	  ap.doContinue();
	  addPause();
	  Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"It is not navigating to inventory page");
	  System.out.println("It is navigating to inventory page");
	  addPause();
	  ip.addProductToCart("Sauce Labs Fleece Jacket");
	  addPause();
	  ap.getCartPage();
	  addPause();
	  
	  
  }
  @Test(priority=4)
  public void validateCheckout() 
  {
	  ap.doCheckout();
	  addPause();
	  Assert.assertTrue(driver.getCurrentUrl().contains("checkout"),"It is not navigating to checkout page");
	  System.out.println("It is navigating to checkout page");
  }
}
