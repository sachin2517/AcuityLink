package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Register_HI_Page {	

	//initialization	
	@FindBy(id="hiName")
	private WebElement hiName;

	@FindBy(id="hitype")
	private WebElement hiType;

	@FindBy(name="streetAddress")
	private WebElement streetAddress;
	
	@FindBy(id="hiZip")
	private WebElement zipCode;

	@FindBy(id="hiCity")
	private WebElement hiCity;
	
	@FindBy(id="hiState")
	private WebElement hiState;

	@FindBy(id="hiLicenseNumber")
	private WebElement hiLicenseNum;

	@FindBy(id="hiAdminFirstName")
	private WebElement hiFirstName;

	@FindBy(id="hiAdminLastName")
	private WebElement hiLastName;

	@FindBy(id="userEmail")
	private WebElement email;

	@FindBy(id="hiAdminPhoneNo")
	private WebElement phoneNum;

	@FindBy(id="faxNumber")
	private WebElement faxNum;

	@FindBy(xpath="(//a[@class='termsClk'])[1]")
	private WebElement terms;

	@FindBy(xpath="(//a[@class='privacyClk'])[1]")
	private WebElement privacy;

	@FindBy(id="hiSubmit")
	private WebElement submit;
	
	@FindBy(xpath="(//img[@onclick='loginPage()'])[1]")
	private WebElement backBtn;

	//declaration
	public Register_HI_Page(WebDriver driver) {
		//this.driver=driver;
			PageFactory.initElements(driver,this);
		}

	public void sendHIName(String hiname) {
			hiName.sendKeys(hiname);
		}

	public void selectHospitalType(WebElement htype, String hitype1) {
			Select sel = new Select(htype);
			sel.selectByValue(hitype1);
		}

	public void sendStreetAddress(String streetAddr) {
			streetAddress.sendKeys(streetAddr);
		}	
	
	public void sendZipCode(String zipcode) {
			zipCode.sendKeys(zipcode);
		}
	
	public void checkCity() {
		String ex = hiCity.getText();
			if(hiCity.getText().isEmpty())
				Assert.fail();
			else
				Reporter.log(ex,true);
		}
	
	public void checkState() {
			String ex = hiState.getText();
			if(hiState.getText().isEmpty())
				Assert.fail();
			else
				Reporter.log(ex,true);
		}
	
	public void sendLicenseNum(String licnum) {
			hiLicenseNum.sendKeys(licnum);
		}
	
	public void sendFirstName(String fname) {
			hiFirstName.sendKeys(fname);
		}
	
	public void sendLastName(String lname) {
			hiLastName.sendKeys(lname);
		}
	
	public void sendEmail(String email1) {
			email.sendKeys(email1);
		}
	
	public void sendPhoneNumber(String phonenum) {
			phoneNum.sendKeys(phonenum);
		}
	
	public void sendFaxNumber(String faxnum) {
			faxNum.sendKeys(faxnum);
		}
	
	public void clickTerms() {
			terms.click();
		}
	
	public void clickPrivacy() {
			privacy.click();
		}
	
	public void clickSubmit() {
			submit.click();
		}
	
	public void clickBackBtn() {
			backBtn.click();
		}
	
}
