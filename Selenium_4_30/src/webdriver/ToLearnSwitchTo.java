package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(100000);
		
		driver.findElement(By.id("compare")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Set<String> allwindowsids = driver.getWindowHandles();
		
		for(String id:allwindowsids) {
		System.out.println(id);
		driver.switchTo().window(id);
		Thread.sleep(1000);
		
		String acturl = driver.getCurrentUrl();
		if(acturl.equals("https://www.amazon.in/")) {
			driver.close();
		}
		
		
		}
		
	}

}
