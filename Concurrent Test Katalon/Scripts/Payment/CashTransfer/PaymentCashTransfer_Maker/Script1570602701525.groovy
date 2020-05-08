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
import customKeywords.CustomKeywordJS as CustomKeywordJS

/*
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.11.24:8080/Fintegrity')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_UserName_frmMainuserName', [('variable') : 'DWI']), 
    'DWI')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_Password_frmMainpassword', [('variable') : 'Mbf137??']), 
    'Mbf137??')

WebUI.click(findTestObject('LoginLogout/Page_ Login/input_frmMainbtnLogin'))

//*/
WebUI.delay(10)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CashTransfer/span_cashtransfer'), 10)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CashTransfer/CashTransfer-Maker/btn_addnew'), 
    10)
WebUI.delay(10)

'Select CDB Type Personal'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CashTransfer/CashTransfer-Maker/radiobtn_personal'), 
    10)

'Search CDB'
WebUI.setText(findTestObject('CashTransfer/CashTransfer-Maker/search_CDB'), SearchCDB)

WebUI.delay(10)

'choose CDB'
WebUI.selectOptionByValue(findTestObject('CashTransfer/CashTransfer-Maker/select_CDB'), CDB, false)

'Input Branch'
WebUI.selectOptionByValue(findTestObject('CashTransfer/CashTransfer-Maker/select_branch'), Branch, false)

'Input Posting Period Month'
WebUI.selectOptionByValue(findTestObject('CashTransfer/CashTransfer-Maker/month_postingperiod'), PostingPeriodMonth, false)

'Input Payment Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CashTransfer/CashTransfer-Maker/payment_date'), 
    PaymentDate, GlobalVariable.wait_js_long_time)

'Input Amount'
WebUI.setText(findTestObject('CashTransfer/CashTransfer-Maker/amount'), Amount)

'Input Receiving Account'
WebUI.selectOptionByValue(findTestObject('CashTransfer/CashTransfer-Maker/receiving_account'), ReceivingAccount, false)

'Click Button Save'
WebUI.click(findTestObject('CashTransfer/CashTransfer-Maker/btn_save'))

WebUI.acceptAlert()

WebUI.delay(10)

'Add Assignment'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CashTransfer/CashTransfer-Maker/btn_addnewassignment'), 
    10)

'choose Facility No'
WebUI.selectOptionByValue(findTestObject('CashTransfer/CashTransfer-Maker/select_facilityno'), FacilityNo, false)

WebUI.delay(10)

'Input Installment To'
WebUI.selectOptionByValue(findTestObject('CashTransfer/CashTransfer-Maker/installment_to'), InstallmentTo, false)
WebUI.delay(3)

'Input Installment Amount'
WebUI.setText(findTestObject('CashTransfer/CashTransfer-Maker/installment'), Installment)
WebUI.delay(3)

'Click Button Save Assignment'
WebUI.click(findTestObject('CashTransfer/CashTransfer-Maker/btn_save_assignment'))

WebUI.acceptAlert()

WebUI.delay(10)
WebUI.switchToDefaultContent()

'Click Button Send To Checker'
WebUI.click(findTestObject('CashTransfer/CashTransfer-Maker/btn_sendtochecker'))
WebUI.acceptAlert()
WebUI.delay(10)

