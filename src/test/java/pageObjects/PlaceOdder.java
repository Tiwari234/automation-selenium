package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlaceOdder extends BasePage {

	public PlaceOdder(WebDriver driver) {
		
		
		
		super(driver);
		
	}
	
	
@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']")
WebElement clickLaptops;
	
@FindBy(xpath="//div[@class='dropdown-menu']//a[.='Show AllLaptops & Notebooks']")
WebElement clickShowalllaptops ;

@FindBy(xpath="//div[@class='image']//img[@title='MacBook Air']")
WebElement clickBackbook;
	
@FindBy(xpath="(//input[@id='input-quantity'])[1]")
WebElement textenterQuantity;
	
@FindBy(xpath="//button[@id='button-cart']")
WebElement clickaddtocart;
	
@FindBy(xpath="(//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle'])[1]")
WebElement clickoncart;
	
@FindBy(xpath="(//strong[normalize-space()='View Cart'])[1]")
WebElement clickviewcart;
	
	
	
	
@FindBy(xpath="//a[@class='btn btn-primary']")
WebElement clickcheckout;
	
@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
WebElement selectext;
	

	
public void clicklaptops() {
	clickLaptops.click();

	}
public void clickshowall() {
		clickShowalllaptops.click();

	}
public void clickmackbook( ) {
		clickBackbook.click();

	}
public void enterquantity(String fname) {
		textenterQuantity.sendKeys(fname);

	}
	
public void addtocart( ) {
		clickaddtocart.click();

	}
public void clickoncart( ) {
		clickoncart.click();

	}

public void clickviewcart( ) {
		clickviewcart.click();

	}
	
public void clickcheckout( ) {
		clickcheckout.click();

	}
	

	
public String getConfirmationMsg() {
		try {
			return (selectext.getText());
			
		} catch (Exception e) {
			return (e.getMessage());

		}
	
	
	
	}
	}
