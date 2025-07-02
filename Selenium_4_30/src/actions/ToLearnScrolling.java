package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrolling {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		
		WebElement busTickets = driver.findElement(By.xpath("//h2[text()='BOOK BUS TICKETS ONLINE']"));
		Actions act=new Actions(driver);
//		act.scrollToElement(busTickets).perform();--------->scroll To Element(webElement)
		act.scrollByAmount(0, 1400).perform();
		act.scrollByAmount(0, -30).perform();
	}

}
