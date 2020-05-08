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

// for test only
'Marital Status MARRIED'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_-DIVORCEDMARRIEDSINGLEW'), 'MARRD', 
    true)

'Wait For Loading Panel Spouse Information'
WebUI.delay(GlobalVariable.wait_short_time)

'Search Spouse'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainsearchSpouse_pick'), 'DIAH AMIN PUTRI SUDONO')

not_run: WebUI.delay(GlobalVariable.wait_short_time)

not_run: WebUI.selectOptionByLabel(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_DRS H. AMINUDINTHABRANY'), 
    'DIAH AMIN PUTRI SUDONO', true)

'Marriage Certificate No'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id291'), 'MarriageCert')

'Family Certificate No'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id294'), 'FamilityCert')

'Family Certificate Issued Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_dateFamilyCertificate'), 
    'Jul 25, 2018', GlobalVariable.wait_js_long_time)

'Family Certificate Expired Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_dateFamilyCertificate_Expired'), 
    'Jul 25, 2018', GlobalVariable.wait_js_long_time)

