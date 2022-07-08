package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomeVerifyText
{
	@FindBy(xpath="//span[@class='nickname']") private WebElement Vtext;
	
	public KiteHomeVerifyText(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyText()
	{
		String actText = Vtext.getText();
		return actText;
	}

}
