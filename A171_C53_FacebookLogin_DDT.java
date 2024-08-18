package DDT_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A171_C53_FacebookLogin_DDT 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
	Workbook w1=WorkbookFactory.create(file);
	String un=NumberToTextConverter.toText(w1.getSheet("facebooklogin").getRow(0).getCell(0).getNumericCellValue());
	String pw=w1.getSheet("facebooklogin").getRow(0).getCell(1).getStringCellValue();
	
	/*FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
	Workbook w1=WorkbookFactory.create(file);
	String un=NumberToTextConverter.toText(w1.getSheet("amazonlogin").getRow(0).getCell(0).getNumericCellValue());
	String pw=w1.getSheet("amazonlogin").getRow(0).getCell(1).getStringCellValue();*/
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement username=driver.findElement(By.name("email"));
	username.sendKeys(un);
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(pw);
	WebElement login= driver.findElement(By.name("login"));
	login.click();
	
	
}
}
