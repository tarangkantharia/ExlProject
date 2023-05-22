package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {
	
	WebDriver driver;
	
	ExcelReader exlRead = new ExcelReader("testData\\TF_TestData.xlsx");
	String userName = exlRead.getCellData("LoginInfo", "UserName", 2);
	String password = exlRead.getCellData("LoginInfo", "Password", 2);
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		//Connecting LoginPage by calling it as below
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName(userName);
		loginpage.insertPassword(password);
		loginpage.clickOnSigninButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		
		BrowserFactory.tearDown();
	}

}
