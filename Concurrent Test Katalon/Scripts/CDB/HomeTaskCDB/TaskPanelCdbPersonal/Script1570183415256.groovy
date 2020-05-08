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

WebUI.waitForPageLoad(GlobalVariable.wait_js_long_time)

WebUI.waitForElementPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/panelHeader_task_customer'), GlobalVariable.wait_js_long_time)

WebUI.delay(GlobalVariable.wait_short_time)

//'Close WARNING no Task'
//if(WebUI.verifyElementPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/modalWarningNoTask'),GlobalVariable.wait_medium_time,FailureHandling.OPTIONAL)){
//	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/modalWarningNoTask'),30)
//	WebUI.delay(GlobalVariable.wait_js_long_time)
//} else if(WebUI.verifyElementPresent(findTestObject('Object Repository/HomeTaskWarnings/CDBPersonalSlik'),GlobalVariable.wait_medium_time,FailureHandling.OPTIONAL)){
//	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/HomeTaskWarnings/CDBPersonalSlik'),30)
//	WebUI.delay(GlobalVariable.wait_js_long_time)
//} else if(WebUI.verifyElementPresent(findTestObject('Object Repository/HomeTaskWarnings/Disbursement'),GlobalVariable.wait_medium_time,FailureHandling.OPTIONAL)){
//	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/HomeTaskWarnings/Disbursement'),30)
//	WebUI.delay(GlobalVariable.wait_js_long_time)
//} else if(WebUI.verifyElementPresent(findTestObject('Object Repository/HomeTaskWarnings/CDBCompany'), GlobalVariable.wait_long_time,FailureHandling.OPTIONAL)){
//	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/HomeTaskWarnings/CDBCompany'), GlobalVariable.wait_js_long_time)
//}

'Cek Jika table task personal sudah terbuka atau belum'
if (WebUI.verifyElementNotPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/task_table_customer'), GlobalVariable.wait_medium_time, 
    FailureHandling.OPTIONAL)) {
    'Prevent Panel Task jika belum terbuka'
    WebUI.waitForElementClickable(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/open_task'), GlobalVariable.wait_medium_time, 
        FailureHandling.STOP_ON_FAILURE)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/open_task'), 
        GlobalVariable.wait_js_long_time)

    'Antisipasi bila muncul warning no task berwarna merah'
    WebUI.waitForElementPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/modalWarningNoTask'), 
        GlobalVariable.wait_medium_time, FailureHandling.OPTIONAL)

    if (WebUI.verifyElementPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/modalWarningNoTask'), 
        10, FailureHandling.STOP_ON_FAILURE)) {
        CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/modalWarningNoTask'), 
            GlobalVariable.wait_js_long_time)

        WebUI.delay(GlobalVariable.wait_short_time //println 'Klik Open Task is true'
            ) //println 'Klik Open Task is false'
    } 
}

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
}

// wait table for visible
'Interate Table for Select entry booking by Customer Name'
WebUI.waitForElementPresent(findTestObject('CDB/Personal/Page_HomeTask_CDBPersonal/task_table_customer'), GlobalVariable.wait_long_time, 
    FailureHandling.STOP_ON_FAILURE)

// Select Last Of Row in Table Amandment
WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:dtCifPersonal:tb"]'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

//println(CustomerName)
// Iterate row table

boolean CustomerFounded = false;

for (int i = 0; i < Rows.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

    'Verifying the expected text in the each cell'
    if (Cols.get(2).getText().equalsIgnoreCase(CustomerName)) {
        'To locate anchor in the expected value matched row to perform action'
        Cols.get(5).findElement(By.tagName('a')).click()
		
		CustomerFounded = true;
		
        break
    } 
}

if(CustomerFounded == false) {
	
	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/HomeTask/Back1Page'),
			GlobalVariable.wait_long_time)
		
	WebUI.delay(GlobalVariable.wait_long_time)
		
	WebElement Table1 = driver.findElement(By.xpath('//*[@id="frmMain:dtCifPersonal:tb"]'))
		 
	//'To locate rows of table it will Capture all the rows available in the table '
	List<WebElement> Rows1 = Table1.findElements(By.tagName('tr'))
		
	for (int j = 0; j < Rows1.size(); j++) {
		'To locate columns(cells) of that specific row'
		List<WebElement> Cols1 = Rows1.get(j).findElements(By.tagName('td'))
		
		'Verifying the expected text in the each cell'
		if (Cols1.get(2).getText().matches('.*'+CustomerName+'.*')) {
			'To locate anchor in the expected value matched row to perform action'
			Cols1.get(5).findElement(By.tagName('a')).click()
		
			break
		}
	}
}


'Wait for loading Page'
WebUI.delay(GlobalVariable.wait_long_time)

