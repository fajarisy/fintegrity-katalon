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

WebUI.switchToDefaultContent(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'), GlobalVariable.wait_long_time)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'), 'SLIK Information', 
	false, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/SlikInformation/RelationshiptoComplainant'), GlobalVariable.wait_long_time, 
	FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/SlikInformation/RelationshiptoComplainant'), 
	'0110', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/SlikInformation/DebtorCategory'),
	'5199', false)


