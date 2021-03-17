package Pages;

import org.openqa.selenium.By;

public class InventoryPageObject {
	public By logo = By.xpath("//div[@class='app_logo']");
	public By menu = By.xpath("//button[text()='Open Menu']");
	public By header = By.xpath("//div[@class='product_label']");
	public By container = By.xpath("//select[@class='product_sort_container']");
	public By sauceBackpack = By.xpath("//div[text()='Sauce Labs Backpack']");
	public By backpackDesc= By.xpath("//div[starts-with (text(),'carry.allTheThings()')]");
	public By cost = By.xpath("(//div[@class='inventory_item_price'])[1]");
	public By backpackAddCart= By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item_label']/following-sibling::div/button[@class=\"btn_primary btn_inventory\"]");
	public By backpackRemove= By.xpath("//div[text()='Sauce Labs Backpack']//ancestor::div[@class='inventory_item_label']/following-sibling::div/button[@class='btn_secondary btn_inventory']");
	
	

}
