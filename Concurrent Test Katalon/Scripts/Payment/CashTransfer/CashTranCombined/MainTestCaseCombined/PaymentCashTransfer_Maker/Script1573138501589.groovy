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
import com.kms.katalon.core.exception.StepErrorException as StepErrorException

WebUI.callTestCase(findTestCase('Payment/CashTransfer/CashTranCombined/HomeMenuCashTrans/AddNewCashTrans'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Payment/CashTransfer/CashTranCombined/Details/CashTransForm'), [('SearchCDB') : SearchCDB, ('CDB') : CDB
        , ('Branch') : Branch, ('PostingPeriodMonth') : PostingPeriodMonth, ('PaymentDate') : PaymentDate, ('Amount') : Amount, ('ReceivingAccount') : ReceivingAccount], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Payment/CashTransfer/CashTranCombined/Details/CashTransIframe'), [('InstallmentTo') : InstallmentTo
        , ('Installment') : Installment], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

'Click Button Send To Checker'
WebUI.click(findTestObject('CashTransfer/CashTransfer-Maker/btn_sendtochecker'))

WebUI.acceptAlert()

if(WebUI.verifyElementPresent(findTestObject('CashTransfer/CashTransfer-Maker/btn_sendtochecker')
	, 60, FailureHandling.OPTIONAL)){
	WebUI.waitForElementNotPresent(findTestObject('CashTransfer/CashTransfer-Maker/btn_sendtochecker'), 60)
}

