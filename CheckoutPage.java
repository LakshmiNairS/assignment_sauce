package Logics;

import org.openqa.selenium.WebDriver;

import Pages.CheckoutPageObject;

public class CheckoutPage extends CheckoutPageObject
{
	public void Checkout(WebDriver driver) 
	{
		driver.findElement(firstName).sendKeys("Lakshmi");
		driver.findElement(lastName).sendKeys("Nair");
		driver.findElement(zipCode).sendKeys("641004");
		driver.findElement(continuebtn).click();
		
	}
	

}
