package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.WelcomePage;

public class Registertestscript {
	public static void main(String[] args) throws IOException {
	
//	properties	file
	
	FileInputStream rg=new FileInputStream("./testdata/commandata.properties");
	
	Properties prop=new Properties();
	prop.load(rg);
	
	String value = prop.getProperty("url");
	
//	excel file
	
	FileInputStream ex=new FileInputStream("./testdata/TestData1.xlsx");
	
	Workbook exvalue = WorkbookFactory.create(ex);
	
	String fname = exvalue.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	String lname = exvalue.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	String mail = exvalue.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
	String pass = exvalue.getSheet("sheet1").getRow(1).getCell(3).getStringCellValue();
	String fpass = exvalue.getSheet("sheet1").getRow(1).getCell(4).getStringCellValue();
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(value);
	WelcomePage wp=new WelcomePage(driver);
	wp.getRegisterLink().click();
	Registerpage reg=new Registerpage(driver);
	reg.getGenderMale().click();
	reg.getFirstNameTextField().sendKeys(fname);
	reg.getLastNameTextField().sendKeys(lname);
	reg.getEmailTextField().sendKeys(mail);
	reg.getPasswordTextField().sendKeys(pass);
	reg.getConfirmPasswordTextField().sendKeys(fpass);
	reg.getRegisterButton().click();
	
}
	}
