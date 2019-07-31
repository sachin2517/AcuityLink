package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;
import page.Register_HI_Page;

public class Invalid_Email_TC2 extends BaseTest {

	@Test
	public void invalidEmail() throws InterruptedException {
	
		String email = Utility.getXLData(DATA_PATH, "Sheet1", 1, 6);
		String pw = Utility.getXLData(DATA_PATH, "Sheet1", 1, 7);
		
		LoginPage login = new LoginPage(driver);
		login.sendEmail(email);
		login.clickNxt();
		login.sendPassword(pw);
		login.clickLogin();
		login.checkInvalidEmail();
	}
}

