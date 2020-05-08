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

'Add Row Phone Number'
WebUI.click(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/AddPhone'))

'Add Mobile Phone Number'
WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/PhoneType'), 'MOBPH', false)

WebUI.sendKeys(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/PhoneNo'), '0982039812')

not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAddPhone_phone'))

'Add Faximile Number'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_FAXMOBILE PHONEPHONETEL_1'), 
    'FAX00', true)

not_run: WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPhone_phone1tx'), '8729387123')

not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAddPhone_phone'))

'Add Phone Number'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_FAXMOBILE PHONEPHONETEL_2'), 
    'PHONE', true)

not_run: WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPhone_phone2tx'), '7693812312')

not_run: WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPhone_phone2tx_1'), '023')

not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAddPhone_phone'))

'Add Telegram Number'
not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_FAXMOBILE PHONEPHONETEL_3'), 
    'TELEX', true)

not_run: WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPhone_phone3tx'), '98723123')

'remove row in phone table'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPhone_phone3bt'))

