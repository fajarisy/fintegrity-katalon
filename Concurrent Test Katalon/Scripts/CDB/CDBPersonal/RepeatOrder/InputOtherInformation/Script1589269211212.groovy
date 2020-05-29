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

'Last Education'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_COLLEGEJUNIOR HIGH SCHO'), 'UNIVE', true)

'Mother Maiden Name'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainmotherMaiden'), 'MOMMY')

WebUI.selectOptionByValue(findTestObject('CDB/Personal/OtherInformation/select_Please SelectLOWMEDIUMHIGH'), 'L', true)

if (WebUI.verifyElementNotChecked(findTestObject('CDB/Personal/OtherInformation/input__frmMainj_id256'), GlobalVariable.wait_short_time, 
    FailureHandling.OPTIONAL)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/OtherInformation/input__frmMainj_id256'), 
        10)
}

