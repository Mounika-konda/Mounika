package mavenpackage;

import static org.testng.Assert.expectThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class1 

{


	@Test
	public void methi() throws Exception
	
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\BATCH 232\\chromedriver.exe");
//Create object to access opened browser
    WebDriver driver=new ChromeDriver();
  driver.get("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/profile?id=&ref=dnc&feedbackoption=0&altresid=");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[contains(@class, 'socialbtn facebook')]")).click();
  Thread.sleep(4000);
  
  
  Set<String>set=driver.getWindowHandles();
  List<String>a=new ArrayList<String>(set);
  
  driver.switchTo().window(a.get(2));
  Thread.sleep(4000);
  driver.findElement(By.name("email")).sendKeys("kondamounika43");
  Thread.sleep(3000);
  driver.findElement(By.name("pass")).sendKeys("sampathi");
  Thread.sleep(2000);
driver.findElement(By.id("forgot-password-link")).click();
Thread.sleep(2000);
Set<String> strHandles = driver.getWindowHandles();

for(String handle_2: strHandles)
{
	Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("mounikamunni");

Thread.sleep(2000);

}







	} 
	
}
