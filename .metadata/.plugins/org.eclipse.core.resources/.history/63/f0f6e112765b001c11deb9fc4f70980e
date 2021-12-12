package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseTestClass;
import pageObjects.BlazeDemoHomePage;
import pageObjects.ConfirmationPage;
import pageObjects.FillClientDetailsPage;
import pageObjects.FlightSelectionPage;

public class TestCasesPilot extends BaseTestClass{
	
	BlazeDemoHomePage bd;
	FlightSelectionPage fsp;
	FillClientDetailsPage fcp;
	ConfirmationPage cp;
	
	public TestCasesPilot() {
		super();
	}

	
	
	@BeforeMethod
	public void startUp()
	{
		browserInitialization(); 
	    bd = new BlazeDemoHomePage();
		fsp = new FlightSelectionPage();
		fcp= new FillClientDetailsPage();
		cp = new ConfirmationPage();
	}
	
	@Test
	public void bookingAflightAndGettingConfirmationId()
	{
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	
	
}
