package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import frames.Demoone;

public class Gmaillogin extends Demoone

{
	
@FindBy(id="identifierId")
public static WebElement username;

@FindBy(xpath="//[text()='Next']")
public static WebElement next;

@FindBy(xpath="//button[text()='Forgot email?']")
public static WebElement forgotemail;

@FindBy(xpath="//span[text()='Create account']")
WebElement createacnt;


public static void enterUsername(String data)
{
	username.clear();
	username.sendKeys(data);
	
}

public static void clicknext()
{
	next.click();
	
	
}

public static void clickFrgtpswrd()

{
	
	forgotemail.click();
}

static
{
	PageFactory.initElements(driver, Gmaillogin.class);
}





	
	
	

}
