package Logics;

import org.openqa.selenium.WebDriver;

import Pages.CheckoutCompletePageObject;

public class CheckoutCompletePage extends CheckoutCompletePageObject

{
public void completePage(WebDriver driver)
{
String message= driver.findElement(thankyouMessage).getText();

String expectedMessage = "THANK YOU FOR YOUR ORDER";


if (expectedMessage.equalsIgnoreCase(message)) 
{
	System.out.println("The Order is successfully ");
}else
{
	System.out.println("The Order is not  successfully ");
	}



}
}

