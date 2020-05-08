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

'Business Relationship Since'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id198'), '2017')

'Last Education - Default value = COLLE'

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_COLLEGEJUNIOR HIGH SCHO'), 'UNIVE', 
	true)

'Mother Maiden Name'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainmotherMaiden'), 'MOMMY')

'Number Dependent'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainnumberDependent'), '2')

'Relation With Our Staff'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainj_id212'), 'No')

'Legal Review Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_dateLegalReview'), 
    '25/07/2018', GlobalVariable.wait_js_long_time)

'Reminder Review Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_dateLegalReview_reminder'), 
    '25/06/2018', GlobalVariable.wait_js_long_time)

'Credit Rating From BI - Score Default 0'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_scoreCreditRatingBI'), '0')

'Credit Rating From BI - As Of'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_dateCreditRatingBI'), 
    '25/06/2018', GlobalVariable.wait_js_long_time)

'AML Risk Assessment'
WebUI.selectOptionByValue(findTestObject('CDB/Personal/OtherInformation/select_Please SelectLOWMEDIUMHIGH'), 
    'L', true, FailureHandling.STOP_ON_FAILURE)

'PEP'
if(WebUI.verifyElementNotChecked(findTestObject("CDB/Personal/OtherInformation/input__frmMainj_id256"),
	GlobalVariable.wait_short_time,FailureHandling.OPTIONAL)){
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/OtherInformation/input__frmMainj_id256'), 
    10)
}

'Other Conditions'
WebUI.setText(findTestObject('CDB/Personal/Page_FormCDBPersonal/textarea_Test Other Conditions'), 'Test Other Conditions')

