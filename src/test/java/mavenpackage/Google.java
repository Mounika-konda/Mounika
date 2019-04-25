package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Google 

{
	@Test
	public void m5() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BATCH 232\\chromedriver.exe");
		
		//Create object to access opened browser
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://www.google.co.in");
		    Thread.sleep(2000);
		
		    WebElement e=driver.findElement(By.name("q"));
		    Actions a=new Actions(driver);
		    a.sendKeys(e, "abdul kalam").build().perform();
		    Thread.sleep(2000);
		     for(int i=1;i<=5;i++)
		    	 
		     {
		    	 a.sendKeys(Keys.DOWN).build().perform();
		    	 Thread.sleep(2000);
		    	 
		     }
		
		  a.sendKeys(Keys.ENTER).build().perform();
		  
		
		
	}
	
	
	

}
