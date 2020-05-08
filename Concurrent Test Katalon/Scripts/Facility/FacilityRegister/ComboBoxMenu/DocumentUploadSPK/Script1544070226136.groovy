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
import dynamicSelector.DynamicSelector as DynamicSelector

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.waitForElementClickable(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SelectDocumentUpload')
	, GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SelectDocumentUpload'), 
    '/Facility/DocumentUpload/form.xhtml', false)

WebUI.delay(GlobalVariable.wait_medium_time)

if (WebUI.verifyElementNotChecked(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickIsChecked'), 
    GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickIsChecked'), 
        GlobalVariable.wait_js_long_time)
}

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SetDate'), 
    '25/06/2018', GlobalVariable.wait_js_long_time)

if (WebUI.verifyElementClickable(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SelectFileDocUpload'), 
    FailureHandling.OPTIONAL)) {
    WebUI.sendKeys(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SelectFileDocUpload'), 'D:\\TestDataKatalon\\ConcurrentFacilityRegister\\dummy.PNG')
}

if (WebUI.verifyElementPresent(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickUpload'), GlobalVariable.wait_short_time, 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickUpload'))
}

WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

