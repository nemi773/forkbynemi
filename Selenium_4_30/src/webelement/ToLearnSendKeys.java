package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://flipkart.com");
	
	driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
}
}
