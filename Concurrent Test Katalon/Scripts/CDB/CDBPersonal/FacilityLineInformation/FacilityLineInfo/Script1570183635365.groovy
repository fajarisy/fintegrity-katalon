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

'Headquarter Approval No'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id325'), '01')

'Headquarter Approval Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_dateHeadquarterApproval'), 'Jul 25, 2018', GlobalVariable.wait_js_long_time)

'Currency - Default Value IDR'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_IDRJPYUSD'), 'IDR', true)

not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_IDRJPYUSD'), 'JPY', true)

not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_IDRJPYUSD'), 'USD', true)

'Facility Line Amount'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintxtLimitAmount'), '90,000,0000')


