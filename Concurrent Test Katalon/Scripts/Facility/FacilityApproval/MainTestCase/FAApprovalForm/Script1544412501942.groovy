import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : BM, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Facility/FacilityApproval/HomeTask/FacilityApprovalHomeTask'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Facility/FacilityApproval/ApprovalForm/ApprovalDate'), GlobalVariable.wait_js_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Facility/FacilityApproval/ApprovalForm/ApprovalDate'), 
    'Dec 10, 2018', GlobalVariable.wait_js_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Facility/FacilityApproval/ApprovalForm/ValidUntil'), 
    'Dec 12, 2019', GlobalVariable.wait_js_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Facility/FacilityApproval/ApprovalForm/Reminder'), 
    '10/06/2019', GlobalVariable.wait_js_long_time)

'Place'
WebUI.setText(findTestObject('Facility/FacilityApproval/ApprovalForm/Opinion'), 'Test Katalon')

WebUI.selectOptionByValue(findTestObject('Facility/FacilityApproval/ApprovalForm/LastApproval'), 'BMGR0', true)

WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySendNextWithoutGoHome'), [:], FailureHandling.STOP_ON_FAILURE)

