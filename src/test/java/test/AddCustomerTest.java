package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {

	WebDriver driver;
	
	ExcelReader exlRead = new ExcelReader("testData\\TF_TestData.xlsx");
	String userName = exlRead.getCellData("LoginInfo", "UserName", 2);
	String password = exlRead.getCellData("LoginInfo", "Password", 2);
	String fullName = exlRead.getCellData("AddContactInfo", "FullName", 2);
	String company = exlRead.getCellData("AddContactInfo", "CompanyName", 2);
	String email = exlRead.getCellData("AddContactInfo", "Email", 2);
	String phone = exlRead.getCellData("AddContactInfo", "Phone", 2);
	String address = exlRead.getCellData("AddContactInfo", "Address", 2);
	String city = exlRead.getCellData("AddContactInfo", "City", 2);
	String country = exlRead.getCellData("AddContactInfo", "Country", 2);
	String state = exlRead.getCellData("AddContactInfo", "State", 2);
	String zip = exlRead.getCellData("AddContactInfo", "Zip", 2);
	
	
@Test	
	public void validCustomerShouldBeAbleToCreateCustomer() throws InterruptedException {
	 
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
		loginPage.enterUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSigninButton();
		
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickOnAddCustomer();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.validateAddConatctPage();
		addCustomer.insertFullname(fullName);
		addCustomer.selectCompany(company);
		addCustomer.insertEmail(email);
		addCustomer.insertPhone(phone);
		addCustomer.insertAddess(address);
		addCustomer.insertCity(city);
		addCustomer.insertState(state);
		addCustomer.insertZip(zip);
		addCustomer.selectCountry(country);
		addCustomer.clickSave();
	}

}
