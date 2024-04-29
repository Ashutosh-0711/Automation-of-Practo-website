package TestBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.async.AsyncLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class BaseClass {
	public static WebDriver driver;
	public static Logger logger;
	public static Properties p;
	
	@BeforeTest(groups = {"master", "sanity", "regression"})
	@Parameters({"os","browser"} )
	public void setup(String os,String browser) throws IOException, InterruptedException{
		
		FileReader file = new FileReader(".//src/test/resources/config.properties");
		p=new Properties();
		p.load(file);
		
		
		logger = LogManager.getLogger(this.getClass());
		
		 if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {

					DesiredCapabilities capabalities = new DesiredCapabilities();

					//os

					if(os.equalsIgnoreCase("windows")) {

						capabalities.setPlatform(Platform.WIN11);

					}

					else if (os.equalsIgnoreCase("mac")) {

						capabalities.setPlatform(Platform.MAC);

					}

					else {

						System.out.println("no matching os .....");


					}

					//browser

					if(browser.equalsIgnoreCase("chrome")) {

						capabalities.setBrowserName("chrome");

					}

					else if(browser.equalsIgnoreCase("edge")) {

						capabalities.setBrowserName("MicrosoftEdge");

					}

					else {

						System.out.println("no matching browser .....");


					}
		 
					 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub") , capabalities);

				}

				else if(p.getProperty("execution_env").equalsIgnoreCase("local")) {

					// launching browser based on condition - locally

					if(browser.equalsIgnoreCase("chrome")) {

						driver = new ChromeDriver();

						logger.info("Chrome browser opened successfully");

					}

					else if(browser.equalsIgnoreCase("edge")){

						driver = new EdgeDriver();

						logger.info("Edge browser opened successfully");

					}

					else {

						System.out.println("no matching browser......");

						logger.info("no matching browser......");

					}
		 
				}
		
//		if(browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//			logger.info(browser +" "+ "browser opened successfully");			
//			
//					
//		}
//		else if(browser.equalsIgnoreCase("Edge")){
//			driver = new EdgeDriver();
//			logger.info(browser +" "+ "browser opened successfully");	
//	}
//		
		driver.get(p.getProperty("appUrl"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
 

}
	@AfterTest(groups = {"master", "sanity", "regression"})
	public void tearDown() {
		driver.quit();
		
	}
	public String captureScreen(String name) throws IOException {
		 {String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
			File sourceFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
			String targetFilePath=System.getProperty("user.dir")+"\\Screenshot\\" + name +"-" + timeStamp + ".png";
			File targetFile = new File(targetFilePath);
			sourceFile.renameTo(targetFile);
			return targetFilePath;
				
		 }
}
	}
