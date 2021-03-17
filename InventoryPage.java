package Logics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.InventoryPageObject;

public class InventoryPage extends InventoryPageObject
{	
	
	public void sauceBackHeadline(WebDriver driver) 
	
	{
		String sauceBack = driver.findElement(sauceBackpack).getText();
		 String backPack = driver.findElement(backpackDesc).getText();
		 String amount = driver.findElement(cost).getText(); 
		 
		 driver.findElement(sauceBackpack).click();
		 
		 InventoryItemPage productname = new InventoryItemPage();
		 productname.inventory(driver, sauceBack, backPack, amount);
		 
		 
		 CartPage cartname = new CartPage();
		 cartname.cartpage(driver, sauceBack, backPack, amount);
		 
		 
		 
		 
		 
	}
	
	

}
