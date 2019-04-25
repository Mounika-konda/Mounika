package reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsTest {

	public static void main(String[] args) 
	
	{
	
		ExtentReports extentReports = new ExtentReports("extent.html");
		
		//ExtentReports extentReports1 = new ExtentReports("E:\\ws6\\pb8batch\\Reports\\report.html",true);
		
		//ExtentReports ex = new ExtentReports("", Locale.CHINESE);
		
		
		ExtentTest extentTest = extentReports.startTest("ExtentReportsTest");
		
		System.out.println("browser is launched");
		extentTest.log(LogStatus.INFO, "browser is launched");
		
		System.out.println("Entered username");
		extentTest.log(LogStatus.INFO, "DTA is done on username");
		;;;;;;;;;;;;;;
		
		extentReports.endTest(extentTest);
		
       
		extentReports.flush();
		
		

	}

}
