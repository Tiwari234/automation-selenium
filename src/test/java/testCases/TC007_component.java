package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageObjects.Components;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PlaceOdder;
import testBase.BaseClass;

public class TC007_component extends BaseClass{
	@Test
	public void component() {
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
			
			Components cp = new Components(driver);
			cp.component();
			cp.monitor();
			cp.gridview();
			cp.monito();
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,1000)");
			cp.radiobutton();
	
			cp.checkbox();
	
			cp.text("test123");
		
			cp.options();
	
			cp.textcomment("new comment");
	
			
		
			cp.uploadfile("./testData/download.jpeg");
			

			cp.date();

			cp.time();
			
			cp.datetime();

			cp.textquantity("2");
		
			cp.addtocart();
			
			
		}catch(Exception e) {
			
		}
	}

}
