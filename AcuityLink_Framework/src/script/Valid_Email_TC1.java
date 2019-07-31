package script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.AcuityDashboard;
import page.AddressBook;
import page.LoginPage;

public class Valid_Email_TC1 extends BaseTest {

	@Test
	public void validEmail() throws InterruptedException {
		
		String usr = Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);
		String pwd = Utility.getXLData(DATA_PATH, "Sheet1", 1, 2);
		
		LoginPage l = new LoginPage(driver);
		
		l.sendEmail(usr);
		l.clickNxt();
		l.sendPassword(pwd);
		l.clickLogin();
		Thread.sleep(1000);
		
//		login.checkSuccessfulLogin();
	}
}



