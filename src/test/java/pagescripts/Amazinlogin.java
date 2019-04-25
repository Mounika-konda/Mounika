package pagescripts;

import org.testng.annotations.Test;

import frames.Demoone;
import pageobjects.Amazsignin;
import reusables.propertiesReusables;

public class Amazinlogin extends Demoone 

{

	@Test
	public void amazonsignin() throws Exception
	
	{
		
		propertiesReusables pr=new propertiesReusables("C:\\Users\\Mounika\\eclipse-workspace\\migration\\config2.properties");
		
		String url1=pr.getPropertyValue("url");
		
		driver.get(url1);
		Thread.sleep(2000);
		String data1=pr.getPropertyValue("email");
		String data2=pr.getPropertyValue("Password");
		Amazsignin.signinlinkmove();
		
		Amazsignin.enterUsername(data1, data2);
		Thread.sleep(2000);
		


		
		
		
	
	}
	
	
	
	
	
	
	
	
}
