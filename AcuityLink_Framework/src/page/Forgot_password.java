package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Forgot_password 
{
	//initialization	
		@FindBy(xpath="//div[@class='login__title'][contains(text(), 'Reset password')]")
		private WebElement pagetitle;
		
		@FindBy(id="emailReg")
		private WebElement txtForgotEmail;
		
		@FindBy(id="ResetPassword")
		private WebElement submit;
		
		@FindBy(xpath="//div/a[@class='backToLogin']")
		private WebElement backtologin;
		
		@FindBy(xpath="//li[contains(text(), 'Email address is invalid')]")
		private WebElement invalemail;
		
		//declaration
		public Forgot_password(WebDriver driver) 
		{
		//this.driver=driver;
				PageFactory.initElements(driver,this);
			}
		
		public void invalemail()
		{
			String emailinvalid = invalemail.getText();
			System.out.println("The Text is: "+emailinvalid);
		}
}
