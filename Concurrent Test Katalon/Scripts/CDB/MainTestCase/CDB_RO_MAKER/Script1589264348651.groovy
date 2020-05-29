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

CustomKeywords.'customKeywords.LoginHelper.DoLogin'(GlobalVariable.Fintegrity, CMO, GlobalVariable.FinPass)

WebUI.callTestCase(findTestCase('CDB/HomeTaskCDB/HomeTaskImproved'), [('CustomerName') : CustomerName, ('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/RepeatOrder/InputBasicInformation'), [('PlaceOfBirth') : PlaceOfBirth, ('DateOfBirth') : DateOfBirth], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/RepeatOrder/InputIdInformation'), [('IdCard') : IdCard], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/RepeatOrder/InputOtherInformation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/FloatingButton/ButtonSave'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('CDB/Personal/Page_FormCDBPersonal/div_concat(id(  frmMainmodalMessage_Div  ))_06358c'), 
    GlobalVariable.wait_short_time)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/div_concat(id(  frmMainmodalMessage_Div  ))_06358c'), 
        0)
}

'Klik button repeat order\r\n'
if (WebUI.verifyElementPresent(findTestObject('CDB/Personal/Page_FormCDBPersonal/btnRepeatOrder'), GlobalVariable.wait_short_time)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/btnRepeatOrder'), 
        GlobalVariable.wait_short_time)

    WebUI.acceptAlert()
}

'If Id card expired is not lifetime, then check the box'
if (WebUI.verifyElementNotChecked(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id148'), GlobalVariable.wait_short_time, 
    FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id148'))
}

WebUI.clearText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_Family Certificate No_frmMainj_id322'))

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_Family Certificate No_frmMainj_id322'), '1234567')

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Address/LegalAddress'), [('Address') : Address, ('Country') : Country
        , ('Region') : Region, ('District') : District, ('SubDistrict') : SubDistrict, ('Rt') : Rt, ('Rw') : Rw], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/BankStatement/BankStatement'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/SurveyInterview/SurveyInterview'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/FloatingButton/ButtonSendNext'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/HomeTaskCDB/HomeTaskImproved'), [('CustomerName') : CustomerName, ('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/FloatingButton/ButtonSendNext'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : true], FailureHandling.STOP_ON_FAILURE)

