import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
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

//*
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.0.100:8080/Fintegrity')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_UserName_frmMainuserName', [('variable') : 'DWI']), 
    'DWI')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_Password_frmMainpassword', [('variable') : 'Mbf137??']), 
    'Mbf137??')

WebUI.click(findTestObject('LoginLogout/Page_ Login/input_frmMainbtnLogin'))
//*/

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('Page_ MBF IT Core System - Login 1/input_frmMainbtnLogin'), 
    30)

// Select Menu Payment/Cash Transfer
WebUI.waitForElementClickable(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Login 1./input_frmMainuserName'), 
    30)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - DWI CITR/img'), 
    30)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - DWI CITR/span_Payment'), 
    30)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - DWI CITR/span_Cash  Transfer'), 
    30)

// Load List Payment Cash Transfer.html
WebUI.waitForElementClickable(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Cash  Tr/img'), 30)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Cash  Tr/img'), 
    30)

// Load Form Input Cash Transfer
WebUI.waitForPageLoad(10)

// Click CDB Info, Type = Personal
// By default Type = Company
//WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainj_id82'))
CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainj_id82'), 
    30)

WebUI.setText(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainacctFilter_defLes'), CustomerId)

WebUI.waitForElementVisible(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/select_MR. ANDRI TRI WIBOWO SH - OPTION'), 
    30)

WebUI.selectOptionByValue(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/select_MR. ANDRI TRI WIBOWO SH'), 
    CustomerId, true)

WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/img_frmMainpaymentDatePopupBut'))

WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/td_25'))

WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMaincbDiffPost'))

WebUI.setText(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainamount'), amountPayment)

//WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnAL_saveExec'))
CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnAL_saveExec'), 
    30)

WebUI.acceptAlert()

//WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/img'))
CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/img'), 
    30)

WebUI.selectOptionByValue(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/select_093017CV18002306'), 
    FaciliyNo, true)

WebUI.setText(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMaindtListPayment_def'), amountPayment)

WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnAL_saveExec (1)'))

WebUI.waitForAlert(5)

WebUI.acceptAlert()

WebUI.waitForElementNotClickable(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnAL_saveExec (1)'), 
    10)

// Switch to Default Window
WebUI.switchToDefaultContent()

//CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnAL_saveExec'), 
//    30)
//
//WebUI.acceptAlert()
//WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec'))
// Send to Next
WebUI.waitForElementClickable(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec'), 
    30)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec'), 
    30)

WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.waitForElementNotPresent(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec'), 
    10)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('Page_ MBF IT Core System - DEBBY -/a_Logout'), 
    30)

WebUI.setText(findTestObject('AmandmentFacility/Page_ MBF IT Core System - Login 1./input_frmMainuserName'), 'DWI')

WebUI.setText(findTestObject('AmandmentFacility/Page_ MBF IT Core System - Login 1./input_frmMainpassword'), 'Mbf137??')

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('Page_ MBF IT Core System - Login 1/input_frmMainbtnLogin'), 
    30)

// Click Panel Task Cash / Transfer Payment
WebUI.waitForElementVisible(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - YUNILIA/div_'), 30)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - YUNILIA/div_'), 
    30)

// wait table for visible
WebUI.waitForElementVisible(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - YUNILIA/tableTaskPaymentCashTransfer'), 
    30)

// Select Last Of Row in Table Amandment
WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtPayGenericR:tb"]'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

// Iterate row table
for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

    //for (int j = 0; j < Cols.size(); j++) {
    'Verifying the expected text in the each cell'
    if (Cols.get(1).getText().equalsIgnoreCase(CustomerName)) {
        'To locate anchor in the expected value matched row to perform action'
        Cols.get(7).findElement(By.tagName('a')).click()

        break
    }
}

// approve payment
WebUI.waitForElementClickable(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec_1'), 
    30)

CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec_1'), 
    30)

//WebUI.click(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec_1'))
WebUI.waitForAlert(10)

WebUI.acceptAlert()

WebUI.waitForElementNotPresent(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - Payment/input_frmMainbtnA_wfNextExec_1'), 
    10)

// Wait Home page Loading
// wait table for visible
WebUI.waitForElementVisible(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - YUNILIA/tableTaskPaymentCashTransfer'), 
    30)

// Click Panel Task Payment Cash Transfer
CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('PaymentCashTransfer/Page_ MBF IT Core System - YUNILIA/div__1'), 
    30)

WebUI.delay(7)

//WebUI.waitForPageLoad(30)
CustomKeywords.'customKeyword.CustomKeywordJS.clickUsingJS'(findTestObject('Page_ MBF IT Core System - DEBBY -/a_Logout'), 
    30)

WebUI.delay(5)

WebUI.closeBrowser()

not_run: println('Element Not Present')

