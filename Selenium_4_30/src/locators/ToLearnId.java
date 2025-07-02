package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");

		
		driver.findElement(By.id("email")).sendKeys("nemiraj3@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("nemi123@");
		driver.findElement(By.id("loginbutton")).click();
	}

}
