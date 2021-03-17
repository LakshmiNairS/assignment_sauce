package Pages;

import org.openqa.selenium.By;

public class CartObject {
	
	public By logo = By.xpath("//div[@class='app_logo']");
	public By menu = By.xpath("//button[text()='Open Menu']");
	public By yourcart= By.xpath("//div[text()='Your Cart']");
	public By qty= By.xpath("//div[text()='QTY']");
	public By description = By.xpath("//div[text()='DESCRIPTION']");
	public By sauceBackpack = By.xpath("//div[text()='Sauce Labs Backpack']");
	public By backpackDesc= By.xpath("//div[starts-with (text(),'carry.allTheThings()')]");
	public By Cost= By.xpath("//div[@class='inventory_item_price']");
	public By Removebtn = By.xpath("//button[@class='btn_secondary cart_button']");
	public By continueShopping =By.xpath("//a[text()='Continue Shopping']");
	public By checkoutBtn = By.xpath("//a[text()='CHECKOUT']");
	public By cartlist =By.xpath("//div[@class='cart_quantity']");
	

}
