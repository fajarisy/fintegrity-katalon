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

WebUI.waitForElementClickable(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainchkboxType'), GlobalVariable.wait_js_long_time)

'Type - Customer'
if(WebUI.verifyElementNotChecked(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainchkboxType'), 
	GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)){
	WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainchkboxType'))
}
//'Type - BPKB Name'
//ebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainchkboxType_1'))

'Suffix - Default Value'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_MR.MRS.MS.'), 'MR.', true)

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_MR.MRS.MS.'), 'MRS.', true)

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_MR.MRS.MS.'), 'MS.', true)

'Gender Male - Default Value'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_MaleFemale'), 'M', true)

'Gender Female'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_MaleFemale'), 'F', true)

'Name'
WebUI.setText(findTestObject('CDB/Personal/BasicInformation/BasicInfo_Name'), CustomerName)

'Place'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintxtPOB'), 'GARUT')

'Date of Birth'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/textPlaceOfBirth'), 
    '25/06/2018', GlobalVariable.wait_js_long_time)

'Marital Status'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_-DIVORCEDMARRIEDSINGLEW'), 'SINGL',true)

'Nationality - Default Value Indonesia'
if (false) {
    WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_ANDORRABELGIUMCENTRAL A'), 'id', 
        true // Jika nationality bukan Indonesia, maka ada kondisi untuk mengisi KITAS
        )
}
