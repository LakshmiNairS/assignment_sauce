package Logics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.CartObject;

public class CartPage extends CartObject

{
public void cartpage(WebDriver driver, String sauceBack, String backPack,String  amount)
{
	String  cartProductName = driver.findElement(sauceBackpack).getText();
	
	
	if(sauceBack.equalsIgnoreCase(cartProductName)) 
	{
		System.out.println("The CartProductName are same ");
		
		
	}
	else 
	{ 
		System.out.println("The CartProductName are different ");
	
	}
	
	
	String cartProductDec = driver.findElement(backpackDesc).getText();
	
	if(backPack.equalsIgnoreCase(cartProductDec))
	{
		System.out.println("The CartProductDec are same ");
		
		
	}
	else 
	{ 
		System.out.println("The CartProductDec are different ");
	
	}
	String cartProductAmt = driver.findElement(Cost).getText();
	
	if(amount.equalsIgnoreCase(cartProductAmt))
	{
		System.out.println("The CartProductamt are same ");
		
		
	}
	else 
	{ 
		System.out.println("The CartProductamt are different ");
	
	}
	
	driver.findElement(checkoutBtn).click();
}

	
	

}
