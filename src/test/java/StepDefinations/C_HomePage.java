package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObject.HomePage;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C_HomePage {
	WebDriver driver;
	HomePage hp;
	Properties p;
	Logger logger;
	Hooks hk;
	
	
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver=Hooks.getDriver();
		logger=Hooks.getLogger();
		p=Hooks.getProperties();
		hp = new HomePage(driver);
	   
	}

	@When("User clicks on the Find Doctors section")
	public void user_clicks_on_the_section() {
	    // Write code here that turns the phrase above into concrete actions
		hp=new HomePage(driver);
		hp.Find_doc();
	    
	}

	@Then("User should be directed to the Find Doctors page")
	public void user_should_be_directed_to_the_find_doctors_page() {
	    // Write code here that turns the phrase above into concrete actions
		String Expected_Title="Practo | Book Doctor Appointments Online, Order Medicine, Diagnostic Tests, Consult";
		String Actutal_Title=driver.getTitle();
		Assert.assertEquals(Actutal_Title, Expected_Title);
	    
	}
}
