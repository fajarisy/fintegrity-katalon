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
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.xmlbeans.impl.store.Locale.domNthCache as domNthCache
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.lang.String as String

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : GaMaker, ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Procurement\\_tmp.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('PRno')

int LastRow = sheet.getLastRowNum()

PRno = sheet.getRow(LastRow).getCell(0).getStringCellValue()

println(PRno)

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/InvoiceMenu'), 
    GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)) {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/InvoiceMenu'), 
        GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/InvoiceMenu'), 
        GlobalVariable.wait_long_time)
} else {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/InvoiceMenu'), 
        GlobalVariable.wait_long_time)
}

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/AddInvoice'), 
    GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/AddInvoice'), 
    GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/Iframe'), GlobalVariable.wait_long_time)

String Invoice = PRno.toString().substring(10)

WebUI.switchToDefaultContent()

WebUI.setText(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/SearchBox'), Invoice)

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/SearchResultBox'), 
    0)

not_run:WebUI.selectOptionByValue(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/SearchResultBox'), Invoice, false)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/PONumberLabel'), 
    GlobalVariable.wait_long_time)

WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.setText(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/InvoiceNo'), WebUI.getText(findTestObject(
            'Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/PONumberLabel')))

mydate = new Date()

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/Iframe'), 
    findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/InvoiceDate'), today = mydate.format('dd/MM/yyyy'), 
    GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/Iframe'), 
    findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/DueDate'), today = mydate.format('dd/MM/yyyy'), 
    GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Object Repository/Procurement/RegisterInvoice/HomeTaskAndMenu/SaveButton'))

WebUI.waitForAlert(10)

WebUI.acceptAlert()

