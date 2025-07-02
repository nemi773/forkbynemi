package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass {
	@Test
	public void clickonComputers() {
		driver.findElement(By.partialLinkText("Computers")).click();
		Reporter.log("Computers page is displayed",true);
	}

}

