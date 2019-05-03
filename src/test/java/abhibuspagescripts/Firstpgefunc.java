package abhibuspagescripts;


import org.testng.annotations.Test;

import abhibuspageobjects.Firstpage;
import frames.Demoone;
import reusables.propertiesReusables;

public class Firstpgefunc extends Demoone

{
	@Test
	public void busdetailsenter() throws Exception  
	
	{
		
		propertiesReusables pr=new propertiesReusables("C:\\Users\\Mounika\\eclipse-workspace\\migration\\abhiconfig2.properties");

		String url1=pr.getPropertyValue("url");
		driver.get(url1);
		Thread.sleep(4000);
		Firstpage.enterdetails("Hyderabad", "Vijayawada");
		
		
		
	}

	
	
	
}
