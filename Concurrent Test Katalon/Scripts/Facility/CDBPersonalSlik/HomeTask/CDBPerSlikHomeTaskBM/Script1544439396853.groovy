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

WebUI.waitForElementPresent(findTestObject('Facility/CDBPerSlik/HomeTask/CDBPerSlikTaskPanel'), GlobalVariable.wait_js_long_time)

if (WebUI.verifyElementNotPresent(findTestObject('Facility/CDBPerSlik/HomeTaskTableBody/CDBPerSlikTableBody'), GlobalVariable.wait_js_long_time, 
    FailureHandling.OPTIONAL)) {
    'Prevent Panel Task jika belum terbuka'
    WebUI.waitForElementClickable(findTestObject('Facility/CDBPerSlik/HomeTask/TaskPanelSwithOff'), GlobalVariable.wait_js_long_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/CDBPerSlik/HomeTask/TaskPanelSwithOff'), 
        GlobalVariable.wait_js_long_time)
	
	WebUI.delay(GlobalVariable.wait_long_time)
}

'Interate Table for Select facility by Customer Name'
WebUI.waitForElementVisible(findTestObject('Facility/CDBPerSlik/HomeTaskTableBody/CDBPerSlikTableBody'), 30)

// Select Last Of Row in Table Facility
WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtCdbPersonalSlik:tb"]'))

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

println(CustomerName)

// Iterate row table
for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

    'Verifying the expected text in the each cell'
    if (Cols.get(1).getText().equalsIgnoreCase(CustomerName)) {
        'To locate anchor in the expected value matched row to perform action'
        Cols.get(4).findElement(By.tagName('input')).click()

        break
    }
}

'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_long_time)

