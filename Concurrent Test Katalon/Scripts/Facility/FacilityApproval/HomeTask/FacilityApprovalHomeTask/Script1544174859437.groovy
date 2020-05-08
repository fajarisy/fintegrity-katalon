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

'Wait For Facility Approval Panel Task To Appear'
WebUI.waitForElementPresent(findTestObject('Facility/FacilityApproval/HomeTask/FacilityApprovalTaskPanel'), GlobalVariable.wait_medium_time)

'Prevent Task Panel If Not Opened'
if (WebUI.verifyElementNotPresent(findTestObject('Facility/FacilityApproval/HomeTaskTableBody/FATableBody'), GlobalVariable.wait_short_time, 
    FailureHandling.OPTIONAL)) {
    WebUI.waitForElementClickable(findTestObject('Facility/FacilityApproval/HomeTask/TaskPanelSwithOff'), GlobalVariable.wait_js_long_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityApproval/HomeTask/TaskPanelSwithOff'), 
        GlobalVariable.wait_js_long_time)
	
	WebUI.delay(GlobalVariable.wait_long_time)
}

'Interate Table for Select facility by Customer Name'
WebUI.waitForElementVisible(findTestObject('Facility/FacilityApproval/HomeTaskTableBody/FATableBody'), 30)

'Select Last Of Row in Table Facility'
WebDriver driver = DriverFactory.getWebDriver()

'To locate table task'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtFacilityApproval:tb"]'))

'Locate Row'
List<WebElement> Rows = Table.findElements(By.tagName('tr'))

'Print Row Size'
println('No. of rows: ' + Rows.size())

'Print CustNo'
println(CustomerName)

// Iterate row table
'Search For Column'
for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

    'Verifying the expected text in the each cell'
    if (Cols.get(2).getText().matches('.*'+CustomerName+'.*')) {
        'To locate Edit/View Button'
        Cols.get(11).findElement(By.tagName('a')).click()

        break
    }
}

'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_long_time)

