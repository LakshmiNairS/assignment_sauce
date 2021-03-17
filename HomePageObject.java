package Pages;

import org.openqa.selenium.By;

public class HomePageObject
{
	public By logo= By.xpath("//div[@class='login_logo']");
	public By username = By.xpath("//input[@id='user-name']");
	public By password = By.xpath("//input[@id='password']");
	public By loginbutton= By.xpath("//input[@id='login-button']");
	public By usernamelist = By.xpath("//div[@id='login_credentials']");
	public By passwordlist = By.xpath("//div[@class='login_password']");
	
	
	

}
