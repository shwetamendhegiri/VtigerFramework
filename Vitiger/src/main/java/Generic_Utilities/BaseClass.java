package Generic_Utilities;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import ObjectRepository.HomePage;
import ObjectRepository.VtigerLoginPage;


public class BaseClass {

	public static WebDriver sDriver;
	public WebDriver driver;
	public File_Utility flib = new File_Utility();
	public WebDriver_Utility wlib = new WebDriver_Utility();
	public Java_Utility jlib = new Java_Utility();
	public Excel_Utility elib = new Excel_Utility();

	@BeforeSuite
	public void bs() {
		System.out.println("DataBase Connection");
	}

	@BeforeTest
	public void bt() {
		System.out.println("parallel execution");
	}

	@BeforeClass
	public void bc() throws Throwable
	{
	 String BROWSER = flib.getKeyAndValueData("browser");
		 if(BROWSER.equalsIgnoreCase("chrome"))
		 {

			  driver=new ChromeDriver();
		 }
		 else if(BROWSER.equalsIgnoreCase("fireFox"))
		 {
			
			 driver=new FirefoxDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }

		System.out.println("Browser launched");
		sDriver = driver;
	}

	@BeforeMethod
	public void bm() throws Throwable {
		String URL = flib.getKeyAndValueData("url");
		String USERNAME = flib.getKeyAndValueData("username");
		String PASSWORD = flib.getKeyAndValueData("password");

		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.maximizeWindow(driver);
		wlib.waitForElementToLoad(driver);

		driver.get(URL);
		VtigerLoginPage login = new VtigerLoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);
		System.out.println("login to Application");
	}

	@AfterMethod
	public void am() {
		HomePage home = new HomePage(driver);
		home.logOutFromApp();
		System.out.println("logout from application");
	}

	@AfterClass
	public void ac() {
		driver.quit();
		System.out.println("close browser");
	}

	@AfterTest
	public void at() {
		System.out.println("parallel execution done");
	}

	@AfterSuite
	public void as() {
		System.out.println("close database");
	}
}