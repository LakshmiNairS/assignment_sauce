package Pages;

import org.openqa.selenium.By;

public class CheckoutPageObject 
{

	
	public By firstName = By.xpath("//*[@id='first-name']");
	public By lastName = By.xpath("//*[@id='last-name']");
	public By zipCode =By.xpath("//*[@id='postal-code']");
	public By continuebtn = By.xpath("//*[@value='CONTINUE']");
}
