package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.dream11.com/");
		
//		using frame(string name/id)

		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("8888888888");
		
//		switch back to main frame
		
		
//		driver.switchTo().defaultContent();-------->defaultContent(1)
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
		
		
		
	
		
	}
	

}
