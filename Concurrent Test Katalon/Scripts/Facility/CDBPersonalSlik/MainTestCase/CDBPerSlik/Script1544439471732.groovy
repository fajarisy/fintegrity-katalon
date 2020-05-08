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

'Call for Log in Case'
not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : BA, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

'CDB PerSlik Home Task Case'
WebUI.callTestCase(findTestCase('Facility/CDBPersonalSlik/HomeTask/CDBPerSlikHomeTask'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Facility/CDBPerSlik/PerSlikForm/PickTaskButton'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Facility/CDBPerSlik/PerSlikForm/PickTaskButton'), 
        GlobalVariable.wait_js_long_time)

    WebUI.acceptAlert()
}

'Wait for Email Element to Show Up'
WebUI.waitForElementPresent(findTestObject('Object Repository/Facility/CDBPerSlik/PerSlikForm/EmailAddress'), GlobalVariable.wait_long_time)

'Wait for Email Element to Clickable'
WebUI.waitForElementClickable(findTestObject('Object Repository/Facility/CDBPerSlik/PerSlikForm/EmailAddress'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

'Email Address'
WebUI.setText(findTestObject('Object Repository/Facility/CDBPerSlik/PerSlikForm/EmailAddress'), 'automatedtest@gmail.com')

'Relationship to Complainant'
WebUI.selectOptionByValue(findTestObject('Object Repository/Facility/CDBPerSlik/PerSlikForm/RelationshiptoComp'), '0110', 
    false)

'Asset Sepparation Agreement'
WebUI.selectOptionByValue(findTestObject('Object Repository/Facility/CDBPerSlik/PerSlikForm/AssetsSeparationAgreement'), 
    'T', false)

'Save CDB PerSlik'
WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Wait Element Send Next'
WebUI.waitForElementClickable(findTestObject('Facility/FloatingButton/FacilityWFNextWithoutGoHome'), GlobalVariable.wait_medium_time)

'Send Next'
WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySendNextWithoutGoHome'), [:], FailureHandling.STOP_ON_FAILURE)

