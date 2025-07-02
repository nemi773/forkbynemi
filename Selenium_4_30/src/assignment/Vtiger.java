package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("selenium");
		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("selenium@123");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
		 String errormsg = driver.findElement(By.xpath("//span[contains(@class,' failureMessage')]")).getText();
		
		System.out.println(errormsg);
		driver.close();
	
		
		
	}

}
