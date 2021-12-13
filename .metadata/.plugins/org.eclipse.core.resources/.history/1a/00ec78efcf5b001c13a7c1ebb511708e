package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseTestClass;


//this is the java class for the page objects of Blazedemo Home page 
public class BlazeDemoHomePage extends BaseTestClass {
	
	
	public String chooseCity_DD="//select[@name='fromPort']";
	public String chooseDestination_DD="//select[@name='toPort']";
	public String findFlights_Btn="//input[@value='Find Flights']";
	
	
	public void selectDepartureCity(String departuredropdown,String departurecityname)
	{
		
		Select dd1 = new Select(driver.findElement(By.xpath(chooseCity_DD)));
		dd1.selectByValue(departurecityname);
	}
	
	
	public void selectDestinationCity(String destinationdropdown,String destinatiomcityname)
	{
		
		Select dd2 = new Select(driver.findElement(By.xpath(chooseDestination_DD)));
		dd2.selectByValue(destinatiomcityname);
	}
	
	public void clickFindflights_Btn()
	{
		driver.findElement(By.xpath(findFlights_Btn));
	}
	
	
	

}
