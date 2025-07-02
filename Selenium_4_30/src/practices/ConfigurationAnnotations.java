package practices;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class ConfigurationAnnotations {
	@BeforeSuite
	public void  beforeSuite() {
		Reporter.log("@BeforeSuite",true);
		
	}
	
	@BeforeTest
	public void BeforeTest() {
		Reporter.log("@BeforeTest",true);
	}
	
	@Test
	public void demo() {
		Reporter.log("@test(DEMO)executed",true);
	}
	
	@AfterTest
	public void AfterTest() {
		Reporter.log("@AfterTest",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("@AfterSuite",true);
	}

}
