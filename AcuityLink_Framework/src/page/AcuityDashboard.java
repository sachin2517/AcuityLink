package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AcuityDashboard 
{

	//initialization	
			@FindBy(xpath="//li[@id='managehi']/a")
			private WebElement mngHcfDropdown;
			
			@FindBy(xpath="//a[@id='acuityAddressBook']")
			private WebElement addressBook;
			
			//declaration
			public AcuityDashboard(WebDriver driver) 
			{
			//this.driver=driver;
					PageFactory.initElements(driver,this);
				}

			public void clickManageHCF() 
			{
				mngHcfDropdown.click();
			}
			
			public void clickAddressBook() 
			{
				addressBook.click();
			}
			
			
			
}
