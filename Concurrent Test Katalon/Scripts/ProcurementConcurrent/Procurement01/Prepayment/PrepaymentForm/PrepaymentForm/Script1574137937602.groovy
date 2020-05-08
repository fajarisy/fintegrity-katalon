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
import java.lang.String as String

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Procurement\\_tmp.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('PRno')

int LastRow = sheet.getLastRowNum()

PRno = sheet.getRow(LastRow).getCell(0).getStringCellValue()

println(PRno)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/Prepayment/PrepaymentEntry/InvoiceNo'), GlobalVariable.wait_long_time)

WebUI.waitForElementClickable(findTestObject('Object Repository/Procurement/Prepayment/PrepaymentEntry/InvoiceNo'), GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/Procurement/Prepayment/PrepaymentEntry/InvoiceNo'), PRno)

WebUI.setText(findTestObject('Object Repository/Procurement/Prepayment/PrepaymentEntry/RefNo'), PRno)

WebUI.setText(findTestObject('Object Repository/Procurement/Prepayment/PrepaymentEntry/AccountNo'), '123123123')

WebUI.setText(findTestObject('Object Repository/Procurement/Prepayment/PrepaymentEntry/AccountName'), 'Automated Data')

