package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String fontsize = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-family");
		
		System.out.println(fontsize);
	}

}
