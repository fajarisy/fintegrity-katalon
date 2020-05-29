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

WebUI.waitForElementClickable(findTestObject("Object Repository/TerminationSimulation/TerminationForm/SearchFacility"), 
	GlobalVariable.wait_long_time)

WebUI.setText(findTestObject("Object Repository/TerminationSimulation/TerminationForm/SearchFacility"), CustomerName)

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.selectOptionByIndex(findTestObject("Object Repository/TerminationSimulation/TerminationForm/SearchResultBox"), 0)

//WebUI.waitForElementClickable(findTestObject("Object Repository/TerminationSimulation/TerminationForm/TerminationEffectiveDate"),
//	 120)

//WebUI.waitForElementVisible(findTestObject("Object Repository/TerminationSimulation/TerminationForm/TerminationEffectiveDate"),
//	 120)

WebUI.delay(120)

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject("Object Repository/TerminationSimulation/TerminationForm/TerminationEffectiveDate"), 
	"May 13, 2020", GlobalVariable.wait_js_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject("Object Repository/TerminationSimulation/TerminationForm/GenerateTerminationCost"), GlobalVariable.wait_long_time)

WebUI.waitForAlert(GlobalVariable.wait_short_time)

WebUI.acceptAlert()

WebUI.waitForElementClickable(findTestObject("Object Repository/TerminationSimulation/FlowPanel/SaveButton"),
	GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject("Object Repository/TerminationSimulation/FlowPanel/SaveButton"), GlobalVariable.wait_long_time)

WebUI.acceptAlert()

