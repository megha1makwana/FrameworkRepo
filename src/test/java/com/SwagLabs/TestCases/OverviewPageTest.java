package com.SwagLabs.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class OverviewPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	 System.out.println("Current url is : "+op.getAppUrl());
  }
  @Test(priority=2)
  public void verifyProductDetails() 
  {
	 op.getProductInfo(); 
  }
  @Test(priority=3)
  public void verifyCompleteProcess() 
  {
	  op.doFinish();
  }
  
}
