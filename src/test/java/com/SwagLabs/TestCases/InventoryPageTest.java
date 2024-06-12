package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateProductCount() 
  {
	 int pname=ip.getProductCounts();
	 Assert.assertEquals(pname, 6,"Product count not matched!");
	 System.out.println("Total counts are : "+pname);
  }
  @Test(priority=2)
  public void validateProductNames() 
  {
	  ip.getProductNames();
  }
  @Test(priority=3)
  public void validateAddToCart() 
  {
	  ip.addProductToCart("Sauce Labs Bolt T-Shirt");
  }
}
