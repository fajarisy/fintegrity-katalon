import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By as By

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForPageLoad(GlobalVariable.wait_js_long_time)

WebUI.waitForElementPresent(findTestObject('Facility/FacilityTermination/HomeTask/homeTaskFTHeader'), GlobalVariable.wait_medium_time)

WebUI.delay(GlobalVariable.wait_short_time)

if (WebUI.verifyElementNotPresent(findTestObject('Facility/FacilityTermination/HomeTask/tableTaskFacilityTermination'), 
    GlobalVariable.wait_medium_time, FailureHandling.OPTIONAL)) {
    WebUI.waitForElementClickable(findTestObject('Facility/FacilityTermination/HomeTask/btnOpenTask'), GlobalVariable.wait_medium_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityTermination/HomeTask/btnOpenTask'), 
        GlobalVariable.wait_js_long_time)
}

WebUI.waitForElementPresent(findTestObject('Facility/FacilityTermination/HomeTask/tableTaskFacilityTermination'), GlobalVariable.wait_medium_time)

WebDriver driver = DriverFactory.getWebDriver()
WebElement table = driver.findElement(By.xpath('//*[@id="frmMain:TblTermination:tb"]'))
List<WebElement> rows = table.findElements(By.tagName('tr'))

println('No. of rows: ' +rows.size())

boolean isFound = false

for (int i = 0; i < rows.size(); i++){
	List<WebElement> col = rows.get(i).findElements(By.tagName('td'))
	//println(col.get(1).getText())
	if (col.get(0).getText().equalsIgnoreCase(facilityNo)){
		col.get(6).findElement(By.tagName('a')).click()
		isFound = true
		break
	}
}

WebUI.delay(GlobalVariable.wait_long_time)