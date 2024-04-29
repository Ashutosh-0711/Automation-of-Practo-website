package StepDefinations;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.Filter_details;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.Filter_details;

public class C_FilterPage {
	WebDriver driver;
	 Logger logger;
	Properties p;
	Filter_details fd;

	@Given("User is on the Filter Details page")
	public void user_is_on_the_filter_details_page() {
		driver=Hooks.getDriver();
		   logger=Hooks.getLogger();
		   p=Hooks.getProperties();
		   fd=new Filter_details(driver);
	}

	@When("User clicks on the story filter")
	public void user_clicks_on_the_story_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    fd.click_story();
	}

	@When("User selects the second story")
	public void user_selects_the_second_story() {
	    // Write code here that turns the phrase above into concrete actions
	   fd.pass_story2();
	}

	@When("User clicks on the experience filter")
	public void user_clicks_on_the_experience_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    fd.click_Expe();
	}

	@When("User selects the second experience option")
	public void user_selects_the_second_experience_option() {
	    // Write code here that turns the phrase above into concrete actions
	    fd.pass_expe();
	}

	@When("User clicks on the all filters dropdown")
	public void user_clicks_on_the_all_filters_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	   fd.click_allfilter();
	}

	@When("User selects the fee filter")
	public void user_selects_the_fee_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    fd.pass_fee();
	}

	@When("User selects the available today filter")
	public void user_selects_the_available_today_filter() {
	    // Write code here that turns the phrase above into concrete actions
	    fd.pass_avilbt();
	}

	@When("User clicks on the sort by dropdown")
	public void user_clicks_on_the_sort_by_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    fd.click_sortby();
	}

	@When("User selects the consultation fee option")
	public void user_selects_the_consultation_fee_option() {
	    // Write code here that turns the phrase above into concrete actions
	   fd.pass_consfee();
	}

	@When("User scrolls the page")
	public void user_scrolls_the_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   fd.ScrollPage();
	}

	@Then("User should see details of top {int} doctors including their name, experience, consultation fee, and clinic address")
	public void user_should_see_details_of_top_doctors_including_their_name_experience_consultation_fee_and_clinic_address(Integer int1) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    fd.Doc_name();
	    fd.Expe_year();
	    fd.Consult_fee();
	    fd.Clinic_address();
	}

	@Then("User clicks on the surgeries button")
	public void user_clicks_on_the_surgeries_button() {
	    // Write code here that turns the phrase above into concrete actions
	    fd.Click_surgeriesButton();
	}

}
