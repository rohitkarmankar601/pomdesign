package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValidation extends BaseTest{

	@Test(priority=1)
	public void ValidateCredentials()
	{
	Lp.Loginbutton();
	Lp.Username("rrpglrrpgl@gmail.com");
	Lp.Password("Lovebird@0808");
	Lp.LoginButton2();
	Lp.CrossButton();
	}
	
	@Test(priority=2)
	public void CheckAssertion() {
	Assert.assertEquals(true,true);	
	}
	
	@Test(priority=3)
	public void CheckThirdAssertion()
	{
	Assert.assertEquals(false,false);	
	}
}
