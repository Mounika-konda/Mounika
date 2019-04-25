package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class thoughts 

{

@Test
public void m7() throws Exception

{

	WebDriver driver=new ChromeDriver();
    driver.get("http://www.google.co.in");
    Thread.sleep(2000);

    WebElement e=driver.findElement(By.name("q"));
	
    Actions a=new Actions(driver);
    a.sendKeys(e, "mouni").build().perform();
    
    while(2>1)
    	
    {
    	a.sendKeys(Keys.DOWN).build().perform();
    	String x=e.getAttribute("value");
    	if (x.equalsIgnoreCase("abdul kalam thou"))
    		
    	{
    		a.sendKeys(Keys.ENTER).build().perform();
    		break;
    		
    		
    	}
    	
    	
    	
    	
    	
    	
    	
    }
    	
    
    
    
	
	
}
	
	
	
	
	
	
}
