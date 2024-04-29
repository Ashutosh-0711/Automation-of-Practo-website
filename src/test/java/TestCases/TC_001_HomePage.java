package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.HomePage;
import TestBase.BaseClass;

public class TC_001_HomePage extends BaseClass{

	public HomePage hp;
	@Test(priority = 1, groups= {"master", "sanity"})
	public void Click_FindDoc() {
		hp=new HomePage(driver);
		logger.info("***TC_01_homePage started***");
		String expected_Title="Practo | Video Consultation with Doctors, Book Doctor Appointments, Order Medicine, Diagnostic Tests";
		String actual_Title=driver.getTitle();
		System.out.println(actual_Title);
		Assert.assertEquals(expected_Title, actual_Title);
		hp.Find_doc();
		
	}
}
