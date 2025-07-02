package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		driver.findElement(By.xpath("//option[text()='USA']")).click();
		driver.findElement(By.xpath("//option[text()='Washington']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File shot=new File("./screenshots/baba.png");
		org.openqa.selenium.io.FileHandler.copy(screen, shot);
		
		
		
	}
	

}
