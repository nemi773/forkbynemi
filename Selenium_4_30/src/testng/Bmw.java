package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bmw {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bmw-kunexclusive-bengaluru.in/");
		Reporter.log("Bmw launched",true);
		
	}


}
