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
import org.openqa.selenium.interactions.Actions;

public class A172_C53_AmazonLogin_DDT
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
	Workbook w1=WorkbookFactory.create(file);
	String un=NumberToTextConverter.toText(w1.getSheet("amazonlogin").getRow(0).getCell(0).getNumericCellValue());
	String pw=w1.getSheet("amazonlogin").getRow(0).getCell(1).getStringCellValue();
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement accountslist= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(accountslist).perform();
	WebElement signin=driver.findElement(By.linkText("Sign in"));
	signin.click();
	
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys(un);
	WebElement button=driver.findElement(By.id("continue"));
	button.click();
	
	WebElement password = driver.findElement(By.id("ap_password"));
	password.sendKeys(pw);
	WebElement signinclick=driver.findElement(By.id("auth-signin-button"));
	signinclick.click();	
}
}
