package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	
	public static String getTD(int rowIndex,int colindex) throws EncryptedDocumentException, IOException
	{		
		FileInputStream file=new FileInputStream("C:\\Users\\Viswajit\\Downloads\\Nov20B_Selenium_Maven1 (1)"
				+ "\\Nov20B_Selenium_Maven1\\TestData\\vishu excel_sheet.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");		 
		String value = sh.getRow(rowIndex).getCell(colindex).getStringCellValue();
		
		return value;
	}
	
	public static void captureScreenshot(WebDriver driver, int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Viswajit\\Downloads\\Nov20B_Selenium_Maven1 (1)\\"
				+ "Nov20B_Selenium_Maven1\\Screenshots\\SShot\\TestCaseID_"+TCID+".jpg");
		FileHandler.copy(src, dest);	
	}
	

	public static String getPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Viswajit\\Downloads\\Nov20B_Selenium_Maven1 (1)\\"
				+ "Nov20B_Selenium_Maven1\\propertyFile.properties");
		Properties pr=new Properties();
		pr.load(file);
		String value = pr.getProperty(key);
		return value;
	}
	


}
