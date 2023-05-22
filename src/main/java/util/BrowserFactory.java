package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
static WebDriver driver;
	
	public static WebDriver init() {
	//add static to call it in the different class (LoginTest class)	
	//Replace void with WebDriver for return method.
	//Add Webdriver in Test class	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.techfios.com/billing/?ng=admin/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	
	}
	
	public static void tearDown () {
		//add static to call it in the different class (LoginTest class)	
		driver.close();
		driver.quit();
	}

}
