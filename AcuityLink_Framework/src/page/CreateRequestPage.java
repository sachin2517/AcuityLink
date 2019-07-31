package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class CreateRequestPage {

		//initialization	
		SoftAssert s = new SoftAssert();
		
		@FindBy(xpath="//span[@class='steps active'][contains(text(),'1')]")
		private WebElement check1stPageNumber;
		
		@FindBy(id="createSRId")
		private WebElement creqBtn;
		
		@FindBy(xpath="//label[@for='levelOfServiceALS']/div")
		private WebElement clickALS;
		
		@FindBy(xpath="//label[@for='levelOfServiceBLS']/div")
		private WebElement clickBLS;
		
		@FindBy(xpath="//label[@for='levelOfServiceCCT']/div")
		private WebElement clickCCT;
		
		@FindBy(xpath="//label[@for='levelOfServiceWCT']/div")
		private WebElement clickWCT;
		
		@FindBy(xpath="//label[@for='levelOfServiceAPT']/div")
		private WebElement clickAPT;
		
		@FindBy(xpath="//button[@data-id='repeatTransport']/span[1]")
		private WebElement selectNonRepeat;
		
		@FindBy(xpath="//li[2]/a/span[contains(text(),'Repeat')]")
		private WebElement selectRepeat;
		
		@FindBy(xpath="//span[@class='filter-option pull-left'][contains(text(),'One-Way')]")
		private WebElement selectOneWay;
		
		@FindBy(xpath="//span[contains(text(),'Round')]")
		private WebElement selectRoundTrip;
		
		@FindBy(xpath="//span[contains(text(),'Multi')]")
		private WebElement selectMultiTrip;
		
		@FindBy(id="srDivId1")
		private WebElement clickPage1Next;
		
		////End of First Page
		
		@FindBy(xpath="//span[@class='steps active'][contains(text(),'2')]")
		private WebElement check2ndPageNumber;
		
		@FindBy(id="addPatientFromRegBtn")
		private WebElement clickAddPatientRegisterBtn;
		
		@FindBy(id="clearPatientInfoBtn")
		private WebElement clickClearPatientInfoBtn;
		
		@FindBy(id="patientFirstName")
		private WebElement sendFirstName;
		
		@FindBy(id="patientLastName")
		private WebElement sendLastName;
		
		@FindBy(id="patientDob")
		private WebElement sendDob;
		
		@FindBy(xpath="//span[contains(@class,'filter-option pull-left')][contains(text(),'Choose Gender')]")
		private WebElement clickGender;
		
		@FindBy(xpath="//span[contains(text(),'Male')]")
		private WebElement clickMale;
		
		@FindBy(xpath="//span[contains(text(),'Female')]")
		private WebElement clickFemale;
		
		@FindBy(xpath="//span[contains(text(),'Other / Unknown')]")
		private WebElement clickOther;
		
		@FindBy(id="patientPhoneNumber")
		private WebElement sendMobileNumber;
		
		@FindBy(id="patientWeight")
		private WebElement sendWeight;
		
		@FindBy(xpath="//span[@class='filter-option pull-left'][contains(text(),'Pounds')]")
		private WebElement selectWeightUnit;
		
		@FindBy(xpath="//span[contains(text(),'Kilograms')]")
		private WebElement selectKilo;
		
		@FindBy(id="clinicalComment")
		private WebElement sendComment;
		
		@FindBy(id="addPatientCheckbox")
		private WebElement addPateint2Register;
		
		@FindBy(id="cstmPatientId")
		private WebElement sendPatientID;
		
		@FindBy(xpath="//label[@for='acuityPUHiId0']")
		private WebElement clickDefaultPickup;
		
		@FindBy(xpath="//span[contains(@class,'filter-option pull-left')][contains(text(),'Select Building')]")
		private WebElement clickPickupBuilding;
		
		@FindBy(xpath="//span[contains(text(),'Building 1')]")
		private WebElement selectPickUpBuilding;
		
		@FindBy(xpath="//div[contains(@class,'btn-group bootstrap-select aq-select aq-select-form puCls0')]//span[contains(@class,'filter-option pull-left')][contains(text(),'Choose Pick-up Area')]")
		private WebElement clickPickUpArea;
		
		@FindBy(xpath="//span[contains(text(),'Lobby 1')]")
		private WebElement selectPickUpArea;
		
		@FindBy(xpath="//div[contains(@class,'btn-group bootstrap-select aq-select aq-select-form puCls0')]//span[contains(@class,'filter-option pull-left')][contains(text(),'Choose Floor')]")
		private WebElement clickFloor;
		
		@FindBy(xpath="//span[contains(text(),'Floor 1')]")
		private WebElement selectFloor;
		
		@FindBy(xpath="//div[contains(@class,'btn-group bootstrap-select aq-select aq-select-form puCls0')]//span[contains(@class,'filter-option pull-left')][contains(text(),'Choose Unit')]")
		private WebElement clickUnit;
		
		@FindBy(xpath="//span[contains(text(),'Unit 1')]")
		private WebElement selectUnit;
	
		@FindBy(id="puRoomNumber0")
		private WebElement sendRoomNo;
		
		@FindBy(id="puFacultyName0")
		private WebElement sendCPickAddressName;
		
		@FindBy(id="streetAddressPU0")
		private WebElement sendCPickAddress;

		@FindBy(id="zipcodePU0")
		private WebElement sendPZipCode;
		
		@FindBy(id="favLocation")
		private WebElement clickFavLocation;
		
		@FindBy(id="preferredServiceData0")
		private WebElement sendPreferedService;
		
		@FindBy(id="removePreferredServiceId0")
		private WebElement removePreferedService;
		
		@FindBy(xpath="//label[@for='customHiId0']")
		private WebElement selectCustomAddressLabel;
		
		@FindBy(xpath="//label[@for='acuityHiId0']")
		private WebElement selectDefaultAddressLabel;
		
		@FindBy(id="searchId0")
		private WebElement sendDestiHCF;
		
		@FindBy(xpath="//div[@tabindex='-1']")
		private WebElement target;
		
		@FindBy(id="destinationHiSearchId0")
		private WebElement removeDestiHCF;
		 //(//div[@class='btn-group bootstrap-select aq-select aq-select-form destCls0 multidest0'])[1]
		@FindBy(xpath="//button[@data-id='destBuildingNameTemp0']")
		private WebElement clickDestBuilding;				
		
		@FindBy(xpath="//span[contains(text(),'Building 1')]")
		private WebElement selectDestBuilding;
		
		@FindBy(xpath="//button[@data-id='destLobbyNameTemp0']")
		private WebElement clickDestDropOff;
		
		@FindBy(xpath="//span[contains(text(),'Dropoff 1')]")
		private WebElement selectDestDropOff;
		
		@FindBy(xpath="//button[@data-id='destFloorNumber0']")
		private WebElement clickDestFloor;
		
		@FindBy(xpath="//span[contains(text(),'Floor 1')]")
		private WebElement selectDestFloor;

		@FindBy(xpath="//button[@data-id='destUnitNumberTemp0']")
		private WebElement clickDestUnit;
		
		@FindBy(xpath="//span[contains(text(),'Unit 1')]")
		private WebElement selectDestUnit;
		
		@FindBy(id="destRoomNumber0")
		private WebElement sendDestRoomNumber;
		
		@FindBy(id="destReceivingClinician0")
		private WebElement sendRecievingClician;
		
		@FindBy(xpath="//label[contains(text(),'Request for addition')]")
		private WebElement clickAdditionToAcuity;
		
		@FindBy(id="destFacultyName0")
		private WebElement sendCustDestiName;
		
		@FindBy(id="streetAddress0")
		private WebElement sendDestiAddress;
		
		@FindBy(id="zipcode0")
		private WebElement sendDestiZipCode;
		
		@FindBy(id="srDivIdBack1")
		private WebElement clickBack2FirstPage;
		
		@FindBy(id="srDivId2")
		private WebElement clickPage2Next;
		
		//////Finish of Second Page.
		
		@FindBy(xpath="//span[@class='steps active'][contains(text(),'3')]")
		private WebElement check3rdPageNumber;
		
		@FindBy(id="pickUpDate0")
		private WebElement selectPickupDate;
		
		@FindBy(id="pickUpTime0")
		private WebElement selectPickupTime;
		
		@FindBy(xpath="//button[contains(@class, 'btn btn-primary')]")
		private WebElement clickOKForTime;
		
		@FindBy(id="appointmentDate0")
		private WebElement selectAppointmentDate;
		
		@FindBy(id="appointmentTime0")
		private WebElement selectAppointmentTime;
		
		@FindBy(id="clearArrival0")
		private WebElement clickClear;
		
		@FindBy(id="watingHourId0")
		private WebElement selectWaitingHours;
		
		@FindBy(id="watingMinId0")
		private WebElement selectWaitingMinutes;
		
		@FindBy(id="srDivId5")
		private WebElement clickPage3Next;
		
		@FindBy(id="srDivIdBack2")
		private WebElement clickToGoBackTo2ndPage;
		
		//End of 3rd Page
		
		@FindBy(xpath="//span[@class='steps active'][contains(text(),'4')]")
		private WebElement check4thPageNumber;
		
		@FindBy(id="sun")
		private WebElement clickOnSunday;
		
		@FindBy(id="mon")
		private WebElement clickOnMonday;
		
		@FindBy(id="tue")
		private WebElement clickOnTuesday;
		
		@FindBy(id="wed")
		private WebElement clickOnWednesday;
		
		@FindBy(id="thu")
		private WebElement clickOnThursday;
		
		@FindBy(id="fri")
		private WebElement clickOnFriday;
		
		@FindBy(id="sat")
		private WebElement clickOnSaturday;
				
		//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 form-group marB10 padL0 marT10']//label[@class='aq-radio-label'][contains(text(),'On')]
		@FindBy(xpath="//label[@for='repeatTypeCustom']")
		private WebElement clickOnSpecificDates;
		
		@FindBy(xpath="//a[contains(text(),'31')]")
		private WebElement clickOnDate;
		
		@FindBy(id="transportEndDate")
		private WebElement sendTransEndDate;
		
		@FindBy(xpath="//label[@for='endsOnOccurance']")
		private WebElement clickSpecificNumOccurances;
		
		@FindBy(id="transportOccuranceCount")
		private WebElement sendNumbOfOccurances;
		
		@FindBy(xpath="//label[@for='afterMaxOccurance']")
		private WebElement clickMaxOccurances;
		
		@FindBy(id="srDivIdBack5")
		private WebElement click4thBack;
		
		@FindBy(id="srDivId6")
		private WebElement clickPage4Next;
		
		////End of 4th Page
		
		@FindBy(xpath="//span[@class='steps active'][contains(text(),'5')]")
		private WebElement check5thPageNumber;
		
		@FindBy(xpath="//label[@for='pcs2']")
		private WebElement clickOnPCS;
		
		@FindBy(id="primaryDiagnosis")
		private WebElement sendPrimaryDiag;
		
		@FindBy(id="puOrderingClinician0")
		private WebElement sendOrderingClinician;
		
		@FindBy(id="removeOrderingClinicianId0")
		private WebElement removeClinician;
		
		@FindBy(id="note")
		private WebElement sendNotes;
		
		@FindBy(id="reasonForTransport")
		private WebElement sendReasonForTransport;
		
		@FindBy(id="srDivIdBack6")
		private WebElement click5thBack;
		
		@FindBy(id="srDivId3")
		private WebElement clickPage5Next;
		
		@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
		private WebElement clickNoClinicianConfirm;
		
		@FindBy(xpath="//button[contains(@class,'btn btn-default')]")
		private WebElement clickNoClinicianCancel;
		
		///End of Page 5

		@FindBy(xpath="(//h2[contains(text(),'Review')])[1]")
		private WebElement checkGroupReviewPage;
		
		@FindBy(xpath="//h4[@class='marB20'][contains(text(),'LEVEL')]")
		private WebElement checkReviewPage;
		
		@FindBy(id="editReviewFormId")
		private WebElement clickNonRepeatEditRequest;
		
		@FindBy(id="editGroupRequestsDivId")
		private WebElement clickRepeatEditGroupRequests;
		
		@FindBy(id="submitRequestButtonId")
		private WebElement clickNonRepeatSumbit;
		
		@FindBy(id="srDivId4")
		private WebElement clickRepeatSumbit;
		
		@FindBy(id="srDivIdEdit1")
		private WebElement click1stEdit;
		
		@FindBy(id="srDivIdEdit2")
		private WebElement click2ndEdit;
		
		@FindBy(id="srDivIdEdit3")
		private WebElement click3rdEdit;
		
		///Finish of Review Page
		
		///Check for successful creation of request
		
		@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
		private WebElement clickOK;
		
		@FindBy(xpath="//h2[contains(text(), 'Pending Requests')]")
		private WebElement checkPendingRequestScreen;
		
		
		//declaration
		public CreateRequestPage(WebDriver driver) 
		{
				PageFactory.initElements(driver,this);
		}

		public void clickCreateRequestBtn() 
		{
				creqBtn.click();
		}
		
		public void check1stPage() 
		{
			if(check1stPageNumber.isDisplayed())
					Reporter.log("1st Page is Displayed.",true);
				else
				{
					Reporter.log("1st Page is not Displayed.",true);
					Assert.fail();
				}
		}
		
		public void clickALS() 
		{
				clickALS.click();
		}
		
		public void clickBLS() 
		{
				clickBLS.click();
		}
		
		public void clickCCT() 
		{
				clickCCT.click();
		}
		
		public void clickWCT() 
		{
				clickWCT.click();
		}
		
		public void clickAPT() 
		{
				clickAPT.click();
		}
		
		public void selectRepeat() 
		{
				selectNonRepeat.click();
				selectRepeat.click();
		}
		
		public void selectOneWayTrip() 
		{
				selectOneWay.click();
		}
		
		public void selectRoundTrip() 
		{
				selectOneWay.click();
				selectRoundTrip.click();
		}
		
		public void selectMultiTrip() 
		{
				selectOneWay.click();
				selectMultiTrip.click();
		}
		
		public void clickPage1Next() 
		{
				clickPage1Next.click();
		}
		
		public void check2ndPage() 
		{
			if(check2ndPageNumber.isDisplayed())
					Reporter.log("2nd Page is Displayed.",true);
				else
				{
					Reporter.log("2nd Page is not Displayed.",true);
					Assert.fail();
				}
		}
		
		public void clickAddPatientToRegister() 
		{
				clickAddPatientRegisterBtn.click();
		}
		
		public void clickClearPatientInfo() 
		{
				clickClearPatientInfoBtn.click();
		}
		
		public void sendFirstName(String fname) 
		{
				sendFirstName.sendKeys(fname);
		}
		
		public void sendLastname(String lname) 
		{
				sendLastName.sendKeys(lname);
		}
		
		public void sendDOB(String dob) 
		{
				sendDob.sendKeys(dob);
		}
		
		public void clickMale() 
		{
				clickGender.click();
				clickMale.click();
		}
		
		public void clickFemale() 
		{
				clickGender.click();
				clickFemale.click();
		}
		
		public void clickOther() 
		{
				clickGender.click();
				clickOther.click();
		}
		
		public void sendMobileNumber(String mobn) 
		{
				sendMobileNumber.sendKeys(mobn);
		}
		
		public void sendWeight(String weight) 
		{
				sendWeight.sendKeys(weight);
		}
		
		public void selectKilograms() 
		{
				selectWeightUnit.click();
				selectKilo.click();
		}
		
		public void sendComments(String comments) 
		{
				sendComment.sendKeys(comments);
		}
		
		public void clickAddPateintToRegister() 
		{
				addPateint2Register.click();
				
		}
		
		public void sendPateintID(String patientID) 
		{
				sendPatientID.sendKeys(patientID);
		}
		
		public void selectBuilding(String building) 
		{
				selectPickUpBuilding.click();
		}
		
		public void selectPickupArea(String pickuparea) 
		{
				selectPickUpArea.click();
		}
		
		public void selectFloor(String floor) 
		{
				selectFloor.click();
		}
		
		public void selectUnit(String unit) 
		{
				selectUnit.click();
		}
		
		public void sendRoomNumber(String rno) 
		{
				sendRoomNo.sendKeys(rno);
		}
		
		public void sendPreferedMTP(String pMTP) 
		{
				sendPreferedService.sendKeys(pMTP);
				try {
					Robot rb = new Robot();
					rb.keyPress(KeyEvent.VK_DOWN);
					rb.keyPress(KeyEvent.VK_ENTER);
				} catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}
		
		public void removePreferedMTP() 
		{
				removePreferedService.click();
		}
		
		public void sendDestinationAddress(String destAdd, WebDriver driver) throws InterruptedException, AWTException 
		{
				WebDriverWait wait = new WebDriverWait(driver,15);
				sendDestiHCF.sendKeys(destAdd);
				wait.until(ExpectedConditions.visibilityOf(target));
				Actions action = new Actions(driver);
				action.moveToElement(target).click().perform();
		}
		
		public void removeDestinationAddress() 
		{
				removeDestiHCF.click();
		}
		
		public void selectDestBuilding() 
		{
				
				String e = clickDestBuilding.getText();
				System.out.println("Destination Building Name: "+e);
				String defaultText = "Choose Building";
				if(e.equals(defaultText))
				{	
					s.fail();
					Reporter.log("The Building name did not pre-populate.", true);
					clickDestBuilding.click();
					selectDestBuilding.click();
				}
				else
				{
					Reporter.log("The Building name did pre-populate.", true);
				}
				s.assertAll();
		}
		
		public void selectDestDropOffArea() 
		{
				String e = clickDestDropOff.getText();
				System.out.println("Destination Drop-off Name:"+ e);
				String defaultText = "Choose Drop-off Area";
				if(e.equals(defaultText))
				{
					SoftAssert s = new SoftAssert();
					s.fail();
					Reporter.log("The Drop-off area did not pre-populate.", true);
					clickDestDropOff.click();
					selectDestDropOff.click();
				}
				else
				{
					Reporter.log("The Drop-off Area name did pre-populate.", true);
				}
				s.assertAll();
		}
		
		public void selectDestFloor() 
		{
				String e = clickDestFloor.getText();
				System.out.println("Destination Floor:"+ e);
				String defaultText = "Choose Floor";
				if(e.equals(defaultText))
				{
					Reporter.log("The Floor name did not pre-populate so selcting.", true);
					clickDestFloor.click();
					selectDestFloor.click();
				}
				else
				{
					Reporter.log("The Floor name did pre-populate.", true);
				}
		}
		
		public void selectDestUnit() 
		{
				String e = clickDestUnit.getText();
				System.out.println("Destination Unit:"+ e);
				String defaultText = "Choose Unit";
				if(e.equals(defaultText))
				{
					Reporter.log("The Unit name did not pre-populate so selecting.", true);
					clickDestUnit.click();
					selectDestUnit.click();
				}else {
				Reporter.log("The Unit name did pre-populate.", true);
				}
		}
		
		public void sendDestRoomNumber(String drnum) 
		{
				sendRoomNo.sendKeys(drnum);
		}
		
		public void sendRecievingClinician(String dRClinician) 
		{
				sendRecievingClician.sendKeys(dRClinician);
		}
		
		public void clickCustomDestination() 
		{
				selectCustomAddressLabel.click();
		}
		
		public void clickDestinationCheckBox() 
		{
				clickAdditionToAcuity.click();
				System.out.println("Clicked on request to addition to acuity link.");
		}
		
		public void sendCustomDestName(String custDName) 
		{
				sendCustDestiName.sendKeys(custDName);
		}
		
		public void sendCustomDestAddress(String custDAddress) 
		{
				sendDestiAddress.sendKeys(custDAddress);
		}
		
		public void sendCustomDestZipCode(String zipCode) 
		{
				sendDestiZipCode.sendKeys(zipCode);
		}
		
		public void clickToGoBackToFirstPage() 
		{
				clickBack2FirstPage.click();
		}
		
		public void clickNextToGoThirdPage() 
		{
				clickPage2Next.click();
		}
		
		public void sendPickUpDate(String pickDate) 
		{
				selectPickupDate.sendKeys(pickDate);
		}
		
		public void sendPickUpTime(String pickTime) 
		{
				selectPickupTime.sendKeys(pickTime);
		}
		
		public void sendAppointmentPickUpDate(String appointPickDate) 
		{
				selectAppointmentDate.sendKeys(appointPickDate);
		}
		
		public void sendAppointmentPickUpTime(String appointPickTime) 
		{
				selectAppointmentTime.sendKeys(appointPickTime);
		}
		
		public void sendWaitingHours(String waitingHrs) 
		{
				selectWaitingHours.sendKeys(waitingHrs);
		}
		
		public void sendWaitingMinutes(String waitingMins) 
		{
				selectWaitingMinutes.sendKeys(waitingMins);
		}
		
		public void check3rdPage() 
		{
			if(check3rdPageNumber.isDisplayed())
					Reporter.log("3rd Page is Displayed.",true);
				else
				{
					Reporter.log("3rd Page is not Displayed",true);
					Assert.fail();
				}
		}
		
		public void clickNextTo4thPage() 
		{
				clickPage3Next.click();
		}
		
		public void clickBackTo2ndPage() 
		{
				clickToGoBackTo2ndPage.click();
		}
		
		public void check4thPage() 
		{
			if(check4thPageNumber.isDisplayed())
					Reporter.log("4th Page is Displayed.",true);
				else
				{
					Reporter.log("4th Page is not Displayed",true);
					Assert.fail();
				}
		}
		
		public void sendEndDate(String endDate) 
		{
				sendTransEndDate.sendKeys(endDate);
		}
		
		public void clickNextTo5thPage() 
		{
				clickPage4Next.click();
		}
		
		public void check5thPage() 
		{
			if(check5thPageNumber.isDisplayed())
					Reporter.log("5th Page is Displayed.",true);
				else
				{
					Reporter.log("5th Page is not Displayed",true);
					Assert.fail();
				}
		}
		
		public void clickPCSOption()
		{
				clickOnPCS.click();
		}
		
		public void sendPrimaryDiagnosis(String priDiag)
		{
				sendPrimaryDiag.sendKeys(priDiag);
		}
		
		public void checkPatientInfo()
		{
				
		}
		
		public void sendNotes(String notes)
		{
				sendNotes.sendKeys(notes);
		}
		
		public void sendPrimaryReasonForTransport(String priReason)
		{
				sendReasonForTransport.sendKeys(priReason);
		}
		
		public void clickNextToReviewPage() 
		{
				clickPage5Next.click();
		}
		
		public void clickConfirmForNoClinician() 
		{
				clickNoClinicianConfirm.click();
		}
		
		public void checkGroupReviewPage(WebDriver driver) 
		{
				WebDriverWait wait = new WebDriverWait(driver,15);
				wait.until(ExpectedConditions.visibilityOf(checkGroupReviewPage));
				if(checkGroupReviewPage.isDisplayed())
					Reporter.log("Review Page is Displayed.",true);
				else
				{
					Reporter.log("Review Page is not Displayed",true);
					Assert.fail();
				}
		}
		
				public void checkReviewPage(WebDriver driver) 
				{
						WebDriverWait wait = new WebDriverWait(driver,15);
						wait.until(ExpectedConditions.visibilityOf(checkReviewPage));
						if(checkReviewPage.isDisplayed())
						{
							Reporter.log("Review Page is Displayed.",true);
						}
						else
						{
							Reporter.log("Review Page is not Displayed",true);
							Assert.fail();
						}
				}
				
		public void clickRepeatSubmit() 
		{
				clickRepeatSumbit.click();
		}
		
		public void clickNonRepeatSubmit() 
		{
				clickNonRepeatSumbit.click();
		}
		
		public void checkSuccessfullRequestCreation() 
		{
				clickOK.click();
				if(checkPendingRequestScreen.isDisplayed())
					Reporter.log("Request is created Successfully.",true);
				else
				{
					Reporter.log("Pending Request Page is not Displayed",true);
					Assert.fail();
				}
		}
}
