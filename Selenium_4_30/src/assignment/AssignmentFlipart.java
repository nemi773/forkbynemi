package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipart {
	public static void main(String[]args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 
		 
		 driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("iphone");
			driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"))
			.click();
			driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Blue, 128 GB)']/../..//div[contains(text(),'Free delivery')]"))
			.click();
			
			Set<String> allWindowId = driver.getWindowHandles();
			Thread.sleep(2000);
			
			for(String id1:allWindowId)
			{
				driver.switchTo().window(id1);
				String CurrentURL=driver.getCurrentUrl();
				if(CurrentURL.equals("https://www.flipkart.com/search?q=iphone"))
				{
					break;
				}
			}
			Set<String> allWindowId2 = driver.getWindowHandles();
			Thread.sleep(1000);
			for(String id2:allWindowId2)
			{
				driver.switchTo().window(id2);
				String CurrentURL=driver.getCurrentUrl();
				if(CurrentURL.equals("https://www.flipkart.com/apple-iphone-13-starlight-128-gb/p/"))
				{
					break;
				}
			}
			driver.findElement(By.xpath("//label[text()='Compare']")).click();
		}

		 
		 
}
