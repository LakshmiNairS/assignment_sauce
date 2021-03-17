package Logics;

import org.openqa.selenium.WebDriver;

import Pages.InventoryItemObject;

public class InventoryItemPage extends InventoryItemObject
{
	public void inventory(WebDriver driver,String sauceBack,String backPack,String amount) 
	
	{
		

		String producttitle = driver.findElement(sauceBackpack).getText();
		
		
		if(producttitle.equalsIgnoreCase(sauceBack)) 
		{
			
			System.out.println("The Product are same ");
			
		}
		else 
		{
			System.out.println("The Product are different ");
			
		}
		
		String productdes = driver.findElement(backpackDesc).getText();
		
		if(backPack.equalsIgnoreCase(productdes)) 
		{
			System.out.println("The Product Desc are same ");
		}
		else 
		{
			System.out.println("The Product Desc are different ");
			
		}
		String productAmount = driver.findElement(cost).getText();
		
		if(amount.equalsIgnoreCase(productAmount)) 
		{
			System.out.println("The Product Amount are same ");
		}
		else 
		{
			System.out.println("The Product Amount are different ");
			
		}
		driver.findElement(addCart).click();
		driver.findElement(cart).click();

		
	}
	

}
