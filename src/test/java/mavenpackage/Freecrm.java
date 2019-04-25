package mavenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Freecrm 

{

 
	
	@Test
	public void m1() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:\\BATCH 232\\chromedriver.exe");
	
//Create object to access opened browser
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://classic.crmpro.com/index.html");
    driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    
    
    
    driver.findElement(By.xpath("//div[contains(@class, '1rliyh3')]")).click();
    Thread.sleep(5000);
    
   driver.findElement(By.xpath("//div[contains(@class, 'd5n6ly ')]")).click();
   
   Thread.sleep(2000);
    
    
    
    
    
    
    
	}
	
    
}
