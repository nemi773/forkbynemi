package practices;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptForBookModule extends Baseclass{
	@Test
	public void clickOnBook() {
		driver.findElement(By.linkText("Books")).click();
		if(driver.getTitle().equals("Demo Web Shop. Books")) {
			Reporter.log("Book page is displayed",true);
			
				
			}else {
				Reporter.log("book page is not displayed",true);
		}
	}

}
