package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;
import page.Register_ASP_Page;

public class Valid_ASP_Registration extends BaseTest{

	@Test
	public void valid_ASP() throws InterruptedException {
		
		String aspname = Utility.getXLData(DATA_PATH, "Sheet2", 1, 1);
		String staddr = Utility.getXLData(DATA_PATH, "Sheet2", 1, 2);
		String zip = Utility.getXLData(DATA_PATH, "Sheet2", 1, 3);
		String licno = Utility.getXLData(DATA_PATH, "Sheet2", 1, 4);
		String fname = Utility.getXLData(DATA_PATH, "Sheet2", 1, 5);
		String lname = Utility.getXLData(DATA_PATH, "Sheet2", 1, 6);
		String email = Utility.getXLData(DATA_PATH, "Sheet2", 1, 7);
		String phno = Utility.getXLData(DATA_PATH, "Sheet2", 1, 8);
		String faxno = Utility.getXLData(DATA_PATH, "Sheet2", 1, 9);
		
		
		LoginPage login = new LoginPage(driver);
		Register_ASP_Page asp = new Register_ASP_Page(driver);
		login.clickAspRegistration();
		asp.sendASPName(aspname);
		asp.selectASPType();
		Thread.sleep(10000);
		asp.selectASPTypes();
		asp.sendStreetAddress(staddr);
		asp.sendZipCode(zip);
		asp.sendLicenseNum(licno);
		asp.sendFirstName(fname);
		asp.sendLastName(lname);
		asp.sendEmail(email);
		asp.sendPhoneNumber(phno);
		asp.sendFaxNumber(faxno);
		asp.clickSubmit();
	}
}
