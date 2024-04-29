package PageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SurgeriesPage extends BasePage{
	
	public JavascriptExecutor js = (JavascriptExecutor) driver;


	public SurgeriesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@class='mt-12px AilmentItem-module_itemText__XvCHL']")
	List<WebElement> Surgeries_list;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/main/div/div[4]/div[2]/div/div[1]/p[1]")
	WebElement scroll;
	
	@FindBy(xpath="//*[@event=\"Nav Provider Marketing:Interacted:Plus Corporate\"][contains(text(),'For Corporate')]")
    WebElement ForCorp_buttion;
	
	@FindBy(xpath="//a[@class='nav-interact'][contains(text(),'Health & Wellness Plan')]")
	WebElement HAWButton;

	
public void Scroll() throws Exception {
		
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		
	}

	public void Surgeries_type() {
		System.out.println("**********VARIOUS SURGERIES*****");
		for(int i=0; i<Surgeries_list.size(); i++) {
			System.out.println(Surgeries_list.get(i).getText());
		}
	}
	
	public void click_forCorp() {
		ForCorp_buttion.click();
	}
	
	public WebElement For_corp() {
		return ForCorp_buttion;
	}
	
	public void click_HeathWell() {
		HAWButton.click();
	}
	
}
