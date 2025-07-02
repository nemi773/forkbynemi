package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCssSelector {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demowebshop.tricentis.com/");		
//		driver.findElement(By.cssSelector("input[value='Vote']")).click();
		
		
		
		driver.get("https://flipkart.com");
		
		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']"));
		driver.findElement(By.className("q")).sendKeys("helmet");
		
		
		
		
	}

}
