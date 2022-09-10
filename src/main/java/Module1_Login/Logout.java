package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
      @FindBy(xpath="//span[@class='user-id']")	private WebElement userID;
      @FindBy(xpath="(//ul[@class='list-flat dropdown-nav-list']//a)[10]")	private WebElement logout;
      @FindBy(xpath="//a[@href='#']")	private WebElement ChangeUser;
      
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void KiteLogOut(WebDriver driver) throws Throwable 
	{
		Actions act=new Actions(driver);
		act.click(userID);
		act.click(logout);
		Thread.sleep(2000);
		ChangeUser.click();
		
	}

}
