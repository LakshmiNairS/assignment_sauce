package Logics;

import org.openqa.selenium.WebDriver;

import Pages.CheckoutOverviewPageObject;

public class CheckoutOverviewPage extends CheckoutOverviewPageObject {

	public void overviewPage(WebDriver driver) {
	
	float  productCost = Float.parseFloat (driver.findElement(itemPrice).getText().substring(13, 18));
	
	System.out.println("The itemPrice of the product is :" + productCost);
	

	float  taxCost = Float.parseFloat (driver.findElement(taxPrice).getText().substring(6, 10));
	System.out.println("The tax of the product is : "+ taxCost);
	
	float sum = productCost + taxCost;
	System.out.println("The Total cost is :" +sum);
	
		
	
	float  totalcost = Float.parseFloat(driver.findElement(total).getText().substring(8, 13));
	
	
	if(sum == totalcost) 
	{
		System.out.println("The Cost are equal");
	}else {
		System.out.println("The Cost are different ");
		}
	driver.findElement(finish).click();
	}
	
	

}