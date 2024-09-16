package pageObjects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Components extends BasePage {

	public Components(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Components (2)']")
	WebElement clickComponents;
	
	
	@FindBy(xpath="(//a[contains(text(),'Monitors (2)')])[3]")
	WebElement textMonitor2 ;
	
	@FindBy(xpath="//img[@title='Apple Cinema 30\"']")
	WebElement monitor ;
	
	@FindBy(xpath="(//i[@class='fa fa-th-list'])[1]")
	WebElement clickGridView;
	
   @FindBy(xpath="(//input[@name='option[218]'])[1]")
	WebElement clickonRadioButton;
	
	@FindBy(xpath="(//input[@value='10'])[1]")
	WebElement clickCheckBox;
	
	@FindBy(xpath="//input[@id='input-option208']")
	WebElement txtArea;
	
	@FindBy(xpath="//select[@id='input-option217']//option[@value=\"4\"]")
	WebElement selectOption;
	
	@FindBy(xpath="//textarea[@id='input-option209']")
	WebElement txtcomment;
	
	
	  @FindBy(xpath="//button[@id='button-upload222']")
	
	  WebElement uploadElement;
	  

	
	@FindBy(xpath="//div[@class='input-group date']//button[@type='button']")
	WebElement selectDate;
	
	
	@FindBy(xpath="//div[@class='input-group date']//button[@type='button']")
	WebElement selectTime;
	
	
	@FindBy(xpath="//div[@class='input-group datetime']//i[@class='fa fa-calendar']")
	WebElement selectDateTime;
	
	@FindBy(xpath="//input[@id='input-quantity']")
	WebElement textquatity;
	
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement clickAddtocart;
	
	
	
	public void component() {
		clickComponents.click();

	}
	public void monitor( ) {
		textMonitor2.click();

	}
	public void gridview() {
		clickGridView.click();

	}
	public void monito() {
		monitor.click();

	}
	public void radiobutton() {
		
		
		clickonRadioButton.click();

	}
	
	public void checkbox() {
		clickCheckBox.click();

	}
	public void text(String text) {
		txtArea.clear();
		txtArea.sendKeys(text);

	}

	public void options() {
		selectOption.click();

	}
	public void textcomment(String text) {
		txtcomment.sendKeys(text);

	}
	public void uploadfile(String fileName) {
	    // Define the file object with the path of the file to upload
	    File file = new File(fileName);
	    
	    // Ensure the file exists before attempting to upload
	    if(file.exists()) {
	        // Set the absolute file path to the file input element
	        uploadElement.sendKeys(file.getAbsolutePath());
	        System.out.println("File uploaded successfully: " + file.getAbsolutePath());
	    } else {
	        System.out.println("File does not exist: " + fileName);
	    }
	}
	
	public void date() {
		selectDate.click();

	}
	public void time() {
		selectTime.click();

	}
	public void datetime() {
		selectDateTime.click();

	}

	public void textquantity(String text) {
		textquatity.clear();
		textquatity.sendKeys(text);

	}
	public void addtocart() {
		clickAddtocart.click();

	}
	
	
	
	
	
	
	
	
	


	

}
