import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
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
import org.apache.xmlbeans.impl.store.Locale.domNthCache as domNthCache
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.lang.String as String
import org.apache.commons.lang3.StringUtils as StringUtils
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : 'NATALIA', ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

WebUI.switchToDefaultContent()

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/PlanTenor'), GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/PlanTenor'), '1')

mydate = new Date()

String today = mydate.format('dd/MM/yyyy')

WebElement paymentStart = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/PaymentStart'), 
    10)

WebUI.executeJavaScript('arguments[0].value=\'16/10/2019\';', Arrays.asList(paymentStart))

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/RefreshTenorButton'), 
    GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/PlanDate'), GlobalVariable.wait_long_time)

WebUI.waitForElementVisible(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/PlanDate'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

WebElement planDate = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/PlanDate'), 
    10)

WebUI.executeJavaScript('arguments[0].value=\'16/10/2019\';', Arrays.asList(planDate))

WebElement reminderDate = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/ReminderDate'), 
    10)

WebUI.executeJavaScript('arguments[0].value=\'16/10/2019\';', Arrays.asList(reminderDate))

String prepaymentAmount = WebUI.getText(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/PrepaymentAmount'))

WebUI.setText(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/Amount'), prepaymentAmount)

WebUI.println(prepaymentAmount)

WebUI.sendKeys(findTestObject('Object Repository/Procurement/RegisterInvoice/InvoiceEntry/InvoiceAmount'), Keys.chord(prepaymentAmount))

WebUI.println(prepaymentAmount)

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.callTestCase(findTestCase('Procurement/FloatingButtons/SaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Procurement/FloatingButtons/SendNextButton'), [:], FailureHandling.STOP_ON_FAILURE)

