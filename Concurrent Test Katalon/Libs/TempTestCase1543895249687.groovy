import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
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


RunConfiguration.setExecutionSettingFile('C:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Facility\\FacilityRegister\\FacilityRegister\\20181204_104729\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

'Login Maker'
not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : 'DEBBY'], FailureHandling.STOP_ON_FAILURE)

'Home Task\\r\\n'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/FacilityHomeTask'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

'Financing'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/FacilityFinancing'), [:], FailureHandling.STOP_ON_FAILURE)

'Insurance'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/FacilityInsurance'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Asset'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/Asset'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Commision'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/Commission'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Additional Info'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/AdditionalInfo'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Financing Scheme'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/FinancingScheme'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Fee'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/Fee'), [:], FailureHandling.STOP_ON_FAILURE)

''', 'Test Cases/Facility/FacilityRegister/FacilityRegister', new TestCaseBinding('Test Cases/Facility/FacilityRegister/FacilityRegister',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
