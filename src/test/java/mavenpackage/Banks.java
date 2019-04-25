package mavenpackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Banks {

	@Test
	public void m1() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.theswiftcodes.com/malaysia/");
	Thread.sleep(3000);
	WebElement table=driver.findElement(By.xpath("//table[@class= 'swift']"));
	Thread.sleep(2000);
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	
	for (WebElement row: rows)
		
	{
		List<WebElement>col=row.findElements(By.tagName("td"));
		
		
		WebElement a1=col.get(1);
		
		WebElement a2=col.get(2);
		
		System.out.println(a1.getText()+a2.getText());
	
	
	
	}

	driver.close();
	
	}

}
