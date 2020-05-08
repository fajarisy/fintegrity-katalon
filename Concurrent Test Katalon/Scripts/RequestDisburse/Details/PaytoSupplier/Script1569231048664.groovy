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

WebUI.callTestCase(findTestCase('RequestDisburse/FlowControlButton/EditButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

//CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/DebtorDueDate'),
//	'Nov 15, 2019', GlobalVariable.wait_long_time)
//
//CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/RequestDate'),
//	'Nov 04, 2019', GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/ListofSupEdit_1'), 
    GlobalVariable.wait_js_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/RequestDisburse/iFrameSuplier/AcquisitionAmmt'), GlobalVariable.wait_long_time)

AcquisitionAmt = WebUI.getText(findTestObject('Object Repository/RequestDisburse/iFrameSuplier/AcquisitionAmmtLabel'))

WebUI.setText(findTestObject('Object Repository/RequestDisburse/iFrameSuplier/AcquisitionAmmt'), AcquisitionAmt)

DPSecurityDeposit = WebUI.getText(findTestObject('Object Repository/RequestDisburse/iFrameSuplier/DPSecurityDepositLabel'))

WebUI.setText(findTestObject('Object Repository/RequestDisburse/iFrameSuplier/DPSecurityDeposit'), DPSecurityDeposit)

WebUI.click(findTestObject('Object Repository/RequestDisburse/iFrameSuplier/SaveButton'))

WebUI.acceptAlert()

WebUI.callTestCase(findTestCase('RequestDisburse/FlowControlButton/SaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(20)

WebUI.callTestCase(findTestCase('RequestDisburse/FlowControlButton/SendNextButton'), [:], FailureHandling.STOP_ON_FAILURE)

