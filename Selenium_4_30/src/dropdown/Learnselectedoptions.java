package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learnselectedoptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("file:///C:/Users/Nemiraj/Desktop/multi.html");
		
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select carsel=new Select(cars);
		carsel.selectByIndex(2);
		carsel.selectByIndex(0);
		carsel.selectByIndex(1);
		
		
		WebElement firstselectedopt = carsel.getFirstSelectedOption();
		System.out.println(firstselectedopt.getText());
		
		
	}

}
