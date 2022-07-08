package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class 1
public class KiteLogin1Page
{
	//step1: declaration
	@FindBy(xpath="//input[@id='userid']")	private	WebElement UN;     
	@FindBy(xpath="//input[@id='password']")	private	WebElement pwd;  
	@FindBy(xpath="//button[@class='button-orange wide']")	private	WebElement loginBtn;  
	
	
	//step2: initialization
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3: usage
	public void inpKiteLogin1PageUsername(String username) 
	{
		UN.sendKeys(username);
	}
	
	public void inpKiteLogin1PagePassword(String password) 
	{
		pwd.sendKeys(password);
	}
	
	public void clickKiteLogin1PageLoginBtn() 
	{
		loginBtn.click();
	}

}
