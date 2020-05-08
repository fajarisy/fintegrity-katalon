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
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.xmlbeans.impl.store.Locale.domNthCache as domNthCache
import java.lang.String as String

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : GaMaker, ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/PrepaymentMenu'), 
    GlobalVariable.wait_long_time)

WebUI.waitForElementClickable(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/PrepaymentMenu'), 
    GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/PrepaymentMenu'), 
    GlobalVariable.wait_long_time)

WebUI.waitForElementNotPresent(findTestObject('Object Repository/Procurement/FloatingButtons/AddPrepayment'), GlobalVariable.wait_long_time)

WebUI.waitForElementClickable(findTestObject('Object Repository/Procurement/FloatingButtons/AddPrepayment'), GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/FloatingButtons/AddPrepayment'), 
    GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/SearchBoxPO'), GlobalVariable.wait_long_time)

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Procurement\\_tmp3.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('PRno')

int LastRow = sheet.getLastRowNum()

PRno = sheet.getRow(LastRow).getCell(0).getStringCellValue()

println(PRno)

String PONumb = PRno.toString().substring(11)

WebUI.setText(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/SearchBoxPO'), PONumb)

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/SearchResultBox'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/TotalAmountLabel'), 
    GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/InputAmount'), WebUI.getText(findTestObject(
            'Object Repository/Procurement/Prepayment/HomeTaskAndMenu/TotalAmountLabel')))

mydate = new Date()

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/IframePrepaymentMenu'), 
    findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/TransactionDate'), today = mydate.format('dd/MM/yyyy'), 
    GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/SaveButtonMenu'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_medium_time)


