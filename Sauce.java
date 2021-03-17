package Logics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce {
	static WebDriver driver;
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		LoginPage login = new LoginPage();
		login.userName(driver);
		login.password(driver);
		login.loginbtn(driver);
		InventoryPage inventory = new InventoryPage();
		inventory.sauceBackHeadline(driver);

		CheckoutPage checkout = new CheckoutPage();
		checkout.Checkout(driver);
		
		CheckoutOverviewPage overview = new CheckoutOverviewPage();
		overview.overviewPage(driver);
		
		CheckoutCompletePage complete = new CheckoutCompletePage();
		complete.completePage(driver);
		
		driver.close();
		
		
	}
	

}
