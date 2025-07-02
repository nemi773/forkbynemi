package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRedBus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Train Tickets')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Check PNR status')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'11019 KONARK EXPRESS')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'11019 KONARK EXPRESS')]/../..//button[contains(text(),'Show Availability')]")).click();
	}

}
