package Organization;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import ObjectRepository.CreateOrganizationPage;
import ObjectRepository.HomePage;
@Listeners(Generic_Utilities.list.class)
public class CreateOrganization1Test extends BaseClass {
	
	
	//@Test//(groups = {"smokeTest","regressionTest"})
	@Test(retryAnalyzer = Generic_Utilities.RetryImpl.class)
	public void createOrganization1Test() throws Throwable {
		HomePage home = new HomePage(driver);
		home.clickOrganizationLink();

		CreateOrganizationPage orgPage = new CreateOrganizationPage(driver);
		orgPage.clickOrganizationPlusSign();
		
		int ranNum = jlib.getRandomNumber();
		String organizationData = elib.readExcelDataUsingDataFormatter("Organization", 0, 0) + ranNum;
		
		orgPage.enterOrgName(organizationData);
		orgPage.clickSaveButton();
		String actData=driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		
//		Assert.assertEquals(actData, organizationData);
//		Assert.assertTrue(actData.contains(organizationData));
	//	Assert.assertTrue(actData.contains(organizationData),organizationData +"campaign name not verified");
		
	//  SoftAssert soft = new SoftAssert();
	//  soft.assertEquals(actData, campaginName);
	//  soft.assertAll();
		
		Thread.sleep(2000);

	}

}