package reportsdemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListesner {
 
	@Test
  public void testcase1()   
  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Assert.assertTrue(driver.getTitle().contains("Google"),"Test fail");
		System.out.println("Test pass");
  }
	
	@Test
	  public void testcase2()   
	  {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Assert.assertTrue(driver.getTitle().contains("Googleapp"),"Test fail");
			System.out.println("Test pass");
	  }
}
