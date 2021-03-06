import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import customKeywords.CustomKeywordJS as CustomKeywordJS
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.xmlbeans.impl.store.Locale.domNthCache as domNthCache
import java.lang.String as String


WebUI.delay(GlobalVariable.wait_short_time)

/*
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)
WebUI.navigateToUrl('http://192.168.0.100:4040/Fintegrity')
WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_UserName_frmMainuserName', [('variable') : 'DWI']), 
    'DWI')
WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_Password_frmMainpassword', [('variable') : 'Mbf137??']), 
    'Mbf137??')
WebUI.click(findTestObject('LoginLogout/Page_ Login/input_frmMainbtnLogin'))
WebUI.maximizeWindow()
//*/


//=========Get CashNo Function============
String getcashno;

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Cash Transaction\\CashTransaction.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('CT4')

//int row = sheet.getLastRowNum()

println(sheet.getRow(1).getCell(5))

getcashno = sheet.getRow(1).getCell(5)

file.close()

//=============================================================

if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/Show_Task_Table_CTPayment'),
	10, FailureHandling.OPTIONAL)) {
/*
	'TUTUP TASK'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/minimize_task'),
		10, FailureHandling.STOP_ON_FAILURE)

	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/minimize_task'),
		GlobalVariable.wait_js_long_time)

	WebUI.delay(10)
*/
	'BUKA TASK'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/Show_Task_Table_CTPayment'),
		10, FailureHandling.STOP_ON_FAILURE)

	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/open_task'),
		GlobalVariable.wait_js_long_time)

	WebUI.delay(10)
/*
} else {
	'BUKA TASK'
	WebUI.waitForElementClickable(findTestObject('Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/open_task'),
		10, FailureHandling.STOP_ON_FAILURE)

	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/open_task'),
		GlobalVariable.wait_js_long_time)

	WebUI.delay(10)
*/
}

WebUI.delay(10)

'Untuk mencari Last Page'
if (WebUI.verifyElementPresent(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/Last_Page_Table'), 
    GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)) {
    'Last Page of Table'
    if (WebUI.verifyElementClickable(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/Last_Page_Table'), 
        FailureHandling.OPTIONAL)) {
        CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_Panel_Maker/Last_Page_Table'), 
            GlobalVariable.wait_js_long_time)

        WebUI.delay(GlobalVariable.wait_short_time)
    }
}

WebUI.delay(10)
'Expected value from Table'
WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtAccTranPayment:tb"]'))

'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

'Find a matching text in a table and performing action'

'Loop will execute for all the rows of the table'
table: for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

   // for (int j = 0; j < Cols.size(); j++) {
        'Verifying the expected text in the each cell'
        if (Cols.get(0).getText().equalsIgnoreCase(getcashno)) {
            'To locate anchor in the expected value matched row to perform action'
            Cols.get(6).findElement(By.tagName('a')).click()

            break
        //}
    }
}

'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

'Pick task'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_View_Maker/Pick_task'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()

'Input Payment Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_View_Maker/PaymentDate'), 
    PaymentDate, GlobalVariable.wait_js_long_time)

'Input Actual Payment'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_View_Maker/PaidAmount'), 
    ActualPayment)
WebUI.delay(10)

'Choose Bank Account'
WebUI.selectOptionByValue(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_View_Maker/BankAccount'), 
    BankAccount, false)

'Save'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_View_Maker/Save'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()
WebUI.delay(10)

'Send To Checker'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction Payment/Task_View_Maker/SendtoChecker'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()
WebUI.delay(10)

'Wait for loading Home Page'
WebUI.waitForPageLoad(GlobalVariable.wait_long_time)
'WebUI.delay(GlobalVariable.wait_medium_time)'

//CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('EntryBooking/Page EB_Checker/Page Panel Task_EB/minimize_task'),
//	GlobalVariable.wait_js_long_time)
'Wait for minimize panel task entry booking'

'WebUI.delay(GlobalVariable.wait_short_time)'

