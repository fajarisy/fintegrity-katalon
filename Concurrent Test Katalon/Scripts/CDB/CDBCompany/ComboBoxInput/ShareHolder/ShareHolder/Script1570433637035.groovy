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

WebUI.selectOptionByLabel(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'), 'Shareholder and Management', 
    false, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/ShareHolder/AddShareHolder'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/Company/ShareHolder/AddShareHolder'), 
    GlobalVariable.wait_js_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/ShareHolder/IframeShareHolder'), GlobalVariable.wait_long_time, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/CDB/Company/ShareHolder/SearchShareHolder'), 'Asep', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/ShareHolder/ShareHolderOptions'), '023424', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/ShareHolder/Position'), '01', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/ShareHolder/ShareHolderStatus'), '1', false)

WebUI.setText(findTestObject('Object Repository/CDB/Company/ShareHolder/SharePercentage'), '50')

WebUI.click(findTestObject('Object Repository/CDB/Company/ShareHolder/SaveShareHolder'))

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.acceptAlert()

WebUI.switchToDefaultContent()

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/Company/ShareHolder/PublicShareButton'), GlobalVariable.wait_js_long_time)