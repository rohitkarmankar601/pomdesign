package test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import main.LoginWebPage;

public class BaseTest extends BaseClass{

	
	
	@BeforeSuite
	public void BrowserInit()
	{
    driver=new ChromeDriver();
	driver.get("https://www.chess.com");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	}
	
	
	@BeforeClass
	public void WebPageClassObjects()
	{
	Lp=new LoginWebPage(driver);	
	}
	
	@AfterSuite
	public void TearDownEnv()
	{
	driver.quit();	
	}
}
