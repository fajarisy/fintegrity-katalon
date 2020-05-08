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

'Add PIC'
WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAddPIC'))

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC0txtPICName'), 'Test Katalon')

not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_MR.MRS.MS. (1)'), 'MRS.', 
    true)

not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_MR.MRS.MS. (1)'), 'MR.', 
    true)

not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_BRANCH MANAGERCOMMISION'), 
    'OWNER', true)

not_run: WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_BRANCH MANAGERCOMMISION'), 
    'MGR00', true)

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC0j_id119'), 'Jakarta Selatan')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC0j_id123'), '+62098203123')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC0j_id127'), '+62982739123')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC0j_id131'), '+6290820398123')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC0j_id135'), '0921')

WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC0j_id139'), 'manager@gmail.com')

'Add new PIC Row'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainbtnAddPIC'))

not_run: WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC1txtPICName'), 'Test katalon')

'Delete Row In PIC Table'
not_run: WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMaintblPIC1j_id143'))

