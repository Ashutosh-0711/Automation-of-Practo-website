package StepDefinations;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.FormPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.SurgeriesPage;

public class C_FormPage {
	
	WebDriver driver;
	 Logger logger;
	Properties p;
	FormPage fp;
	
	@Given("User is on the Form page")
	public void user_is_on_the_form_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver=Hooks.getDriver();
		   logger=Hooks.getLogger();
		   p=Hooks.getProperties();
	   fp=new FormPage(driver);
	   logger.info("CorporateWellness Form is opened");
	}

	@When("User enters invalid details in the form")
	public void user_enters_invalid_details_in_the_form() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    fp.Enter_DetailsInvalid();
	}

	@When("User selects organization size and area of interest")
	public void user_selects_organization_size_and_area_of_interest() {
	    // Write code here that turns the phrase above into concrete actions
	    fp.organization_size_and_Interest();
	}

	@When("User clicks on the Schedule a demo button")
	public void user_clicks_on_the_schedule_a_demo_button() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	    fp.Click_Button();
	}

	@Then("User should not be able to submit the form")
	public void user_should_not_be_able_to_submit_the_form() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    fp.clearDetail();
	}

	@When("User enters valid details in the form")
	public void user_enters_valid_details_in_the_form() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	   fp.Enter_DetailsValid();
	}

	@Then("User should see a confirmation message")
	public void user_should_see_a_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
