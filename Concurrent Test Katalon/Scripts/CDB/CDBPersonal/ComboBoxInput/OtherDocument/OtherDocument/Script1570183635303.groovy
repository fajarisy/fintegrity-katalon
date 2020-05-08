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

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_AddressBank StatementGu'), '/CIF/Personal/OtherDocument/list.xhtml', 
    true)

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

'Add Row ke 1'
WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'))

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

'Name'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintxtName'), 'Test')

'Description'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintxtDesc'), 'Test Automatic Upload doc')

//WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/div_popupMask'))
WebUI.sendKeys(findTestObject('CDB/Personal/Page_FormCDBPersonal/div_Upload_sendingKeys'), 'D:\\Nurochim\\Fintegrity Test\\IntegrationScriptTest\\EntryBooking\\DocumentUpload\\doctopdf.pdf')

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/div_Upload'))

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAL_saveExec (4)'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_short_time)

not_run: WebUI.switchToDefaultContent()

'Add Row ke 2'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_2'))

'Delete Row Ke 2'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblOtherDocList0j'))

