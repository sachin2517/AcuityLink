package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class UserLockScenario_TC3 extends BaseTest{
		
		@Test
		public void invalidEmail() throws InterruptedException {
		
			String email = Utility.getXLData(DATA_PATH, "Sheet1", 1, 6);
			String pw = Utility.getXLData(DATA_PATH, "Sheet1", 1, 7);
			
			LoginPage login = new LoginPage(driver);
			
			for(int i=1; i<=3; i++)
			{
				login.sendEmail(email);
				login.clickNxt();
				login.sendPassword(pw);
				login.clickLogin();
			}
			login.checkLockedAccount();
		}
	}