package pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import frames.Demoone;

public class Catogory extends Demoone
{

	@FindBy(xpath="//span[text()='Shop by']")
	public static WebElement catogory;

		@FindBy(xpath="//span[contains(text(),'Women')][1]")
		public static WebElement wmnfashion;
		
		@FindBy(xpath="//span[text()='Ethnic Wear']")
		public static WebElement ethnicwear;
		
		@FindBy(xpath="//span[text()='ZIYAA']")
		public static WebElement ziyaadress;

		
		
		
		
		
		@FindBy(xpath="//span[contains(text(), 'Pink')][1]")
		public static WebElement pinkclr;
		
		public static void sectingcategory() throws Exception
		{
			
			Actions a=new Actions(driver);
			a.moveToElement(catogory).build().perform();
			Thread.sleep(2000);
			a.moveToElement(wmnfashion).build().perform();
			Thread.sleep(2000);
			ethnicwear.click();
			Thread.sleep(2000);
			ziyaadress.click();
			Thread.sleep(500);
			pinkclr.click();
			Thread.sleep(4000);
			
			
		}
		
		
		
		
		
		
		
		
		public static void clickdress(String value) throws Exception
			
		{	
		
			
			Set<String> set=driver.getWindowHandles();
			
			Iterator<String> itr=set.iterator();
			
			while(itr.hasNext()){
				 String childWindow=itr.next();
				 
				 driver.switchTo().window(childWindow);
				 Thread.sleep(4000);
				 
				 WebElement element=driver.findElement(By.xpath("//span[contains(@class,'dropdown')]/select[1]"));
				 
				 Select s=new Select(element);
				 Thread.sleep(2000);
				 
				 
			    List<WebElement> list=s.getOptions();
			    
			    for(int i=0;i<list.size();i++)
			    {
			    	String text=list.get(i).getText();
			    	
			    	if (text.equals(value))
			    		
			    	{
			    		s.selectByVisibleText(value);
			    		Thread.sleep(3000);
			    		break;
			    	}
			    	
			    	
			    }
			
				 
				
				 
			}
			
		}
		
		public static void addToCart() throws Exception
		
		{
			WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			addtocart.click();
			Thread.sleep(3000);
			
			WebElement element=driver.findElement(By.xpath("//h1[contains(text(), 'Added to Cart')]"));
			
			element.isDisplayed();
			
			Thread.sleep(3000);
				
		}
		
		
		
		static
		{
			PageFactory.initElements(driver, Catogory.class);
		}

		
	
	  
		

		
	
	
}
