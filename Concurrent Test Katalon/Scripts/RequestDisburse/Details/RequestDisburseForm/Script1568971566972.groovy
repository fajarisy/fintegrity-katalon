import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.WaitForElementPresentKeyword as WaitForElementPresentKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import groovy.time.TimeCategory as TimeCategory
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import java.util.Date as Date
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

WebUI.callTestCase(findTestCase('RequestDisburse/FlowControlButton/EditButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_long_time)

today = new Date()

nextthreeday = (today+10)

requestDate = today.format('MMM dd, yyyy')

debtorDueDate = nextthreeday.format('MMM dd, yyyy')

//WebElement debtorDuedate2 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/DebtorDueDate'), 10) 
//
//WebElement requestDate2 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/RequestDate'), 10)

//WebUI.executeJavaScript('arguments[0].value=\'Nov 04, 2019\';', Arrays.asList(debtorDuedate2))
//
//WebUI.executeJavaScript('arguments[0].value=\'Nov 04, 2019\';', Arrays.asList(requestDate2))

//CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/DebtorDueDate'), 
//    duedatee, GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/DebtorDueDate'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/DebtorDueDate2'))

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/RequestDate'), 
    requestdatee, GlobalVariable.wait_long_time)

WebElement debtorDuedate2 = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/DebtorDueDate'), 10)

//WebUI.click(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/RequestDate'))

WebUI.delay(5)

NetDownAmount = WebUI.getText(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/NetDownAmount'), FailureHandling.OPTIONAL)

println('NetDownAmount = ' + NetDownAmount)

WebUI.delay(15)

WebUI.setText(findTestObject('Object Repository/RequestDisburse/RequestDisburseForm/NetDownSupplier'), NetDownAmount)

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.callTestCase(findTestCase('RequestDisburse/FlowControlButton/SaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)