package pagescripts;

import org.testng.annotations.Test;

import frames.Demoone;
import pageobjects.Catogory;

public class Selectcatogary extends Demoone

{

	Amazinlogin amz;
	
	
	@Test
	public void selectingcatgry() throws Exception

	{
		amz=new Amazinlogin();
		amz.amazonsignin();
		Thread.sleep(2000);
		
		Catogory.sectingcategory();
		Catogory.clickdress("Small");
		Catogory.addToCart();
		
	}
	
	
	
	
}
