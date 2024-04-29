package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObject.Filter_details;
import TestBase.BaseClass;

public class TC_003_FilterPage extends BaseClass{

	public Filter_details sd;
	
	@Test(priority=6, groups= {"master", "regression"})
	public void Give_Storyfil() {
		sd= new Filter_details(driver);
		sd.click_story();
		sd.pass_story2();
		logger.info("filter for patient story is selected ");
	
	}
	
	@Test(priority = 8, groups= {"master", "regression"})
	public void Give_Expe() {
		sd=new Filter_details(driver);
		sd.click_Expe();
		sd.pass_expe();
		logger.info("filter for doctor experience is selected");

	}
	
	@Test(priority = 10, groups= {"master",  "regression"})
	public void allFilter_click() {
		sd = new Filter_details(driver);
		sd.click_allfilter();
		sd.pass_fee();
		sd.pass_avilbt();
		logger.info("filter for fee and availablity is selected");
	}
	
	@Test(priority = 13, groups= {"master", "regression"})
	public void Select_sortby(){
		sd=new Filter_details(driver);
		sd.click_sortby();
		sd.pass_consfee();
		logger.info("sort by is clicked and sort by selected");
	}
	@Test(priority = 14, groups= {"master"})
	public void scrollDown() throws InterruptedException, IOException {
		sd=new Filter_details(driver);
		sd.ScrollPage();
		captureScreen("namedoc1");

		logger.info("page is scroll down");
	}
	
	
	@Test(priority = 15, groups= {"master",  "regression"})
	public void Print_docName() throws IOException {
		sd=new Filter_details(driver);
		sd.Doc_name();
		logger.info("list of top 5 doctor's name is printed");
	}
	
	@Test(priority = 16, groups= {"master","regression"})
	public void Print_docExpe() throws IOException {
		sd=new Filter_details(driver);
		sd.Expe_year();
		logger.info("list of top 5 doctor's experience is printed");
	}
	
	@Test(priority = 17, groups= {"master", "regression"})
	public void Print_DocAddress() throws IOException {
		sd=new Filter_details(driver);
		sd.Clinic_address();
		logger.info("list of top 5 doctor's clinic is printed");
	}
	
	@Test(priority = 18, groups= {"master", "regression"})
	public void Print_docFee() throws IOException {
		sd=new Filter_details(driver);
		sd.Consult_fee();
		logger.info("list of top 5 doctor's consultation fee is printed");
	}
	
	
	
	@Test(priority = 19, groups= {"master", "regression"})
	public void Click_surgeries() {
		sd=new Filter_details(driver);
		sd.Click_surgeriesButton();
		logger.info("clicked on surgeries Button");
	}
}
