package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.className("email")).sendKeys("nemi123@mail.com");
		driver.findElement(By.className("password")).sendKeys("vfre");
		driver.findElement(By.id("login")).click();
	}

}
