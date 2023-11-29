package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWebPage {

	WebDriver driver;
	WebDriverWait wait;
	
	final String Locator1= "//span[text()='Log In']";
	
	//Locator
	@FindBy(xpath=Locator1)
	WebElement LoginButton;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LoginButton2;
	
	@FindBy(xpath="//div[@class='icon-font-chess x ui_outside-close-icon']")
	WebElement CrossButton;
	
	//Constructor
	public LoginWebPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public void Loginbutton()
	{
	LoginButton.click();	
	}
	
	public void Username(String username)
	{
	Username.sendKeys(username);		
	}
	
	public void Password(String password)
	{
	Password.sendKeys(password);	
	}
	
	public void LoginButton2()
	{
	LoginButton2.click();	
	}
	public void CrossButton()
	{
	wait.until(ExpectedConditions.visibilityOf(CrossButton));	
	CrossButton.click();	
	}

}
