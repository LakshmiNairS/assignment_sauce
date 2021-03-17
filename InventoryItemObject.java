package Pages;

import org.openqa.selenium.By;

public class InventoryItemObject 

{
	public By sauceBackpack = By.xpath("//div[text()='Sauce Labs Backpack']");
	public By backpackDesc= By.xpath("//div[starts-with (text(),'carry.allTheThings()')]");
	public By cost =By.xpath("//div[@class='inventory_details_price']");
	public By cart =By.xpath("//*[@role='img']");
	public By addCart =By.xpath("//*[text()='ADD TO CART']");
	
	
			

}
