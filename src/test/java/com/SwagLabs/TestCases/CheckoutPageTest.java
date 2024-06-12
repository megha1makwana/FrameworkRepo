package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.Utilities.Utility;

public class CheckoutPageTest extends BaseClass
{
  @Test
  public void verifycontinueprocess()
  {
	  Utility.screenshot(driver);
	  cp.doContinue("megha","makwana","458001");
	  addPause();
	  Assert.assertTrue(driver.getCurrentUrl().contains("checkout"),"It is not navigating to overview page");
	  System.out.println("It is navigating to overview page");
  }
}
