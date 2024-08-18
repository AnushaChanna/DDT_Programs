package DDT_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class A173_C53_Fetch_UN_PW_NumericCellVal 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Assignments\\DDT\\loginsheet.xlsx");
	Workbook w1=WorkbookFactory.create(file);
	String un=NumberToTextConverter.toText(w1.getSheet("amazonlogin").getRow(0).getCell(0).getNumericCellValue());
	String pw=w1.getSheet("amazonlogin").getRow(0).getCell(1).getStringCellValue();
	System.out.println(un);
	System.out.println(pw);	
}	
}
