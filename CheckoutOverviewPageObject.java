package Pages;

import org.openqa.selenium.By;

public class CheckoutOverviewPageObject 
{

	public By checkoutprodName = By.xpath("//div[text()='Sauce Labs Backpack']");
	public By checkoutprodDesc = By.xpath("//*[starts-with(text(),'carry.allTheThings()')]");
	public By checkoutprodamt = By.xpath("//div[@class='inventory_item_price']");
	public By itemPrice = By.xpath("//div[@class='summary_subtotal_label']");
	public By taxPrice = By.xpath("//div[@class='summary_tax_label']");
	public By total = By.xpath("//div[@class='summary_total_label']");
	public By finish =By.xpath("//*[text()='FINISH']");
	
}
