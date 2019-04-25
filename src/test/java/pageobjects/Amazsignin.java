package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frames.Demoone;

public class Amazsignin extends Demoone

{

	@FindBy(xpath="//a[@id='nav-link-yourAccount']/span")
	public static WebElement singlinlink;

@FindBy(linkText= "Sign in")
public static WebElement signin;

@FindBy(name= "email")
public static WebElement login;

@FindBy(id= "continue")
public static WebElement continueBtn;

@FindBy(name= "password")
public static WebElement pswrdBtn;

@FindBy(id= "signInSubmit")
public static WebElement loginBTN;





public static void signinlinkmove() throws Exception

{
	Actions a=new Actions(driver);
	a.moveToElement(singlinlink).build().perform();
	
	Thread.sleep(3000);
}

	
	public static void enterUsername(String data1, String data2) throws Exception
	
	{
		signin.click();
		Thread.sleep(2000);
		login.sendKeys(data1);
		continueBtn.click();
		Thread.sleep(2000);
		pswrdBtn.sendKeys(data2);
		Thread.sleep(1000);
		loginBTN.click();
		Thread.sleep(2000);
	}
	
	
	static
	{
		
		PageFactory.initElements(driver, Amazsignin.class);
	}

	
			


	
	
	
	
}
