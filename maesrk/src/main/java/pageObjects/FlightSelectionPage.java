package pageObjects;

import java.util.Random;

import org.openqa.selenium.By;

import baseClass.BaseTestClass;


//Since we need to check whether by flight is booked using any airlines hence using random to generate
//a random integer from 1 to 5 
public class FlightSelectionPage extends BaseTestClass{
	
	
	Random rand = new Random();
	int n = rand.nextInt(5);
	
	String x= String.valueOf(n+1);
	
	public String chooseFlight_Btn="//tr//form[@name='VA43']//following::input[@value='Choose This Flight'][%s]"; 
	
	
	public void clickChooseFlight() {
		
		String exactXpath= String .format(chooseFlight_Btn, x);
		driver.findElement(By.xpath(exactXpath)).click();
		
		
	}
	
	

}
