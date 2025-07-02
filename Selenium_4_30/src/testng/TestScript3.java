package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript3 extends BaseClass{
	@Test
	public void clickonElectronics() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		Reporter.log("Electronics page is displayed",true);
	}


}

