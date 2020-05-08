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

WebUI.selectOptionByLabel(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'), 
	'Survey And Interview', false, FailureHandling.STOP_ON_FAILURE)

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/AddSurveyorInterview'))

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Type'), 'SURVY', false)

WebUI.setText(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Name'), 'SURVEYOR')

WebUI.setText(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Place'), 'OFFICE')

'Date Method 2'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/SurveyAndInterview/IframeSurveyAndInterview'), 
    findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Date'), 'Nov 18, 2018', GlobalVariable.wait_js_long_time)

WebUI.click(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/SaveButton'))

WebUI.acceptAlert()

//====================================================================================

WebUI.switchToDefaultContent()

WebUI.scrollToElement(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaintblDocChecking0idch'), GlobalVariable.wait_short_time)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'),
	'Survey And Interview', false, FailureHandling.STOP_ON_FAILURE)

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/AddSurveyorInterview'))

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Type'), 'INTVW', false)

WebUI.setText(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Name'), 'INTERVIEWER')

WebUI.setText(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Place'), 'OFFICE')

'Date Method 2'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/SurveyAndInterview/IframeSurveyAndInterview'),
	findTestObject('Object Repository/CDB/Company/SurveyAndInterview/Date'), 'Nov 18, 2018', GlobalVariable.wait_js_long_time)

WebUI.click(findTestObject('Object Repository/CDB/Company/SurveyAndInterview/SaveButton'))

WebUI.acceptAlert()

