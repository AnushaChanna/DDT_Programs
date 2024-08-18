package DDT_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A169_C53_Fetching_UN_PW_StringCellVal 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
	Workbook w1=WorkbookFactory.create(file);
	String un=w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	String pw=w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
	System.out.println(un);
	System.out.println(pw);
	
}
}
