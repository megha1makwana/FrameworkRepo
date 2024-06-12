package com.SwagLabs.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage 
{
	private WebDriver driver;
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	//locators
	private By productOptions=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']");
	private By productNames=By.xpath("//div[@class='inventory_list']//div//div[@class='inventory_item_name ']");
	private By addToCartButton=By.xpath("//button[text()='Add to cart']");
	
	//methods
	public int getProductCounts()
	{
		int pcount=driver.findElements(productOptions).size();
		return pcount;
	}
	public void getProductNames()
	{
		List<WebElement> list=driver.findElements(productNames);
		System.out.println("**********Product names are*************");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	public void addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(productNames);
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		driver.findElement(addToCartButton).click();
		System.out.println("product "+pname+" is added to the cart");
	}
	
}
