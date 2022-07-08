package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class2
public class KiteLogin2Page 
{
	@FindBy(xpath="//input[@id='pin']")	private WebElement pin; 
	@FindBy(xpath="//button[text()='Continue ']")	private WebElement cntBtn;
	
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin2PagePin(String PinValue)
	{
		pin.sendKeys(PinValue);
	}
	
	public void clickKiteLogin2PageCntBtn()
	{
		cntBtn.click();
	}
	

}
