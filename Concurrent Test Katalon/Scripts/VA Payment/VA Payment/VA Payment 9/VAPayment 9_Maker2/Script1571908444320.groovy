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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

/*
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.0.100:8080/Fintegrity')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_UserName_frmMainuserName', [('variable') : 'DWI']), 
    'DWI')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_Password_frmMainpassword', [('variable') : 'Mbf137??']), 
    'Mbf137??')

WebUI.click(findTestObject('LoginLogout/Page_ Login/input_frmMainbtnLogin'))

//*/
WebUI.delay(10)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('VA Payment/span_VA'), 10)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('VA Payment/span_VA9'), 10)

'Click Upload'
WebUI.sendKeys(findTestObject('VA Payment/VA Payment Maker/open_folder_VA9'), 'D:\\VA Upload\\VA UPLOAD 9 digit Test2.xls')

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('VA Payment/VA Payment Maker/upload_file_VA9'))

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)
WebUI.delay(10)

'Upload Data already exist'
if (WebUI.verifyElementVisible(findTestObject('Object Repository/VA Payment/VA Payment Maker/alert_confirmation'), FailureHandling.OPTIONAL)) {
	WebUI.waitForElementClickable(findTestObject('Object Repository/VA Payment/VA Payment Maker/confirmation_ok'), 10, FailureHandling.OPTIONAL)
	'OK'
	WebUI.click(findTestObject('Object Repository/VA Payment/VA Payment Maker/confirmation_ok'))
}

'Input Receiving Bank'
WebUI.selectOptionByValue(findTestObject('VA Payment/VA Payment 14 Maker/receiving_bank'), ReceivingBank, false)

'Input Description'
WebUI.setText(findTestObject('VA Payment/VA Payment 14 Maker/description'), Description)

'Save'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('VA Payment/VA Payment Maker/save'), 10)

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_short_time)

'Send Next'
WebUI.click(findTestObject('VA Payment/VA Payment Maker/send_to_checker'))

WebUI.acceptAlert()

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

