import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/TaskPanelUpInfo'), GlobalVariable.wait_js_long_time)

WebUI.delay(GlobalVariable.wait_short_time)

'Close WARNING no Task'
if (WebUI.verifyElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/WarningNoDataUpInfo'), 
    GlobalVariable.wait_medium_time, FailureHandling.OPTIONAL)) {
    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/WarningNoDataUpInfo'), 
        30)
}

'Cek Jika table task personal sudah terbuka atau belum'
if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/task_table_Upinfo'), GlobalVariable.wait_medium_time, 
    FailureHandling.OPTIONAL)) {
    'Prevent Panel Task jika belum terbuka'
    WebUI.waitForElementClickable(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/OpenTask'), GlobalVariable.wait_medium_time, 
        FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/OpenTask'), 
        GlobalVariable.wait_js_long_time)

    'Antisipasi bila muncul warning no task berwarna merah'
    WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/WarningNoDataUpInfo'), 
        GlobalVariable.wait_medium_time, FailureHandling.OPTIONAL)

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/WarningNoDataUpInfo'), 
        10, FailureHandling.STOP_ON_FAILURE)) {
        CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/WarningNoDataUpInfo'), 
            GlobalVariable.wait_js_long_time)

        WebUI.delay(GlobalVariable.wait_short_time 
            ) 
    } 
}
/* BELUM BISA DI PAKAI KARENA HANYA BARU ADA SATU PAGE PADA HOME TASK UPDATE ADDITIONAL INFO
'Untuk mencari Last Page'
WebUI.waitForElementPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/last_page_of_table'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

if (WebUI.verifyElementPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/last_page_of_table'), GlobalVariable.wait_short_time, 
    FailureHandling.OPTIONAL)) {
    'Last Page of Table'
    if (WebUI.verifyElementClickable(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/last_page_of_table'), FailureHandling.OPTIONAL)) {
        CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/last_page_of_table'), 
            GlobalVariable.wait_js_long_time)

        WebUI.delay(GlobalVariable.wait_long_time)

        println('Klik Last Page is true')
    }
}*/

// wait table for visible
'Interate Table for Select entry booking by Customer Name'
WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpinfoHomeTask/task_table_Upinfo'), GlobalVariable.wait_long_time, 
    FailureHandling.STOP_ON_FAILURE)

// Select Last Of Row in Table Amandment
WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtFcltUpdateAddInfo:tb"]'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

//println(CustomerName)
// Iterate row table
for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))
	println('No. of Column: ' + Cols.size())
    
	'Verifying the expected text in the each cell'
    if (Cols.get(1).getText().matches('.*'+CustomerName+'.*')) {
		println('Nama : ' + Cols.get(1).getText())
        'To locate anchor in the expected value matched row to perform action'
        Cols.get(2).findElement(By.tagName('input')).click()

        break
    }
}

//WebUI.click(findTestObject('EntryBooking/Page EB_Checker/Page Panel Task_EB/img_go_to_view'))
'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_long_time)

