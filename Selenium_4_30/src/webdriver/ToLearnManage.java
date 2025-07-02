package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/feed/");
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
	}

}
