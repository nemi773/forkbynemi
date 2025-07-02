package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		step1:create fileinputstream object
		FileInputStream fis=new FileInputStream("./testdata/testscriptdata.xlsx");
		
//		step2:create respective file type object
		Workbook wb = WorkbookFactory.create(fis);
		
//		step3:call read method
		String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String email = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue(); //stringdata
		
		System.out.println(url);
		System.out.println(email);
		
		double price = wb.getSheet("sheet1").getRow(1).getCell(3).getNumericCellValue(); //numberdata
		System.out.println(price);
		
		boolean status = wb.getSheet("sheet1").getRow(1).getCell(4).getBooleanCellValue();//boolean data
		System.out.println(status);
		
		LocalDateTime date = wb.getSheet("sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();//date
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());

		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
	}

}
