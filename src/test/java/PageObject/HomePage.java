package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestBase.BaseClass;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(text(),\"Find Doctors\")][@class='product-tab__title']")
	WebElement Find_Doctors;
	
	public void Find_doc(){
		Find_Doctors.click();
		
	}
}
