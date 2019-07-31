package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AddressBook 
{

	//initialization	
	@FindBy(xpath="//td/a[@hiid='']")
	private WebElement fieldname;
	
	@FindBy(xpath="//button[@class='btn aq-btn updateButton']")
	private WebElement update;
	
	//declaration
	public AddressBook(WebDriver driver) 
	{
	//this.driver=driver;
			PageFactory.initElements(driver,this);
		}

	public void addresses(String email) 
	{
		fieldname.clear();
		fieldname.sendKeys(email);
	}
	
	public void clickUpdate() 
	{
		update.click();
	}
	
}