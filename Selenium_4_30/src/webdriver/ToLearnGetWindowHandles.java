package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/s/uhp-upto-50-percent-off-5721-60691");
		
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		
		Set<String> allWindowsid = driver.getWindowHandles();
	System.out.println(allWindowsid);
	}
}
