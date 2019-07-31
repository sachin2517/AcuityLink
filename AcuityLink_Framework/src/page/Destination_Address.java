package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Destination_Address 
{

	//initialization	
	@FindBy(id="451")
	private WebElement firstEle;
	
	@FindBy(name="Update")
	private WebElement updateBtn;
	
	@FindBy(xpath="//a[@id='addressBookList']//img")
	private WebElement backBtn;
	
	@FindBy(id="")
	private WebElement lastEle;
	
	//declaration
	public Destination_Address(WebDriver driver) 
	{
			//this.driver=driver;
			PageFactory.initElements(driver,this);
	}
	
	public void clickUpdate() 
	{
		updateBtn.click();
	}
	
	public void clickBack() 
	{
		backBtn.click();
	}
	
	
	
	public void hiIdListMethod() {
		List<Integer> hiIdList = new ArrayList<Integer>();
		for (Integer integer : hiIdList) {
			
		}
	}
}