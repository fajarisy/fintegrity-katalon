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

WebUI.callTestCase(findTestCase('LoginLogout/Login_Enhanced'), [('UserName') : UserName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/SearchFacilityReg'), [('IdFacility') : '149893/CV20/000653\r\n'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/Extractor/ExtractRegister'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/SearchFacilityDisburse'), [('IdFacility') : IdFacility], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/Extractor/ExtractDisbursement'), [('CreditType') : CreditType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/SearchCDB'), [('IdFacility') : '149893/CV20/000653\r\n'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/Extractor/ExtractCDB'), [:], FailureHandling.STOP_ON_FAILURE)

