import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.LoginHelper.DoLogin'(GlobalVariable.Fintegrity, maker, GlobalVariable.FinPass)

WebUI.waitForElementPresent(findTestObject('Facility/FacilityTermination/btnMenu'), GlobalVariable.wait_js_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityTermination/span_Facility Register'), 
    GlobalVariable.wait_js_long_time)

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByLabel(findTestObject('Facility/FacilityTermination/select_Select ItemFacility NoLessee NameMarketingStatusCurrencyNet FinanceInstallment AmountInterestTenorPolice NumberBPKB Name'), 
    'Facility No', false)

WebUI.clearText(findTestObject('Facility/FacilityTermination/input_frmMainsearchValue_1_'))

WebUI.setText(findTestObject('Facility/FacilityTermination/input_frmMainsearchValue_1_'), facilityNo)

WebUI.click(findTestObject('Facility/FacilityTermination/input_Search_frmMainbtnSearch_'))

WebUI.click(findTestObject('Facility/FacilityTermination/frmMaindtFacilities0btnViewFacility'))

if (WebUI.verifyElementPresent(findTestObject('Facility/FacilityTermination/ModalNotification/popUpBLInfo'), GlobalVariable.wait_medium_time, 
    FailureHandling.OPTIONAL)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityTermination/ModalNotification/btnPopUpBLClose'), 
        GlobalVariable.wait_medium_time)

    WebUI.delay(GlobalVariable.wait_medium_time)
}
if (WebUI.verifyElementPresent(findTestObject('Facility/FacilityTermination/ModalNotification/modalErrNIKValidation'), GlobalVariable.wait_medium_time, 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.delay(GlobalVariable.wait_medium_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityTermination/ModalNotification/modalErrNIKValidation'), 
        GlobalVariable.wait_js_long_time)
	
	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityTermination/ModalNotification/modalErrNIKValidation'),
		GlobalVariable.wait_js_long_time)
}

WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.click(findTestObject('Facility/FacilityTermination/btnTermination'))

WebUI.acceptAlert()

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Facility/FacilityTermination/TerminationForm/terminationEffDate'), 
    effDate, GlobalVariable.wait_short_time)

WebUI.click(findTestObject('Facility/FacilityTermination/TerminationForm/btnGenerateTerminationCost'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Facility/FacilityTermination/FloatingButton/btnSave'))

WebUI.acceptAlert()

if (WebUI.verifyElementPresent(findTestObject('Facility/FacilityTermination/FloatingButton/btnSendNextToChecker'), GlobalVariable.wait_short_time, 
    FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('Facility/FacilityTermination/FloatingButton/btnSendNextToChecker'))

    WebUI.acceptAlert()
}

WebUI.delay(GlobalVariable.wait_js_long_time)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : true], FailureHandling.STOP_ON_FAILURE)

