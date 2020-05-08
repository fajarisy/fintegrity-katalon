import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor

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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


'IdType DRVLC (Driver License), IDCRD(Id Card) , PASSP(Passport)'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_IDType'),
	'IDCRD', true)

'Id Card No'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintxtIdNo'), IdCard)

'CheckBox Lifetime Bila belum di cek'
if(WebUI.verifyElementNotChecked(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id148'), 
	GlobalVariable.wait_short_time,FailureHandling.OPTIONAL	)){
	WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id148'))
}

def driver = DriverFactory.getWebDriver()

'Checkbox Tidak Lifetime'
if(isLifetime == false){
	'ID Expired Date'
	CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_idExpiredDate'), 'Jul 25, 2018', GlobalVariable.wait_js_long_time)
	
	'ID Reminder Expired Date'
	CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_idExpiredDate_reminder'), '17/07/2018', GlobalVariable.wait_js_long_time)
}

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainnpwpNo'), '123456789012343')

if(false){
	// Jika  Nationality bukan Indonesia
	'Id KIMS/KITAS'
	WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_idKimsKitas'), '123456789012343')
	
	'KIMS/KITAS Expired Date'
	CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_idKimsKitas_ExpiredDate'), 'Jul 25, 2018', GlobalVariable.wait_js_long_time)
	
	'Reminder KIMS/KITAS Exp'
	CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_idKimsKitas_ReminderExpiredDate'), 'Jul 23, 2018', GlobalVariable.wait_js_long_time)
}