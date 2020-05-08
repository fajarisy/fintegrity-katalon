import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'customKeywords.LoginHelper.DoLogin'(GlobalVariable.Fintegrity, UserMaker, GlobalVariable.FinPass)

WebUI.waitForElementPresent(findTestObject('EntryBooking/Page Home Menu Footer/img'), GlobalVariable.wait_js_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('EntryBooking/Page Home Menu Footer/span_Entry Booking'), 
    GlobalVariable.wait_js_long_time)

'Wait loading Page EntryBooking List'
WebUI.delay(GlobalVariable.wait_short_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('EntryBooking/Page EB_Maker/img'), GlobalVariable.wait_js_long_time)

'Wait for loading page'
WebUI.delay(GlobalVariable.wait_short_time)

if (FacilityType.toString().equalsIgnoreCase('FINAL')) {
    WebUI.selectOptionByValue(findTestObject('EntryBooking/Page EB_Maker/select_CONSUMER FINANCEFINANCE'), 'FINAL', false)
}

if (CustomerType.toString().equalsIgnoreCase('C')) {
	 WebUI.selectOptionByValue(findTestObject('EntryBooking/Page EB_Maker/select_PersonalCorporate'), 'C', false)
}

WebUI.setText(findTestObject('EntryBooking/Page EB_Maker/input_frmMainname'), CustomerName)

WebUI.setText(findTestObject('EntryBooking/Page EB_Maker/input_frmMainphoneNo'), PhoneNumber)

WebUI.setText(findTestObject('EntryBooking/Page EB_Maker/textarea_frmMainaddress'), Address)

WebUI.setText(findTestObject('EntryBooking/Page EB_Maker/input_frmMainsupAssetFilter_su'), SupplierName)

'Wait for select option Dealer is appear'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByLabel(findTestObject('EntryBooking/Page EB_Maker/select_FORD JAKARTA SELATANFOR'), SupplierName, false)

'Wait for select option Dealer - click event is affected to screen'
WebUI.delay(GlobalVariable.wait_short_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('EntryBooking/Page EB_Maker/input_frmMainbtnAL_saveExec'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()

WebUI.waitForElementNotPresent(findTestObject('Object Repository/EntryBooking/Page EB_Maker/MaskLoadingScreen'), GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('EntryBooking/Page EB_Maker/input_frmMainbtnA_wfNextWithou'), GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('EntryBooking/Page EB_Maker/input_frmMainbtnA_wfNextWithou'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_long_time)

