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

WebUI.waitForElementPresent(findTestObject('Facility/FacilityRegister/HomeTask/Facility_Task_Pnl_Header'), GlobalVariable.wait_js_long_time)

if (WebUI.verifyElementNotPresent(findTestObject('Facility/FacilityRegister/Table_Body_Home_Task/Table_Body'), GlobalVariable.wait_short_time, 
    FailureHandling.OPTIONAL)) {
    'Prevent Panel Task jika belum terbuka'
    WebUI.waitForElementClickable(findTestObject('Facility/FacilityRegister/HomeTask/Facility_Switch_off'), GlobalVariable.wait_js_long_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityRegister/HomeTask/Facility_Switch_off'), 
        GlobalVariable.wait_js_long_time)
	
	WebUI.waitForElementPresent(findTestObject('Facility/FacilityRegister/Table_Body_Home_Task/Table_Body'), 60, FailureHandling.STOP_ON_FAILURE)
} 

'Untuk mencari Last Page'
if (WebUI.verifyElementPresent(findTestObject('Facility/FacilityRegister/HomeTask/Last_Page'), GlobalVariable.wait_js_long_time, 
    FailureHandling.OPTIONAL)) {
    'Last Page of Table'
    if (WebUI.verifyElementClickable(findTestObject('Facility/FacilityRegister/HomeTask/Last_Page'), FailureHandling.STOP_ON_FAILURE)) {
        WebUI.scrollToElement(findTestObject('Facility/FacilityRegister/HomeTask/Last_Page'), GlobalVariable.wait_short_time)
		CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityRegister/HomeTask/Last_Page'), 
            GlobalVariable.wait_js_long_time)
        println('Klik Last Page is true')
		WebUI.delay(15)
		}
}

'Interate Table for Select facility by Customer Name'
WebUI.waitForElementVisible(findTestObject('Facility/FacilityRegister/Table_Body_Home_Task/Table_Body'), 30)

// Select Last Of Row in Table Facility
WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtFacility:tb"]'))

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

println(CustomerName)

// Iterate row table
for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))
	println(Cols.get(2).getText())
    'Verifying the expected text in the each cell'
    if (Cols.get(2).getText().matches('.*' + CustomerName + '.*')) {
        'To locate anchor in the expected value matched row to perform action'
        Cols.get(9).findElement(By.tagName('a')).click()

        break
    }
}

'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_long_time)

