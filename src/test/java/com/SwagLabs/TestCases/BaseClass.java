package com.SwagLabs.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.SwagLabs.Pages.AddToCartPage;
import com.SwagLabs.Pages.CheckoutPage;
import com.SwagLabs.Pages.InventoryPage;
import com.SwagLabs.Pages.LoginPage;
import com.SwagLabs.Pages.OverviewPage;
import com.SwagLabs.Utilities.PropertiesRead;
import com.SwagLabs.Utilities.Utility;

public class BaseClass
{
		public WebDriver driver;
		public LoginPage lp;
		public InventoryPage ip;
		public AddToCartPage ap;
		public CheckoutPage cp;
		public OverviewPage op;
		public PropertiesRead pr;
		
		@BeforeTest
		public void AppSetUp()
		{
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			pr=new PropertiesRead("TestData\\config");
			lp=new LoginPage(driver);
			ip=new InventoryPage(driver);
			ap=new AddToCartPage(driver);
			cp=new CheckoutPage(driver);
			op=new OverviewPage(driver);
		}
		
		@BeforeClass
		public void pageSetUp()
		{
			System.out.println("***********Login Page************");
			System.out.println("Application title is : "+lp.getAppTitle());
			System.out.println("Application url is : "+lp.getAppUrl());
			lp.doLogin(pr.getData("un"),pr.getData("psw"));
			Utility.screenshot(driver);
			addPause();
			System.out.println("***********Inventory Page************");
			ip.addProductToCart(pr.getData("pname1")); 
			Utility.screenshot(driver);
			addPause();
			System.out.println("*************Cart Page**************");
			ap.getCartPage();
			addPause();
			ap.doRemove();
			Utility.screenshot(driver);
			ap.doContinue();
			addPause();
			ip.addProductToCart(pr.getData("pname2"));
			Utility.screenshot(driver);
			addPause();
			ap.getCartPage();
			addPause();
			ap.doCheckout();
			Utility.screenshot(driver);
			addPause();
			System.out.println("*************Checkout Page**************");
			cp.doContinue(pr.getData("fn"),pr.getData("ln"),pr.getData("zc"));
			Utility.screenshot(driver);
			System.out.println("*************Overview Page**************");
			
			
			
		}
		public void addPause()
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
}
