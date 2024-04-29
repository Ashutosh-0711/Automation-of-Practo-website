package PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailsPage extends BasePage{
	public DetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@data-qa-id='omni-searchbox-locality']")
	WebElement City;
	
	@FindBy(xpath="//*[@data-qa-id='omni-searchbox-keyword']")
	WebElement Doc_Type;	
	
	@FindBy(xpath="//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[1]/span[1]/div")
	WebElement Doc_Drop;
	
	
	public void clear_city() {
		City.clear();
		
}
	public void pass_city() {
		City.sendKeys("Banglore");
		
	}
	
	
	public void pass_Doc() {
		Doc_Type.sendKeys("Cardiologist");
	}
	
	public void select_doc() {
		Doc_Drop.click();
	}
}
