package StepDefinations;

import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import PageObject.DetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.DetailsPage;

public class C_DetailsPage {
	
	WebDriver driver;
	 Logger logger;
	Properties p;
	DetailsPage dt;

	@Given("User is on the Details page")
	public void user_is_on_the_details_page() throws  InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		driver = Hooks.getDriver(); 
		logger=Hooks.getLogger();
		 p=Hooks.getProperties();
		 dt=new DetailsPage(driver);
		 logger.info("*****User is on Details page");
	}

	@When("User clears the city field")
	public void user_clears_the_city_field() throws  InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	   dt.clear_city();
	}

	@When("User enters Bangalore in the city field")
	public void user_enters_bangalore_in_the_city_field()throws  InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   dt.pass_city();
	}

	@When("User enters Cardiologist in the document type field")
	public void user_enters_cardiologist_in_the_document_type_field() throws  InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   dt.pass_Doc();
	}

	@When("User selects a document")
	public void user_selects_a_document() throws  InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	    dt.select_doc();
	}

	@Then("Relevant doctors in Bangalore with the specialty {string} should be displayed")
	public void relevant_doctors_in_bangalore_with_the_specialty_should_be_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

}
