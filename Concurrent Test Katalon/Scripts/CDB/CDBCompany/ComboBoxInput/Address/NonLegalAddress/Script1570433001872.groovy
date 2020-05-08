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

WebUI.switchToDefaultContent()

WebUI.scrollToElement(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaintblDocChecking0idch'), GlobalVariable.wait_short_time)

//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_AddressBank StatementGu'),
//	'/CIF/Personal/Address/list.xhtml', true)
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'), 
    GlobalVariable.wait_js_long_time)

'Wait For Loading Page'
WebUI.waitForElementPresent(findTestObject('CDB/Personal/Page_FormCDBPersonal/textarea_frmMaintxtAddress'), GlobalVariable.wait_short_time)

'Office Address'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_DOMICILE ADDRESSMAILING'), 
    'OFADD', true)

'Mail Address'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_DOMICILE ADDRESSMAILING'), 
    'MAILG', true)

'Other Address'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_DOMICILE ADDRESSMAILING'), 
    'OTHER', true)

'Domicili Address - Default Value'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_DOMICILE ADDRESSMAILING'), 
    'DOADD', true)

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/textarea_frmMaintxtAddress'), 'Jakarta')

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_AUS - AustraliaBEL - Be'), 'IDN', 
    true)

WebUI.delay(GlobalVariable.wait_long_time)

WebUI.selectOptionByIndex(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_ACEH BARATACEH BARAT DA'), 129)

WebUI.delay(GlobalVariable.wait_short_time)
//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CEMPAKA PUTIHGAMBIRJOHA'), '3171010000', 
//    true)
WebUI.selectOptionByIndex(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CEMPAKA PUTIHGAMBIRJOHA'), 2)

WebUI.delay(GlobalVariable.wait_short_time)
//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CIDENGDURI PULOGAMBIRKE'), '3171011002', 
//    true)

WebUI.selectOptionByIndex(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CIDENGDURI PULOGAMBIRKE'), 2)

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainrt'), '029')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainrw'), '01')

WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAddPhone_phone'))

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_FAXMOBILE PHONEPHONETEL'), 'PHONE', 
    true)

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPhone_phone0tx'), '9873123')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPhone_phone0tx_1'), '09')

'Save Address'
WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAL_saveExec (1)'))

WebUI.waitForAlert(GlobalVariable.wait_short_time)

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_short_time)

// Menambahkan Office Address
//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'))
//
//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_DOMICILE ADDRESSMAILING'),
//	'OFADD', true)
//
//WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/textarea_frmMaintxtAddress'), 'Test Office For Delete')
//
//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_AUS - AustraliaBEL - Be'),
//	'IDN', true)
//
//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_ACEH BARATACEH BARAT DA'),
//	'3174000000', true)
//
//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CILANDAKJAGAKARSAKEBAYO'),
//	'3174090000', true)
//
//WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_CIGANJURCIPEDAKJAGAKARS'),
//	'3174091006', true)
//
//WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainrt'), '93')
//
//WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainrw'), '7')
//
//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAL_saveExec (1)'))
'Klik Button Remove Addres from Table Address'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblAddress2j_id40'))

