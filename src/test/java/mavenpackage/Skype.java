package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Skype

{
	
	@Test
	public void signup() throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\BATCH 232\\chromedriver.exe");
	//Create object to access opened browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobile.twitter.com/login");
	Thread.sleep(3000);
	
	driver.get("https://www.skype.com/en/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//span[text()='Sign up']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("9014469305");
	Thread.sleep(4000);
	driver.findElement(By.id("iSignupAction")).click();
	Thread.sleep(3000);
	
	
	
	
	

		
	}

}
