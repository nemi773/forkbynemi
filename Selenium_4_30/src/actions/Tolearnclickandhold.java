package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tolearnclickandhold {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("nemi123@");
		WebElement eye = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		Actions act=new Actions(driver);
//		act.clickAndHold(eye).perform();
		act.clickAndHold(eye).pause(2000).release().perform();
	}

}
