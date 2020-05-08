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

WebUI.waitForElementPresent(findTestObject('CashTransfer/CashTransfer-Maker/radiobtn_personal'), 60, FailureHandling.STOP_ON_FAILURE)

'Select CDB Type Personal'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CashTransfer/CashTransfer-Maker/radiobtn_personal'),
	10)

'Search CDB'
WebUI.setText(findTestObject('CashTransfer/CashTransfer-Maker/search_CDB'), SearchCDB)

WebUI.delay(10)

'choose CDB'
WebUI.selectOptionByIndex(findTestObject('CashTransfer/CashTransfer-Maker/select_CDB'), 0)

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

