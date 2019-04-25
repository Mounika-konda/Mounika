package frames;



	
	
import java.io.File;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class Demoone 

	{

	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
		
		public static String userdir=System.getProperty("user.dir");
		
		
		@Parameters("browser")
		
	 
		@BeforeSuite
		public void chromebrowser(@Optional("chrome")String browser)

	{
		  
		if(browser.equalsIgnoreCase("chrome"))
		{
			
		  System.setProperty("webdriver.chrome.driver", "C:\\BATCH 232\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		}
				
				
	}
		
		@AfterSuite
		public void closeBrowser()
		{
			driver.close();
			
		}
		
		
		
		@BeforeTest
		public void startReport() {
			 extentReports = new ExtentReports("extent.html");
		}
		
		
		
		
		@BeforeMethod
		public void beforeTCExecution(Method method)
		{
			String tcName = method.getName();
			System.out.println("Currently executing tcname is: " + tcName);
			extentTest = extentReports.startTest("tcName");
		}
		
		@AfterMethod
		public void afterTCExecution(ITestResult result) throws Exception {
			String tcName = result.getName();
			System.out.println("TC is executed: " + tcName);
			System.out.println("Analysing Execution status FAIL|PASS|SKIP");
			
			if (result.getStatus()==ITestResult.SUCCESS) {
				System.out.println("TC is passed so not taking screenshot");
				extentTest.log(LogStatus.PASS, "TC is passed: " + tcName);
			}
			else if (result.getStatus()==ITestResult.FAILURE) {
				System.out.println("TC IS FAILED SO TAKING SCREENSHOT : " +tcName);
				String imagePath=screenshot(tcName);
				extentTest.log(LogStatus.FAIL, "TC is falied: " + tcName);
				extentTest.log(LogStatus.FAIL, result.getThrowable());
				extentTest.addScreenCapture(imagePath);
			
			}
			extentReports.endTest(extentTest);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public static String screenshot(String tcname) throws Exception
		
		{
			
			String imagePath = Demoone.userdir+"\\Screenshots\\"+tcname+".jpeg";
			
			TakesScreenshot ts=(TakesScreenshot)Demoone.driver;
			File file=ts.getScreenshotAs((OutputType.FILE));
			FileUtils.copyFile(file, new File(imagePath));
			
		
			return imagePath;
			
			
		}
		
				
			
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
