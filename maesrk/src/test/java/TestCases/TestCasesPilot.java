package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
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
		bd.selectDepartureCity("Boston");
		bd.selectDestinationCity("Dublin");
		bd.clickFindflights_Btn();
		fsp.clickChooseFlight();
		fcp.fillName("Adam");
		fcp.fillAddress("Downing Street");
		fcp.fillCity("Dallas");
		fcp.fillState("Texas");
		fcp.fillZipCode("12345");
		fcp.selectCardType("Visa");
		fcp.fillCreditCardNumber("765657889769898");
		fcp.fillMonth("11");
		fcp.fillYear("2020");
		fcp.fillNameOnCard("Adam Sandler");
		fcp.clickPurchaseFlight();
		
		String thanks= driver.findElement(By.xpath(cp.thankYouHeading)).getText();
		String id = driver.findElement(By.xpath(cp.confirmationId)).getText();
		System.out.println("confirmation id is :"+id);
		Assert.assertTrue(thanks.contains("Thank"),"Thank You Page reached");
		Assert.assertTrue(!id.isEmpty(), "Confirmation Id is present");
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
	
	
}
