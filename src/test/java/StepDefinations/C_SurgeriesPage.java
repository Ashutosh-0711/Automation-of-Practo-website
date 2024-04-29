package StepDefinations;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.SurgeriesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.SurgeriesPage;

public class C_SurgeriesPage {
	
	WebDriver driver;
	 Logger logger;
	Properties p;
	SurgeriesPage sp;
	
	
	@Given("User is on the Surgeries page")
	public void user_is_on_the_surgeries_page() {
	    // Write code here that turns the phrase above into concrete actions
		 driver=Hooks.getDriver();
		   logger=Hooks.getLogger();
		   p=Hooks.getProperties();
		   sp=new SurgeriesPage(driver);
	}

	@When("User scrolls to view the surgeries list")
	public void user_scrolls_to_view_the_surgeries_list() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    sp.Scroll();
	}

	@Then("User should see various surgeries listed")
	public void user_should_see_various_surgeries_listed() {
	    // Write code here that turns the phrase above into concrete actions
	    sp.Surgeries_type();
	}

	@Then("User clicks on the For Corporate button")
	public void user_clicks_on_the_button1() {
	    // Write code here that turns the phrase above into concrete actions
	    sp.click_forCorp();
	}
	
	@Then("User clicks on the Health & Wellness Plan button")
	public void user_clicks_on_the_button2() {
	    // Write code here that turns the phrase above into concrete actions
	    sp.click_HeathWell();
	}

}
