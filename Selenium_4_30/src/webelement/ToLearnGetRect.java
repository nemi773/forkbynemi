package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Rectangle path = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
		System.out.println(path.getHeight());
		System.out.println(path.getWidth());
		System.out.println(path.getX());
		System.out.println(path.getY());
	}

}
