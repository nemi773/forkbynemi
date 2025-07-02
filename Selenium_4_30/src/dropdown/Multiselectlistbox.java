package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectlistbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Nemiraj/Desktop/multi.html");
		
		WebElement car = driver.findElement(By.id("cars"));
		Select carsel=new Select(car);
		carsel.selectByIndex(0);
		carsel.deselectByValue("f");
		carsel.deselectByVisibleText("volvo");
		
		Thread.sleep(2000);
		carsel.deselectAll();
		
	}

}
