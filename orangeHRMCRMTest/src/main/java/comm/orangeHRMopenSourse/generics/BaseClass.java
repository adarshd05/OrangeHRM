package comm.orangeHRMopenSourse.generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.orangeHRMopenSource.objectrepository.LoginPage;
import com.orangeHRMopenSource.objectrepository.LogoutPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/Drivers/geckodriver.exe");

	}
	
	public FileLib f=new FileLib();
	public WebDriverCommonLib w= new WebDriverCommonLib();
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		w.waitForElementGui(driver);
		
	}
	@BeforeMethod
	public void toLogin() throws  IOException, InterruptedException {
		

		driver.get(f.getPropertyValue("URL"));
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(f.getPropertyValue("UN"));
		lp.setPassword(f.getPropertyValue("pwd"));
		lp.clickLogin();
		w.waitForElementGui(driver);
	}
	@AfterMethod
	public void toLogout() throws InterruptedException {
		LogoutPage lop=new LogoutPage(driver);
		lop.clickLogout();
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
