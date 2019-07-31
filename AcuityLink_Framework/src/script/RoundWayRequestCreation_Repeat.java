package script;

import java.awt.AWTException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.CreateRequestPage;
import page.LoginPage;

public class RoundWayRequestCreation_Repeat extends BaseTest {

	@Test
	public void createRequestProcess() throws InterruptedException, AWTException {
														//row, //column
		String usr = Utility.getXLData(DATA_PATH, "Sheet1", 1, 6);
		String pwd = Utility.getXLData(DATA_PATH, "Sheet1", 1, 7);
		String fname = Utility.getXLData(DATA_PATH, "Sheet1", 2, 6);
		String lname = Utility.getXLData(DATA_PATH, "Sheet1", 2, 7);
		String dob = Utility.getXLData(DATA_PATH, "Sheet1", 2, 8);
		String mobn = Utility.getXLData(DATA_PATH, "Sheet1", 2, 9);
		String wt = Utility.getXLData(DATA_PATH, "Sheet1", 2, 10);
		String comments = Utility.getXLData(DATA_PATH, "Sheet1", 2, 11);
		String rno = Utility.getXLData(DATA_PATH, "Sheet1", 2, 12);
		//String destAdd = Utility.getXLData(DATA_PATH, "Sheet1", 2, 13);
		//String drnum = Utility.getXLData(DATA_PATH, "Sheet1", 2, 14);
		//String dRClinician = Utility.getXLData(DATA_PATH, "Sheet1", 2, 15);
		String custDName = Utility.getXLData(DATA_PATH, "Sheet1", 2, 16);
		String custDAddress = Utility.getXLData(DATA_PATH, "Sheet1", 2, 17);
		String custZipCode = Utility.getXLData(DATA_PATH, "Sheet1", 2, 18);
		String pickDate = Utility.getXLData(DATA_PATH, "Sheet1", 2, 19);
		String pickTime = Utility.getXLData(DATA_PATH, "Sheet1", 2, 20);
		String endDate = Utility.getXLData(DATA_PATH, "Sheet1", 3, 6);
		String priDiag = Utility.getXLData(DATA_PATH, "Sheet1", 3, 7);
		String notes = Utility.getXLData(DATA_PATH, "Sheet1", 3, 8);
		String priReason = Utility.getXLData(DATA_PATH, "Sheet1", 3, 9);
		
		LoginPage l = new LoginPage(driver);
		CreateRequestPage create = new CreateRequestPage(driver);
		
		l.sendEmail(usr);
		l.clickNxt();
		l.sendPassword(pwd);
		l.clickLogin();
		Thread.sleep(1000);
		l.checkHCFSuccessfulLogin();
		
		create.clickCreateRequestBtn();
		Thread.sleep(1000);
		
		create.check1stPage();
		create.clickBLS();
		create.selectRepeat();
		create.selectRoundTrip();
		create.clickPage1Next();
		
		create.check2ndPage();
		create.sendFirstName(fname);
		create.sendLastname(lname);
		create.sendDOB(dob);
		create.clickFemale();
		create.sendMobileNumber(mobn);
		create.sendWeight(wt);
		create.selectKilograms();
		create.sendComments(comments);
		create.sendRoomNumber(rno);
		
		/*create.sendDestinationAddress(destAdd);
		create.selectDestBuilding();
		create.selectDestDropOffArea();
		create.selectDestFloor();
		create.selectDestUnit();
		create.sendDestRoomNumber(drnum);
		create.sendRecievingClinician(dRClinician);*/
		
		create.clickCustomDestination();
		create.clickDestinationCheckBox();
		create.sendCustomDestName(custDName);
		create.sendCustomDestAddress(custDAddress);
		create.sendCustomDestZipCode(custZipCode);
		create.clickNextToGoThirdPage();
		Thread.sleep(10000);
		create.clickNextToGoThirdPage();
		
		create.check3rdPage();
		create.sendPickUpDate(pickDate);
		create.sendPickUpTime(pickTime);
		create.clickNextTo4thPage();
		
		create.check4thPage();
		create.sendEndDate(endDate);
		create.clickNextTo5thPage();
		
		create.check5thPage();
		create.clickPCSOption();
		create.sendPrimaryDiagnosis(priDiag);
		create.sendNotes(notes);
		create.sendPrimaryReasonForTransport(priReason);
		create.clickNextToReviewPage();
		create.clickConfirmForNoClinician();
		
		create.checkGroupReviewPage(driver);
		create.clickRepeatSubmit();
		create.checkSuccessfullRequestCreation();
	}
}



