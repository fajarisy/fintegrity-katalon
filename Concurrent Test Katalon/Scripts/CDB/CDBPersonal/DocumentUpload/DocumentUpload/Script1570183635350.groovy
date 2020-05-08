import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//Document Upload - FOTOCOPY AKTE NIKAH/CERAI/KEMATIAN
'Is Check'
WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblDocChecking0j_'))

'Checking Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaintblDocChecking0idch'), 
    '06/10/2018', GlobalVariable.wait_js_long_time)

'Click Upload'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/td_5_1'), 
    GlobalVariable.wait_js_long_time)

WebUI.sendKeys(findTestObject('CDB/Personal/Page_FormCDBPersonal/doc_upload_akteNikah'), 'D:\\Nurochim\\Fintegrity Test\\IntegrationScriptTest\\EntryBooking\\DocumentUpload\\doctopdf.pdf')

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/div_Upload (1)'))

WebUI.delay(GlobalVariable.wait_short_time)

