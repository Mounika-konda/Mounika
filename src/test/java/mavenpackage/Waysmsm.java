package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Waysmsm
{

@Test
public void m5() throws Exception
{

	System.setProperty("webdriver.chrome.driver", "C:\\BATCH 232\\chromedriver.exe");
//Create object to access opened browser
WebDriver driver=new ChromeDriver();
driver.get("http://www.gmail.com");
Thread.sleep(5000);
String x=driver.findElement(By.name("identifier")).getAttribute("aria-label");
System.out.println(x);
String y=driver.findElement(By.name("identifier")).getCssValue("text-align");
System.out.println(y);
String z=driver.findElement(By.name("identifier")).getText();
System.out.println(z);
String w=driver.findElement(By.name("identifier")).getTagName();
System.out.println(w);
//close site
driver.close();

	
	
	
	
}

	
}
