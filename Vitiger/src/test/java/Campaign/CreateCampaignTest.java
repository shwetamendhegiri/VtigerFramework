package Campaign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import ObjectRepository.CreateCampaignPage;
import ObjectRepository.HomePage;

public class CreateCampaignTest extends BaseClass {

    //pushOne2
	@Test
	public void createCampaignTest() throws Throwable {
		HomePage home = new HomePage(driver);

		home.clickMoreLink();
		home.clickCampaignLink();

		CreateCampaignPage camp = new CreateCampaignPage(driver);
		camp.clickCampPlusSign();

		int ranNum = jlib.getRandomNumber();
		String organizationData = elib.readExcelDataUsingDataFormatter("Sheet1", 0, 0) + ranNum;
		camp.enterCampName(organizationData);
		camp.clickOnSaveButton();
		String actData=driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
		
//		Assert.assertEquals(actData, organizationData);
//		Assert.assertTrue(actData.contains(organizationData));
		Assert.assertTrue(actData.contains(organizationData),organizationData +"campaign name not verified");
		Thread.sleep(2000);

	}

}
