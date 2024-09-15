package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PlaceOdder;
import testBase.BaseClass;

public class TC006_AddtocartTest extends BaseClass{
     
	
	@Test
	public void addingtocart() {
		
		try {
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		hp.clickLogin();
		
	
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		PlaceOdder newodder = new PlaceOdder(driver);
		


	
		newodder.clicklaptops();
		newodder.clickshowall();
		newodder.clickmackbook();
		newodder.enterquantity("1");
		Thread.sleep(5000);
		newodder.addtocart();
		newodder.clickoncart();
		newodder.clickviewcart();
		Thread.sleep(5000);
		newodder.clickcheckout();
		Thread.sleep(5000);
		

		String confmsg = newodder.getConfirmationMsg();
		System.out.println(confmsg);
		Assert.assertEquals(confmsg, "Products marked with *** are not available in the desired quantity or not in stock!");

	
		} 
		catch (Exception e)
		{
		

			Assert.fail("Test failed:" + e.getMessage());
		} 
		
		
	}
	
	
	
}
