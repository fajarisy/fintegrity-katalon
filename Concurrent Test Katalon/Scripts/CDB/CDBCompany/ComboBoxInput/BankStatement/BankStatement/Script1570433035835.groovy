import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.switchToDefaultContent()

WebUI.scrollToElement(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'), GlobalVariable.wait_short_time)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'), 'Bank Statement', 
    false)

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

'Add BankStatement'
WebUI.waitForElementVisible(findTestObject('Object Repository/CDB/Company/BankStatement/AddBankStatement'), 
	GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/Company/BankStatement/AddBankStatement'), 
    GlobalVariable.wait_js_long_time)

'Wait For Loading PopUp'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.waitForElementClickable(findTestObject('Object Repository/CDB/Company/BankStatement/BankName'), GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/BankStatement/BankName'), '13', 
    false)

WebUI.setText(findTestObject('Object Repository/CDB/Company/BankStatement/AccountNo'), '123123123')

WebUI.setText(findTestObject('Object Repository/CDB/Company/BankStatement/AccountName'), CustomerName)

WebUI.setText(findTestObject('Object Repository/CDB/Company/BankStatement/MinimumOSBalance'), '400000')

WebUI.setText(findTestObject('Object Repository/CDB/Company/BankStatement/LatestOSBalance'), '200000000')

WebUI.click(findTestObject('Object Repository/CDB/Company/BankStatement/SaveButton'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_long_time)
