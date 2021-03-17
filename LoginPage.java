package Logics;
import Pages.HomePageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends HomePageObject{
	
	
	public void userName(WebDriver driver) 
	
	{
	
	
	String  allElement  =driver.findElement(usernamelist).getText();
	
	String [] s = allElement.split(":");
	
	String username1 = s[1];
	
	String LoginID = (username1.substring(0, 15));


	driver.findElement(username).sendKeys(LoginID);

			

}

public void password(WebDriver driver) 

{


String  allElement  =driver.findElement(passwordlist).getText();

String [] s = allElement.split(":");

String password1 = s[1];

String LoginPWD = (password1.substring(0, 13));



driver.findElement(password).sendKeys(LoginPWD);

		

}

public void loginbtn(WebDriver driver) 
{
	
driver.findElement(loginbutton).click();
}
	
	
	
}
