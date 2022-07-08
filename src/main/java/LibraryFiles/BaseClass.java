package LibraryFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
public 	WebDriver driver;
	
	public void initializebrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Viswajit\\Downloads\\Nov20B_Selenium_Maven1 (1)"
				+ "\\Nov20B_Selenium_Maven1\\Browsers\\chromedriver.exe");
		 driver  =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
		driver.manage().window().maximize();		
		driver.get(UtilityClass.getPFData("URL"));
	}

}
