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
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.xmlbeans.impl.store.Locale.domNthCache as domNthCache
import java.lang.String as String

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : Checker, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/PanelTaskPrepayment'), 
    GlobalVariable.wait_js_long_time)

'Penjagaan jika task panel Benchmark Price belum terbuka'
if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/TableBodyPrepayment'), 
    GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)) {
    'Prevent Panel Task jika belum terbuka'
    WebUI.waitForElementClickable(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/OpenTask'), GlobalVariable.wait_js_long_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/OpenTask'), 
        GlobalVariable.wait_js_long_time)
}

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Procurement\\_tmp.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('PRno')

int LastRow = sheet.getLastRowNum()

PRno = sheet.getRow(LastRow).getCell(0).getStringCellValue()

println(PRno)

'Interate Table for Select facility by Customer Name'
WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/Prepayment/HomeTaskAndMenu/TableBodyPrepayment'), 
    GlobalVariable.wait_long_time)

WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtPrepayment:tb"]'))

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

String PRnumb = PRno.substring(11)

'Iterate row table'
println(PRnumb)

for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

    println(Cols.get(1).getText())

    println(Cols.size())

    'Verifying the expected text in the each cell'
    try {
        if (Cols.get(2).getText().matches('.*' + PRnumb)) {
            List<WebElement> action = Rows.get(i).findElements(By.tagName('td'))

            action.get(9).findElement(By.tagName('a')).click()

            break
        } else {
            throw new com.kms.katalon.core.exception.StepErrorException('There is no PR No with no ' + PRno)
        }
    }
    catch (Exception e) {
        println(e)
    } 
}

'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_long_time)

