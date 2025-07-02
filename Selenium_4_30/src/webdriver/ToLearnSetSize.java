package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/feed/");
		
		Dimension size = driver.manage().window().getSize();
		
		System.out.println(size);
		
		driver.manage().window().setSize(new Dimension(500, 600));
	}

}
