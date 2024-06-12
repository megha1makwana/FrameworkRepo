package reportsdemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void reportTest()
  {
	  ExtentReports extent = new ExtentReports();
	  ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//Reports//AutomationTest.html");
	  spark.config().setReportName("Automation sprint1 report");
	  spark.config().setDocumentTitle("AutomationTestExtentReport");
	  spark.config().setTheme(Theme.DARK);
	  extent.attachReporter(spark);
	  ExtentTest test=extent.createTest("ExtentReportTest");
	  test.log(Status.PASS, "This is pass status");
	  test.log(Status.FAIL, "This is fail status");
	  test.log(Status.INFO, "This is info status");
	  test.log(Status.SKIP, "This is skip status");
	  extent.flush();
	  
	  
  }
}
