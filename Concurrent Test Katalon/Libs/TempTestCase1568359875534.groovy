import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\as4011\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Facility\\FacilityRegister\\ComboBoxMenu\\DocumentUploadSPK\\20190913_143115\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import dynamicSelector.DynamicSelector as DynamicSelector

not_run: WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SelectDocumentUpload'), 
    '/Facility/DocumentUpload/form.xhtml', true)

not_run: WebUI.delay(GlobalVariable.wait_medium_time)

not_run: if (WebUI.verifyElementNotChecked(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickIsChecked'), 
    GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickIsChecked'), 
        GlobalVariable.wait_js_long_time)
}

not_run: CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SetDate'), 
    '25/06/2018', GlobalVariable.wait_js_long_time)

not_run: if (WebUI.verifyElementClickable(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SelectFileDocUpload'), 
    FailureHandling.OPTIONAL)) {
    WebUI.sendKeys(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/SelectFileDocUpload'), 'D:\\\\IntegrationScriptTest\\\\FacilityRegister\\\\dummy.PNG')
}

not_run: if (WebUI.verifyElementPresent(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickUpload'), 
    GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK/ClickUpload'))
}

not_run: WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

String dynamicId = '%s'

String xpath = String.format(DynamicSelector.dynamicIdPath, dynamicId)

WebUI.click(DynamicSelector.getMyTestObject('xpath', xpath))

''', 'Test Cases/Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK', new TestCaseBinding('Test Cases/Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
