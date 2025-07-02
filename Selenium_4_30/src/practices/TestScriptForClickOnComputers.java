package practices;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptForClickOnComputers extends Baseclass{
	@Test
	
	public void clickoncomputer() {
		driver.findElement(By.linkText("Computers")).click();
		if(driver.getTitle().equals("Demo Web Shop. Computers")) {
			Reporter.log("computer page is displayed",true);
		}else
            Reporter.log("computer page is not displayed");
	

}
}
