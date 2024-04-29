package PageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelOutputUtils;

public class Filter_details extends BasePage{
	
	public JavascriptExecutor js = (JavascriptExecutor) driver;

	public Filter_details(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@class='c-filter__top__wrapper']/div[2]")	
	WebElement Filter_Story;
	
	@FindBy(xpath="//*[@data-qa-id='doctor_review_count_section']/ul/li[2]")	
	WebElement Story_Two;
	
	@FindBy(xpath="//*[@class='c-filter__top__wrapper']/div[3]")	
	WebElement Filter_Expe;
	
	@FindBy(xpath="//*[@data-qa-id='years_of_experience_list']/li[2]")	
	WebElement Expe_radiotwo;
	
	@FindBy(xpath="//*[@data-qa-id='all_filters']")
	WebElement AllFilter_drop;
	
	@FindBy(xpath="//*[@data-qa-id='Above ₹2000_label']")
	WebElement Fee_radio;
	
	@FindBy(xpath="//*[@data-qa-id='Available Today_label']")
	WebElement Avilbt_radio;
	
	@FindBy(xpath="//*[@data-qa-id='sort_by_selected']")
	WebElement SortBy_drop;
	
	@FindBy(xpath="//*[@aria-label=\"Consultation Fee - Low to High\"]")
	WebElement Consfee_drop;
	
	@FindBy(xpath="//*[@id='container']/div/div[4]/div/div[1]/div/div[2]/div[2]")
	WebElement scrollTill1;

	@FindBy(xpath = "//button[@class='c-guided-filter']")
	WebElement scrollTill2;

	
	@FindBy(xpath="//*[@class='doctor-name']")
	List<WebElement> Name_list;
	
	@FindBy(xpath="//*[@data-qa-id=\"doctor_experience\"]")
	List<WebElement> Expe_list;
	
	@FindBy(xpath="//*[@data-qa-id=\"consultation_fee\"]")
	List<WebElement> fee_list;
	
	@FindBy(xpath="//*[@data-qa-id='doctor_clinic_name']")
	List<WebElement> address_list;
	
	@FindBy(xpath="//*[@class='product-tab__title'][contains(text(),'Surgeries')]")
	WebElement surgeries_button;
	
	public void click_story() {
		Filter_Story.click();
	}
	
	public void pass_story2() {
		Story_Two.click();
	}
	
	public void click_Expe() {
		Filter_Expe.click();
	}
	
	public void pass_expe() {
		Expe_radiotwo.click();
	}
	
	public void click_allfilter() {
		AllFilter_drop.click();
	}
	
	public void pass_fee() {
		Fee_radio.click();
	}
	
	public void pass_avilbt() {
		Avilbt_radio.click();
	}
	
	public void click_sortby() {
		SortBy_drop.click();
	}
	
	public void pass_consfee() {
		Consfee_drop.click();
	}
	
	public void ScrollPage() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", scrollTill1);
		Thread.sleep(10000);
		js.executeScript("arguments[0].scrollIntoView();", scrollTill2);
		

	}
	
	public void Doc_name() throws IOException {
		System.out.println("*************DOCTOR'S NAME**************");
		
		ExcelOutputUtils.setCellData("Sheet1", 1, 0, "DOCTOR'S NAME");
		
		int i=0;
		while(i<5) {
			System.out.println(Name_list.get(i).getText());
			String data = Name_list.get(i).getText();
			ExcelOutputUtils.setCellData("Sheet1", i + 2, 0, data);
			i++;
		}
	}
	
	public void Expe_year() throws IOException {
		System.out.println("*************DOCTOR'S EXPERIENCE***************");
		
		ExcelOutputUtils.setCellData("Sheet1", 1, 3, "DOCTOR'S EXPERIENCE");
		
		int i=0;
		while(i<5) {
			System.out.println(Expe_list.get(i).getText());
			String data2 = Expe_list.get(i).getText();
			ExcelOutputUtils.setCellData("Sheet1", i + 2, 3, data2);
			i++;
		}
	}
	public void Consult_fee() throws IOException {
		System.out.println("*************CONSULTATION FEE***************");
		
		ExcelOutputUtils.setCellData("Sheet1", 1, 14, "CONSULTATION FEE");
		
		int i=0;
		while(i<5) {
			System.out.println(fee_list.get(i).getText());
			String data5 = fee_list.get(i).getText();
			ExcelOutputUtils.setCellData("Sheet1", i + 2, 14, data5);
			i++;
		}
	}
	
	public void Clinic_address() throws IOException {
		System.out.println("*************CLINIC ADDRESSS***************");
		
		ExcelOutputUtils.setCellData("Sheet1", 1, 7, "DOCTOR'S CLINIC");
		
		int i=0;
		while(i<5) {
			System.out.println(address_list.get(i).getText());
			String data4 = address_list.get(i).getText();
			ExcelOutputUtils.setCellData("Sheet1", i + 2, 7, data4);
			i++;
		}
	}
	
	public void Click_surgeriesButton() {
		surgeries_button.click();
	}
	
}
