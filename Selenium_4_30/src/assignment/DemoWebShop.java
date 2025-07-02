package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Facebook")).click();
		
		
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		
//		step3
		
	
		
		
	
		
		
	}

}
