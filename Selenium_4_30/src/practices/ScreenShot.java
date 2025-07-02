package practices;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File temp=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./screenshots/r.png");
		 org.openqa.selenium.io.FileHandler.copy(temp, dest);
		 
	}
	
	

}
