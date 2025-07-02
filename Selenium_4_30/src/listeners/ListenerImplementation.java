package listeners;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends Baseclass implements ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("testscript is pass",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("testscript is failed",true);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/listimage.png");
		try {
			org.openqa.selenium.io.FileHandler.copy(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("testscript is skipped",true);
	}
	

}
