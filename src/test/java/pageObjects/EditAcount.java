package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAcount extends BasePage{
	public EditAcount(WebDriver driver)
	{
		
		super(driver);
	}
	

	
	@FindBy(xpath=("(//input[@id='input-firstname'])[1]"))
	WebElement txtFirstname;
	@FindBy(xpath=("(//input[@id='input-lastname'])[1]"))
	WebElement txtLastname;
	
	@FindBy(xpath=("(//input[@id='input-telephone'])[1]"))
	WebElement numTelephone;
	

	
	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	WebElement clickButton;
	
	@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])[1]")
	WebElement msgConfirmations;

	
	
	
	
	
	public void changeFirstName(String fname) {
		txtFirstname.clear();
		
		txtFirstname.sendKeys(fname);

	}

	public void changeLastName(String lname) {
		txtLastname.clear();
		txtLastname.sendKeys(lname);

	}

	

	public void changeTelephone(String tel) {
		numTelephone.clear();
		numTelephone.sendKeys(tel);

	}
	public void clickButton() {
		clickButton.click();

	}
	
	
	
	
	
	
	
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmations.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
	
	
}
