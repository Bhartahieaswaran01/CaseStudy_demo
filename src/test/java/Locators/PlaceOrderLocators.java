package Locators;

import org.openqa.selenium.WebDriver;

public class PlaceOrderLocators {
WebDriver driver;
	
	public PlaceOrderLocators(WebDriver driver2) {
		driver=driver2;
	}
	public void openApp()
	{
		driver.get("https://tutorialsninja.com/demo/");
		  driver.manage().window().maximize();
		 // return driver;
	}
	
	
}
