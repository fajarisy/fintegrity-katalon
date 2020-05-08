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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Login Maker'
not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : CMO], FailureHandling.STOP_ON_FAILURE)

'Home Task\r\n'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/HomeTask/FacilityHomeTask'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

'Financing'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/FinancingForm/FacilityFinancing'), [:], FailureHandling.STOP_ON_FAILURE)

'Insurance'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/FinancingForm/FacilityInsurance'), [('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

'Insurance'
WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Asset'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/ComboBoxMenu/Asset'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Commision'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/ComboBoxMenu/Commission'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Additional Info'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Financing Scheme'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/ComboBoxMenu/Fee'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Fee'
not_run: WebUI.callTestCase(findTestCase('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Fee'
WebUI.callTestCase(findTestCase('Facility/FacilityRegister/ComboBoxMenu/DocumentUploadSPK'), [:], FailureHandling.STOP_ON_FAILURE)

'Insurance'
WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

'Insurance'
WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilityWFNextButton'), [:], FailureHandling.STOP_ON_FAILURE)

