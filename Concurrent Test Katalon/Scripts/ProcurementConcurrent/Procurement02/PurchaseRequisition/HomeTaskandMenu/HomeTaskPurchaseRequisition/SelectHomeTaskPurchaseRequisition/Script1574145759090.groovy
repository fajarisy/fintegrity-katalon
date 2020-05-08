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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : ReqChecker, ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/PurchaseRequisition/HomeTaskAndMenu/PRTaskPanel'), 
    GlobalVariable.wait_js_long_time)

'Penjagaan jika task panel Purchase Requisition belum terbuka'
if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Procurement/PurchaseRequisition/HomeTaskAndMenu/PRTable'), 
    GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)) {
    'Prevent Panel Task jika belum terbuka'
    WebUI.waitForElementClickable(findTestObject('Object Repository/Procurement/PurchaseRequisition/HomeTaskAndMenu/OpenTask'), 
        GlobalVariable.wait_js_long_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/PurchaseRequisition/HomeTaskAndMenu/OpenTask'), 
        GlobalVariable.wait_js_long_time)
	
	WebUI.delay(15)
}

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Procurement\\_tmp2.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet("PRno")

int LastRow = sheet.getLastRowNum()

String PRno = sheet.getRow(LastRow).getCell(0).getStringCellValue()

println(PRno)

'Interate Table for Select facility by PO Number'
WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/PurchaseRequisition/HomeTaskAndMenu/PRTable'), 
    GlobalVariable.wait_long_time)

WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtPurchaseRequisition:tb"]'))

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

// Iterate row table
for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

    'Verifying the expected text in the each cell'
    if (Cols.get(0).getText().matches(PRno)) {
        'Masukan No PR yang baru tergenerate ke variable di bawah'

        'To locate anchor in the expected value matched row to perform action'
        Cols.get(8).findElement(By.tagName('a')).click()

        break
    }
}

'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_long_time)

