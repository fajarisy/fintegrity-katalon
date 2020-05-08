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

WebUI.scrollToElement(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaintblDocChecking0idch'), GlobalVariable.wait_short_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'), 
    GlobalVariable.wait_js_long_time)

'Wait For Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/textarea_frmMaintxtAddress'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_AUS - AustraliaBEL - Be'), 'IDN', 
    false)

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.selectOptionByIndex(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_ACEH BARATACEH BARAT DA'), 129)

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByIndex(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CEMPAKA PUTIHGAMBIRJOHA'), 2)

WebUI.delay(GlobalVariable.wait_short_time)

//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CIDENGDURI PULOGAMBIRKE'), '3171011002', 
//    true)
WebUI.selectOptionByIndex(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CIDENGDURI PULOGAMBIRKE'), 2)

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainrt'), '009')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainrw'), '099')

'Call Add TestCase Telephone'
WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Address/PersonalInCharge'), [:], FailureHandling.STOP_ON_FAILURE)

'Call Add TestCase Telephone'
WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Address/Telephone'), [:], FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAL_saveExec (1)'),
//	GlobalVariable.wait_js_long_time)
'Save Address'
WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAL_saveExec (1)'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_short_time)

