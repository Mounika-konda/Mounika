package mavenpackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multiselect 

{
@Test
public void m5() throws Exception
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	Thread.sleep(5000);
	driver.switchTo().frame("iframeResult");
	Thread.sleep(5000);
	
	WebElement e=driver.findElement(By.name("cars"));
	
	Select s=new Select(e);
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).build().perform();
	Thread.sleep(5000);
	a.click(s.getOptions().get(0)).build().perform();
	Thread.sleep(5000);
	a.click(s.getOptions().get(2)).build().perform();
	Thread.sleep(5000);
	a.keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(15000);
	s.deselectByIndex(2);
	
	driver.get("http://www.flipkart.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//Move mouse pointer to Women link
	WebElement e1=driver.findElement(By.xpath(
			           "//*[text()='Women']"));
	a.moveToElement(e1).build().perform();
	Thread.sleep(5000);
	
	
	a.contextClick(e1).build().perform();
	Thread.sleep(5000);
	File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File f2=new File("E:\\batch232\\screen.png");
	FileUtils.copyFile(f1, f2);
	driver.close();
	
	
	
	
	
	
	
}
	
	
	
	
}
