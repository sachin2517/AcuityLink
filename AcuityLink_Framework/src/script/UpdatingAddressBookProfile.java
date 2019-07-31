package script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.AcuityDashboard;
import page.AddressBook;
import page.LoginPage;

public class UpdatingAddressBookProfile extends BaseTest {

	@Test
	public void AddressBookProfile() throws InterruptedException {
		
		String usr = Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);
		String pwd = Utility.getXLData(DATA_PATH, "Sheet1", 1, 2);
		
		LoginPage l = new LoginPage(driver);
		AcuityDashboard a = new AcuityDashboard(driver);
		AddressBook ab = new AddressBook(driver);
		
		l.sendEmail(usr);
		l.clickNxt();
		l.sendPassword(pwd);
		l.clickLogin();
		Thread.sleep(1000);
				
		a.clickManageHCF();
		a.clickAddressBook();
		
		Thread.sleep(2000);
		
		for(int i=2; i<=591; i++) {
			String id = Utility.getXLData(DATA_PATH, "Sheet1", i, 1);
			Double id1 = Double.parseDouble(id);
			long id2 = Math.round(id1);
			System.out.println(id1);
			driver.findElement(By.xpath("//td/a[@hiid='"+id2+"']")).click();
			System.out.println("Clicked");
			ab.clickUpdate();
			System.out.println("Updated");
			Thread.sleep(2000);
		}
	}
}



