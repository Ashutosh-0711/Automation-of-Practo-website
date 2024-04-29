package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.DetailsPage;
import TestBase.BaseClass;

public class TC_002_DetailsPage extends BaseClass{
	public DetailsPage ph;
	
	@Test(priority = 2, groups= {"master", "sanity"})
	public void clear_Details() throws InterruptedException {
		ph=new DetailsPage(driver);
		logger.info("****TC_02_Detail started****");
		ph.clear_city();
		ph.pass_city();
		logger.info("location is passed");
	//Assert.assertEquals(ph.return_city().getText(), "Chennai");
	}
	
	@Test(priority = 4, groups= {"master", "sanity"})
	public void give_Specility() throws InterruptedException {
		ph=new DetailsPage(driver);
		ph.pass_Doc();
		ph.select_doc();
		logger.info("speciality is selected");
	
	
	}
}