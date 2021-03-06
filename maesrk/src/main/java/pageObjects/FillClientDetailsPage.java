package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import baseClass.BaseTestClass;

public class FillClientDetailsPage extends BaseTestClass{
	
	public String name_txtBx="//input[@id='inputName']";
	public String address_txtBx="//input[@id='address']";
	public String city_txtBx="//input[@name='city']";
	public String state_txtBx="//input[@name='state']";
	public String zipCode_txtbx="//input[@name='zipCode']";
	public String cardType_DD="//select[@name='cardType']";
	public String creditCardNumber_txtBx="//input[@id='creditCardNumber']";
	public String month_txtBx="//input[@id='creditCardMonth']";	
	public String year_txtBx="//input[@id='creditCardYear']";
	public String nameOnCard_txtBx="//input[@id='nameOnCard']";
	public String rememberMe_chkbx="//input[@name='rememberMe' ]";
	public String purchaseFligt_Btn="//input[@value='Purchase Flight' ]";
	
	
	
	public void fillName(String name)
	{
		driver.findElement(By.xpath(name_txtBx)).sendKeys(name);
	}
	
	public void fillAddress(String name)
	{
		driver.findElement(By.xpath(address_txtBx)).sendKeys(name);
	}
	
	public void fillCity(String name)
	{
		driver.findElement(By.xpath(city_txtBx)).sendKeys(name);
	}
	
	public void fillState(String name)
	{
		driver.findElement(By.xpath(state_txtBx)).sendKeys(name);
	}
	
	public void fillZipCode(String name)
	{
		driver.findElement(By.xpath(zipCode_txtbx)).sendKeys(name);
	}
	
	public void selectCardType(String cardType)
	{
		Select dd = new Select(driver.findElement(By.xpath(cardType_DD)));
		dd.selectByValue(cardType);
	}
	
	
	public void fillCreditCardNumber(String name)
	{
		driver.findElement(By.xpath(creditCardNumber_txtBx)).sendKeys(name);
	}
	
	public void fillMonth(String name)
	{
		driver.findElement(By.xpath(month_txtBx)).sendKeys(name);
	}
	
	public void fillYear(String name)
	{
		driver.findElement(By.xpath(year_txtBx)).sendKeys(name);
	}
	
	public void fillNameOnCard(String name)
	{
		driver.findElement(By.xpath(nameOnCard_txtBx)).sendKeys(name);
	}
	
	public void clickPurchaseFlight() {
		driver.findElement(By.xpath(purchaseFligt_Btn)).click();
	}
}
