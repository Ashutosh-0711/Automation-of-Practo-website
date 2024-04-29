package PageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.INutilities;



public class FormPage extends BasePage{

	public FormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
	public INutilities ut;
	
	
	@FindBy(xpath="//*[@id='name']")
	WebElement Form_name;
	
	@FindBy(xpath="//input[@id='organizationName']")
	WebElement Form_orgName;
	
	@FindBy(xpath="//input[@id='contactNumber']")
	WebElement Form_cont;
	
	@FindBy(xpath="//input[@id='officialEmailId']")
	WebElement Form_email;
	
	@FindBy(xpath = "//select[@id='organizationSize']")
	WebElement drop;

	@FindBy(xpath = "//select[@id='interestedIn']")
	WebElement interest;

	@FindBy(xpath = "//button[normalize-space()='Schedule a demo']")
	WebElement button;
	
	@FindBy(xpath = "//div[@class='u-text--bold text-alpha']")
	WebElement dispalyed;

	public void Enter_DetailsInvalid() throws IOException {
		List<String> mylist=INutilities.Invalid_FormData();
		Form_name.sendKeys(mylist.get(0));
		
		Form_orgName.sendKeys(mylist.get(1));
		
		Form_cont.sendKeys(mylist.get(2));
		
		
		Form_email.sendKeys(mylist.get(3));
	}
	
	
	public void organization_size_and_Interest() {
		Select size = new Select(drop);
		size.selectByVisibleText("10001+");
		Select interested = new Select(interest);
		interested.selectByVisibleText("Taking a demo");
	}
	
	
	public void Click_Button() throws InterruptedException, IOException {
		boolean check = button.isEnabled();
		if (check == true) {
			button.click();
			Thread.sleep(15000);
			String message = dispalyed.getText();
			System.out.println(message);
		} else {
			
	        System.out.println("not enabled");
		}
		
	}
	
	public void clearDetail() throws InterruptedException {
		Form_name.clear();
		Form_orgName.clear();
		Form_cont.clear();
		Form_email.clear();
		Thread.sleep(2000);
	}
	
	public void Enter_DetailsValid() throws IOException {
		List<String> mylist2=INutilities.valid_FormData();
		Form_name.sendKeys(mylist2.get(0));
		
		Form_orgName.sendKeys(mylist2.get(1));
		
		Form_cont.sendKeys(mylist2.get(2));
		
		
		Form_email.sendKeys(mylist2.get(3));
		
		
	}

	
}