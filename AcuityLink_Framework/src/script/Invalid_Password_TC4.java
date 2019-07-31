package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class Invalid_Password_TC4 extends BaseTest{
	
	@Test
	public void invalidPassword() throws InterruptedException {
	
		String email = Utility.getXLData(DATA_PATH, "Sheet1", 1, 6);
		String pw = Utility.getXLData(DATA_PATH, "Sheet1", 1, 7);
		
		LoginPage login = new LoginPage(driver);
		login.sendEmail(email);
		login.clickNxt();
		login.sendPassword(pw);
		login.clickLogin();
		login.checkInvalidPassword();
	}
}
