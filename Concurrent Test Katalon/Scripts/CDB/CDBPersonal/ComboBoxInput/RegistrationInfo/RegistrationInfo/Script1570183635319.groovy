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

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_AddressBank StatementGu'), '/CIF/Personal/RegistrationInfo/list.xhtml', 
    true)

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'))

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

'Document No'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintxtDocNo'), '9083102312')

'1 Doc Issued Date Method 1'

//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaincldDocIssuedDatePop'))
//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/td_3 (1)'))
'Doc Issued Date Method 2 '
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('CDB/Personal/Page_FormCDBPersonal/iframe_popupFrame_5'), 
    findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaincldDocIssuedDatePop'), 'Nov 15, 2018', GlobalVariable.wait_js_long_time)

//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaincldDocExpiryDatePop'))
//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/td_4 (1)'))
'2 Doc Expire Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('CDB/Personal/Page_FormCDBPersonal/iframe_popupFrame_5'), 
    findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaincldDocExpiryDatePop'), 'Nov 18, 2018', GlobalVariable.wait_js_long_time)

//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaincldReminderPopupBut'))
//
//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/td_9 (1)'))
'3 Reminder Doc Reminder Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('CDB/Personal/Page_FormCDBPersonal/iframe_popupFrame_5'), 
    findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaincldReminderPopupBut'), 'Nov 28, 2018', GlobalVariable.wait_js_long_time)

'Save Registration Info'
WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAL_saveExec (6)'))

WebUI.acceptAlert()

'Edit Info'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_1'))

'Close Popup Info'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/span_Close'))

'Remove Info from List'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblRegInfo0j_id54'))

