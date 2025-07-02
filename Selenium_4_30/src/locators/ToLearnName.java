package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnName {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("https://www.instagram.com/accounts/login/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("username")).sendKeys("_nemii__");
	driver.findElement(By.name("password")).sendKeys("werr");
	
	
	
}
}
