package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class Testscript extends Baseclass {
	@Test
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nemi@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("NEMI123@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo web shop","home page is not displayed");
		Reporter.log("home page is diaplayed is",true);
	}

}
