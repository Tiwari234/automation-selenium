package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.EditAcount;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_005edit extends BaseClass {
	
	
	@Test

	public void Edit_Account_Details() {
		
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		
		hp.clickLogin();
		
	
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();	
		
		
		hp.clickEdit();
		
	EditAcount editaccountdetails = new EditAcount(driver);
	
	

	
	editaccountdetails.changeFirstName(randomeString().toUpperCase());
	
	editaccountdetails.changeLastName(randomeString().toUpperCase());
	
	editaccountdetails.changeTelephone(randomeNumber());
	
	
	editaccountdetails.clickButton();
	
	String confmsg = editaccountdetails.getConfirmationMsg();
	Assert.assertEquals(confmsg, "Success: Your account has been successfully updated.", "Confirmation message mismatch");
	
	
		}catch(Exception e){
			Assert.fail("Test failed: " + e.getMessage());
		}
		
		
	}
	
}
