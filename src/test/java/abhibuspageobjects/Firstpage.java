package abhibuspageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frames.Demoone;


public class Firstpage extends Demoone
{

	@FindBy(xpath="//button[text()='Later']")
	public static WebElement later;
	
	@FindBy(name="source")
	public static WebElement Leaving ;
	
@FindBy(name="destination")
public static WebElement destination ;

@FindBy(id="datepicker1")
public static WebElement journeydatelement;



@FindBy(xpath="//td[@data-month='3']//a[text()='29']")
public static WebElement dateofjourney;

@FindBy(id="datepicker2")
public static WebElement journeyruturndatelement;



@FindBy(xpath="//td[@data-month='4']//a[text()='8']")
public static WebElement dateofreturn;

@FindBy(xpath="//img[@alt='Two Way']")
public static WebElement search;



public static void enterdetails(String leavingcity, String destinationcity ) throws Exception

{
	
	later.click();
	Thread.sleep(2000);
	Leaving.sendKeys(leavingcity);
	destination.sendKeys(destinationcity);
	Thread.sleep(3000);
Actions a=new Actions(driver);
a.click(journeydatelement).build().perform();
	
	Thread.sleep(2000);
	a.click(dateofjourney).build().perform();

Thread.sleep(2000);
a.click(journeyruturndatelement).build().perform();

Thread.sleep(2000);
a.click(dateofreturn).build().perform();

Thread.sleep(2000);

	search.click();
	Thread.sleep(5000);

	
	
	
	
}






	
	
	
	
	
	
	
	static
	{
		
		PageFactory.initElements(driver, Firstpage.class);
	}

	
	
}
