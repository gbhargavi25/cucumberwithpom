package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.pages.HomePage;
import com.qa.pages.SearchResultsPage;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	public WebDriver driver;
	private HomePage homePage;
	private SearchResultsPage searchResultsPage;
	
	 @Given("^User opens the Application$")
	    public void user_opens_the_application() {
		 driver = DriverFactory.getDriver();
	    }

	    @When("^User enters valid product \"([^\"]*)\" into Search box field$")
	    public void user_enters_valid_product_something_into_search_box_field(String validProduct) {
	    	homePage = new HomePage(driver);
			homePage.enterProductIntoSearchBox(validProduct);
			
	    }
	    @And("^User clicks on Search button$")
	    public void user_clicks_on_search_button()  {
	    	searchResultsPage = homePage.clickOnSearchButton();   
	    }

	    @Then("^User should get valid product displayed in search results$")
	    public void user_should_get_valid_product_displayed_in_search_results()  {
	    	Assert.assertTrue(searchResultsPage.displayStatusOfValidProduct());
	    }

	    @When("^User enters invalid product \"([^\"]*)\" into Search box field$")
	    public void user_enters_invalid_product_something_into_search_box_field(String invalidProduct) {
	    	homePage = new HomePage(driver);
			homePage.enterProductIntoSearchBox(invalidProduct);
	    }
	    @Then("^User should get a message about no product matching$")
	    public void user_should_get_a_message_about_no_product_matching()  {
	    	Assert.assertEquals("There is no product that matches the search criteria.",
	    			searchResultsPage.getMessageText());
	    }
	    		
	    @When("^User dont enter any product name into Search box field$")
	    public void user_dont_enter_any_product_name_into_search_box_field()  {
	    	
	    	homePage = new HomePage(driver);
	    }


	    

	    

}
