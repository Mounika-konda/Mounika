package pagescripts;

import java.io.IOException;

import org.testng.annotations.Test;

import frames.Demoone;
import pageobjects.Gmaillogin;
import reusables.propertiesReusables;

public class Gmailtest extends Demoone

{

	@Test
	public void gmailLogin() throws IOException, Exception 
	
	{
		propertiesReusables prconf=new propertiesReusables("C:\\Users\\Mounika\\eclipse-workspace\\migration\\config.properties");
		
		String url1=prconf.getPropertyValue("url");
		
		driver.get(url1);
		String username=prconf.getPropertyValue("un");
		
		
		Gmaillogin.enterUsername(username);
		
		Thread.sleep(2000);
		
		Gmaillogin.clicknext();
		
		Thread.sleep(2000);

		
		
		
	}
	
	
	@Test
	public void validatelogin() throws IOException, Exception 
	
	{
		propertiesReusables prconf=new propertiesReusables("C:\\Users\\Mounika\\eclipse-workspace\\migration\\config.properties");
		
		String url1=prconf.getPropertyValue("url");
		
		driver.get(url1);
		String username=prconf.getPropertyValue("un");
		
		
		Gmaillogin.enterUsername(username);
		
		Thread.sleep(2000);
		
		Gmaillogin.clicknext();
		
		Thread.sleep(2000);

		
		
		
	}
	
	
	
	
	
}
