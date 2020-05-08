import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

/*
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.0.100:8080/Fintegrity')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_UserName_frmMainuserName', [('variable') : 'YUNILIA']), 
    'YUNILIA')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_Password_frmMainpassword', [('variable') : 'Mbf137??']), 
    'Mbf137??')

WebUI.click(findTestObject('LoginLogout/Page_ Login/input_frmMainbtnLogin'))

//*/
WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/show_task_table'), 
    10, FailureHandling.OPTIONAL)) {
    'TUTUP TASK'
    WebUI.waitForElementClickable(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/minimize_task'), 
        10, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/minimize_task'), 
        GlobalVariable.wait_js_long_time)

    WebUI.delay(10)

    'BUKA TASK'
    WebUI.waitForElementClickable(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/open_task'), 
        10, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/open_task'), 
        GlobalVariable.wait_js_long_time)

    WebUI.delay(10)
} else {
    'BUKA TASK'
    WebUI.waitForElementClickable(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/open_task'), 
        10, FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/open_task'), 
        GlobalVariable.wait_js_long_time)

    WebUI.delay(10)
}

WebUI.delay(10)

'Expected value from Table'
WebDriver driver = DriverFactory.getWebDriver()

'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtPayGenericR:tb"]'))

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
        if (Cols.get(1).getText().equalsIgnoreCase(LesseeName)) {
            'To locate anchor in the expected value matched row to perform action'
            Cols.get(7).findElement(By.tagName('a')).click()

            break
        //}
    }
}

'Wait for loading Page'
WebUI.waitForPageLoad(GlobalVariable.wait_long_time)


CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CashTransfer/CashTransfer-Checker/btn_confirm'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()


'Wait for loading Home Page'
WebUI.waitForPageLoad(GlobalVariable.wait_long_time)
'WebUI.delay(GlobalVariable.wait_medium_time)'

'Wait for minimize panel task entry booking'

'WebUI.delay(GlobalVariable.wait_short_time)'

