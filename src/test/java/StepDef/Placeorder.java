package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Placeorder {
 WebDriver driver= new ChromeDriver();
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	   driver.get("https://tutorialsninja.com/demo/");
	}

	@When("User search an item {string}")
	public void user_search_an_item(String string) {
	driver.findElement(By.name("search")).click();
	
	driver.findElement(By.name("search")).sendKeys(string);
	driver.findElement(By.name("search")).sendKeys(Keys.ENTER);
	}

	@Then("Item must be listed")
	public void item_must_be_listed() {
		

	}

	@Given("User should be on search result page")
	public void user_should_be_on_search_result_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User add item to cart")
	public void user_add_item_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Item must be added")
	public void item_must_be_added() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User do checkout")
	public void user_do_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Should navigate to Checkout page")
	public void should_navigate_to_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
