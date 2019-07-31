package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Register_ASP_Page {	

	//initialization	
	@FindBy(name="aspName")
	private WebElement aspName;
	
	@FindBy(xpath="//form[@id='aspRegistrationForm']/div[1]/div[2]/div[1]")
	private WebElement aspType;
	
	//form[@id='aspRegistrationForm']/div/div[2]/div/button[@data-id='capability']/span[1]

	@FindBy(xpath="//form[@id='aspRegistrationForm']/div/div[2]/div/div/ul/li/a/span")
	private WebElement WCT;
	
	@FindBy(xpath="//form[@id='aspRegistrationForm']/div/div[2]/div/div/ul/li[2]/a/span")
	private WebElement BLS;
	
	@FindBy(xpath="//form[@id='aspRegistrationForm']/div/div[2]/div/div/ul/li[3]/a/span")
	private WebElement ALS;
	
	@FindBy(xpath="//form[@id='aspRegistrationForm']/div/div[2]/div/div/ul/li[4]/a/span")
	private WebElement CCT;
	
	@FindBy(id="streetAddress")
	private WebElement streetAddress;
	
	@FindBy(id="zipCode")
	private WebElement zipCode;

	@FindBy(id="aspCity")
	private WebElement aspCity;
	
	@FindBy(id="aspState")
	private WebElement aspState;

	@FindBy(name="aspLicenseNumber")
	private WebElement aspLicenseNum;

	@FindBy(name="firstName")
	private WebElement aspFirstName;

	@FindBy(name="lastName")
	private WebElement aspLastName;

	@FindBy(xpath="(//input[@name='userEmail'])[2]")
	private WebElement email;

	@FindBy(name="phoneNumber")
	private WebElement phoneNum;

	@FindBy(name="faxNumber")
	private WebElement faxNum;

	@FindBy(xpath="(//a[@class='termsClk'])[1]")
	private WebElement terms;

	@FindBy(xpath="(//a[@class='privacyClk'])[1]")
	private WebElement privacy;

	@FindBy(id="aspSubmit")
	private WebElement submit;
	
	@FindBy(xpath="(//img[@onclick='loginPage()'])[1]")
	private WebElement backBtn;
	
	//declaration
	public Register_ASP_Page(WebDriver driver) {
		//this.driver=driver;
			PageFactory.initElements(driver,this);
		}

	public void sendASPName(String aspname) {
			aspName.sendKeys(aspname);
		}

	public void selectASPType() {
			aspType.click();
		}
	
	public void selectASPTypes() {
			WCT.click();
			CCT.click();
			BLS.click();
			ALS.click();
		}

	public void sendStreetAddress(String streetAddr) {
			streetAddress.click();
			streetAddress.sendKeys(streetAddr);
		}	
	
	public void sendZipCode(String zipcode) {
			zipCode.clear();
			zipCode.sendKeys(zipcode);
		}
	
	public void checkCity() {
		String ex = aspCity.getText();
			if(aspCity.getText().isEmpty())
				Assert.fail();
			else
				Reporter.log(ex,true);
		}
	
	public void checkState() {
			String ex = aspState.getText();
			if(aspState.getText().isEmpty())
				Assert.fail();
			else
				Reporter.log(ex,true);
		}
	
	public void sendLicenseNum(String licnum) {
			aspLicenseNum.sendKeys(licnum);
		}
	
	public void sendFirstName(String fname) {
			aspFirstName.sendKeys(fname);
		}
	
	public void sendLastName(String lname) {
			aspLastName.sendKeys(lname);
		}
	
	public void sendEmail(String email1) {
			email.clear();
			email.click();
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
