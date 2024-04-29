package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import PageObject.FormPage;
import TestBase.BaseClass;
import utilities.INutilities;

public class TC_005_FormPage extends BaseClass{

	public FormPage fp;

	
	
	@Test(priority = 22, groups= {"master", "sanity", "regression"})
	public void Invalid_formInput() throws IOException, InterruptedException {
		fp= new FormPage(driver);
		fp.Enter_DetailsInvalid();
		logger.info("details entered");
	}
	
	@Test(priority = 23, groups= {"master", "sanity", "regression"})
	public void sizeOfOrganizationAndInterest() throws IOException {
		fp= new FormPage(driver);
		fp.organization_size_and_Interest();
		logger.info("orgniztion size is selected");
		captureScreen("invalid");
	}
	
	@Test(priority = 24, groups= {"master", "sanity", "regression"})
	public void SubmitButton() throws InterruptedException, IOException {
		fp= new FormPage(driver);
		fp.Click_Button();
	    captureScreen("messge1");
	  logger.info("submit button is clicked");
	}
	
	@Test(priority = 25, groups= {"master", "sanity", "regression"})
	public void clear() throws InterruptedException {
		fp= new FormPage(driver);
		fp.clearDetail();
	}
	
	@Test(priority = 26, groups= {"master", "sanity", "regression"})
	public void valid_formInput() throws IOException, InterruptedException {
		fp= new FormPage(driver);
		fp.Enter_DetailsValid();
	}
	
	
	 @Test(priority=27, groups= {"master", "sanity", "regression"})
     public void organization_size_and_Interest() {
		 fp= new FormPage(driver);
		 fp.organization_size_and_Interest();
 		logger.info("orgniztion size is selected");
 	}
     
     @Test(priority=28, groups= {"master", "sanity", "regression"})
     public void SubmitButton1() throws InterruptedException, IOException {
    	 fp= new FormPage(driver);
    	 fp.Click_Button();
   	     captureScreen("messge");
   		logger.info("submit button is clicked");
   	}
     
	}

