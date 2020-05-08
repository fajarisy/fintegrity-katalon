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

WebUI.switchToDefaultContent()

'Insurance by MBF'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Facility/FacilityRegister/FinancingForm/input_InsuranceByMBF_Default'),
	GlobalVariable.wait_js_long_time)

'Insurance Capitalized'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Facility/FacilityRegister/FinancingForm/input_InsuranceType_InsuranceCapitalized'),
	GlobalVariable.wait_js_long_time)

WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.wait_medium_time)

'Refresh Page'
WebUI.refresh()

'Insurance Company'
if(CustomerType == 'C'){
	WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_InsuranceCompany'), 'IC083', false)
} else if(CustomerType == 'P'){
	WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_InsuranceCompany'), 'IC083', false)
}

'Credit Protection'
not_run: WebUI.click(findTestObject('Facility/FacilityRegister/FinancingForm/input_CreditProtection'))

'Wait for Loading Page'
not_run: WebUI.delay(GlobalVariable.wait_medium_time)

'Insurance Company'
not_run: WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_LifeInsuranceCompany'), 
    'IC029', true)

not_run: WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

