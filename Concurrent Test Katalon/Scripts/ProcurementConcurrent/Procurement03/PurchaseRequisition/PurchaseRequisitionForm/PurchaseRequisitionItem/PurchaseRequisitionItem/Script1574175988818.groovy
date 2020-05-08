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

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/AddPRItem')
	, GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/ItemName')
	, GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/ItemName'), 'PR_Enhanced')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/Type')
	, 'OFFICE EQUIPMENT', false, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/SubType')
	, 'OTHERS', false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/PurchaseAmount'), '7000')

WebUI.setText(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/Quantity'), '50')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/UnitMeasurement')
	, 'PACKAGE', false, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/PurchaseType')
	, 'Asset', false, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/Remarks'), 'Item Inputed via Automation Test Software enhanced')

WebUI.click(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRItem/SaveButton'))

WebUI.waitForAlert(GlobalVariable.wait_short_time)

WebUI.acceptAlert()
