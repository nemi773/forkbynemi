package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnAllSelectedoptions {
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
		
		List<WebElement> allSelectedoptions = carsel.getAllSelectedOptions();
		System.out.println(allSelectedoptions.size());
		
		for(WebElement ele:allSelectedoptions) {
			System.out.println(ele.getText());
		}
		
//		isMultiple
		
		System.out.println(carsel.isMultiple());
	
	}

}
