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

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Fee/select_AssetLife InsuranceComm'), '/Facility/Fee/list.xhtml', 
    false)

'Delay'
WebUI.delay(GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Fee/img'))

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Fee/select_--Please Select One--Ad'), '7', 
    false)

//CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Fee/input__frmMainnetFinEnable'), GlobalVariable.wait_js_long_time)
WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Fee/input__frmMainnetFinEnable'))

WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Fee/input_IDR_frmMainbtnAL_saveExe'))

WebUI.acceptAlert()

'Swith to Default content after Accepting Alert (Important)'
WebUI.switchToDefaultContent()

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

