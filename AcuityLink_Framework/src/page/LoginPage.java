package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.IAutoConst;
import generic.Utility;

public class LoginPage implements IAutoConst
{
	
	//initialization	
	@FindBy(id="samlUserEmail")
	private WebElement emailTxtField;
	
	@FindBy(id="samlLoginBtn")
	private WebElement nxtBtn;
	
	@FindBy(id="password")
	private WebElement passwordTxtField;
	
	@FindBy(id="loginBtnId")
	private WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'Register as Health')]")
	private WebElement regHI;
	
	@FindBy(xpath="//button[@class='btn aq-btn-yellow'][contains(text(), 'Register as Ambulance Service Provider')]")
	private WebElement regASP;
	
	@FindBy(id="(//a[@class='forgot-link'])[1]")
	private WebElement forgotpwd;
	
	@FindBy(xpath="//li[text()= 'E-mail address is invalid']")
	private WebElement errMsg;
	
	@FindBy(xpath="(//div[@id='errMsg']/div)[1]")
	private WebElement invalidErrMsg;
	
	@FindBy(xpath="(//div[@id='errLocked']/div)[1]")
	private WebElement lockedErrMsg;
	
	@FindBy(xpath="(//div[@id='errdeactive']/div)[1]")
	private WebElement deactiveErrMsg;
	
	@FindBy(xpath="(//a[@class='termsClk'])[3]")
	private WebElement termsLink;
	
	@FindBy(xpath="(//a[@class='privacyClk'])[3]")
	private WebElement privacyLink;
	
	@FindBy(xpath="//a[contains(text(),'Manage HCF')]")
	private WebElement AcuityDashboard;
	
	@FindBy(id="createSRId")
	private WebElement HCFDashboard;
	
	@FindBy(id="aspManageVeh")
	private WebElement MTPDashboard;
	
	//declaration
	public LoginPage(WebDriver driver) 
	{
	//this.driver=driver;
			PageFactory.initElements(driver,this);
		}

	public void sendEmail(String email) 
	{
		emailTxtField.clear();
		emailTxtField.sendKeys(email);
	}
	
	public void clickNxt() 
	{
		nxtBtn.click();
	}
	
	public void sendPassword(String password) 
	{
		passwordTxtField.clear();
		passwordTxtField.sendKeys(password);
	}
	
	public void clickLogin() 
	{
		loginBtn.click();
	}
	
	public void registerAsHI() 
	{
		regHI.click();
	}
	
	public void registerAsASP() 
	{
		regASP.click();
	}
	
	public void forgotPwd() 
	{
		forgotpwd.click();
	}
	
	public void emailError(String error1)
	{
		String error = errMsg.getText();
		Reporter.log("The text is:"+error, true);
		System.out.println("The Text is: "+error);
	}
	
	public void checkInvalidEmail()
	{
		String expectedErrorMsg = "Username and Password does not match. Try again.";
		String actualErrorMsg = invalidErrMsg.getText();
		Reporter.log(actualErrorMsg,true);
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	
	public void checkInvalidPassword()
	{
		String expectedErrorMsg = "Username and Password does not match. Try again.";
		String actualErrorMsg = invalidErrMsg.getText();
		Reporter.log(actualErrorMsg,true);
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	
	public void checkLockedAccount()
	{
		String expectedErrorMsg = "Your account is locked! Please reset password.";
		String actualErrorMsg = lockedErrMsg.getText();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}
	
	public void checkDeactivatedAccount()
	{
		String expectedErrorMsg = "Your account has been deactivated.";
		String actualErrorMsg = deactiveErrMsg.getText();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}    
	
	public void clickPrivacy()
	{
		termsLink.click();
	}    
	
	public void clickTerms()
	{
		privacyLink.click();
	}
	
	public void checkAcuityAdminSuccessfulLogin()
	{
		if(AcuityDashboard.isDisplayed())
			Reporter.log("Acuity Admin Successful Login.",true);
		else
			Assert.fail();
	}

	public void checkHCFSuccessfulLogin()
	{
		if(HCFDashboard.isDisplayed())
			Reporter.log("HCF Successful Login.",true);
		else
			Assert.fail();
	}
	
	public void checkMTPSuccessfulLogin()
	{
		if(MTPDashboard.isDisplayed())
			Reporter.log("MTP Successful Login.",true);
		else
			Assert.fail();
	}
	
	public void clickHIRegistration()
	{
		regHI.click();
	}
	
	public void clickAspRegistration()
	{
		regASP.click();
	}
}