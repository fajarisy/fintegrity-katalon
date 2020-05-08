import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Open Disburse'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject("Object Repository/DisbursementSheetCompare/SearchCDB/OpenCDBList"), 15)

'Click Search by Contract No'
WebUI.selectOptionByValue(findTestObject("Object Repository/DisbursementSheetCompare/SearchCDB/DropdownCDBSearch"), "id:s", false)

'Write Facility Contract on Search Box'
WebUI.setText(findTestObject("Object Repository/DisbursementSheetCompare/SearchCDB/CDBSearchBox"), IdFacility.toString().substring(0, 6))

'Click Search'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject("Object Repository/DisbursementSheetCompare/SearchCDB/SaerchButton"), 15)


WebDriver driver = DriverFactory.getWebDriver()

//'To locate table List CDB'
WebElement TableCDB = driver.findElement(By.xpath('//*[@id="frmMain:TblRegisterList:tb"]'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> Rows = TableCDB.findElements(By.tagName('tr'))

println('No. of rows: ' + Rows.size())

// Iterate row table
for (int i = 0; i < Rows.size(); i++) {
	'To locate columns(cells) of that specific row'
	List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))
	
	CDBNo = IdFacility.toString().substring(0, 6)
	'Verifying the expected text in the each cell'
	if (Cols.get(0).getText().contains(CDBNo)) {
		'To locate anchor in the expected value matched row to perform action'
		Cols.get(8).findElement(By.tagName('input')).click()

		break
	}
}