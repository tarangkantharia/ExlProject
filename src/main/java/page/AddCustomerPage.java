package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADD_CONTACT_HEADER_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULLNAME_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SAVE_BUTTON_ELEMENT;

	public void verifyAddContactPage(String addContactHeaderText) {
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), addContactHeaderText);
	}

	public void insertFullname(String fullname) {

		FULLNAME_ELEMENT.sendKeys(fullname + generateRandomNum(9999));
		// Added generatedRandomNum afterward
	}

	public void selectCompany(String company) {
		selectFromDropdown(COMPANY_ELEMENT, company);
	}

	public void selectCountry(String country) {
		selectFromDropdown(COUNTRY_ELEMENT, country);
	}

	public void insertPhone(String Phone) {

		PHONE_ELEMENT.sendKeys(Phone);
	}

	public void insertEmail(String Email) {

		EMAIL_ELEMENT.sendKeys(Email + generateRandomNum(9999));
	}

	public void insertAddess(String Address) {

		ADDRESS_ELEMENT.sendKeys(Address);
	}

	public void insertCity(String City) {

		CITY_ELEMENT.sendKeys(City);
	}

	public void insertState(String State) {

		STATE_ELEMENT.sendKeys(State);
	}

	public void insertZip(String Zip) {

		ZIP_ELEMENT.sendKeys(Zip);
	}

	public void clickSave() {

		SAVE_BUTTON_ELEMENT.click();
	}

	public void validateAddConatctPage() {
		
		
	}

}
