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

WebUI.callTestCase(findTestCase('LoginLogout/Login_Enhanced'), [('UserName') : 'FID'], FailureHandling.STOP_ON_FAILURE)

'Open Facility List'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/DisbursementSheetCompare/SearchRegisterContract/RegisterMenu'), 
    15)

'Click Search by Contract No'
WebUI.selectOptionByValue(findTestObject('Object Repository/DisbursementSheetCompare/SearchRegisterContract/ComboBoxType'), 
    'idFacilityNo:s', false)

'Write Facility Contract on Search Box'
WebUI.setText(findTestObject('Object Repository/DisbursementSheetCompare/SearchRegisterContract/SearchBox'), IdFacility)

'Click Search'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/DisbursementSheetCompare/SearchRegisterContract/SearchButton'), 
    15)

'Open Disburse'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/DisbursementSheetCompare/SearchRegisterContract/OpenFacility'), 
    15)