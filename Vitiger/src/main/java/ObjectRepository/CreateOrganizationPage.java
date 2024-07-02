package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(css = "[alt='Create Organization...']")
	private WebElement organizationPlusSign;

	@FindBy(name = "accountname")
	private WebElement accountName;

	@FindBy(id = "phone")
	private WebElement phoneNumber;

	@FindBy(id = "email1")
	private WebElement email;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public WebElement getOrganizationPlusSign() {
		return organizationPlusSign;
	}

	public WebElement getAccountName() {
		return accountName;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public void clickOrganizationPlusSign() {
		organizationPlusSign.click();

	}
	
	public void enterOrgName(String campName) {
		accountName.sendKeys(campName);
	}
	

	
	public void clickSaveButton() {
		saveButton.click();
	}

}
