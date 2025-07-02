package webdriver;

import javax.swing.text.Position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		Point position= driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
	}

}
