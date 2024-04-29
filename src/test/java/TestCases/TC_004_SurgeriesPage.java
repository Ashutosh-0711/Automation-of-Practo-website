package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.SurgeriesPage;
import TestBase.BaseClass;


public class TC_004_SurgeriesPage extends BaseClass{
	public SurgeriesPage sp;
	
	@Test(priority = 2)
	public void pageScroll() throws Exception {
		sp = new SurgeriesPage(driver);
		sp.Scroll();
		captureScreen("surgeryList");
		
		logger.info("page is scrolled");

	}
	@Test(priority = 20, groups= {"master", "sanity"})
	public void print_SurgriesType() {
		sp=new SurgeriesPage(driver);
		
		sp.Surgeries_type();
		logger.info("surgery list is displayed");
	}
	
	@Test(priority = 21, groups= {"master", "sanity"})
	public void Select_HealthWellness() {
		
		sp=new SurgeriesPage(driver);
		Assert.assertEquals(sp.For_corp().isDisplayed(), true);
		sp.click_forCorp();
		sp.click_HeathWell();
		logger.info("***TC_04_CorporateWellness***");
	}
	
	
}
