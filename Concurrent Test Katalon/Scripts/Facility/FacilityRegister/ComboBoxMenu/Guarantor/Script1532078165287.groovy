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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Choose Guarantor Dropdown'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/Guarantor/Page_ MBF IT Core System - Facility/select_Guarantor'), 
    '/Facility/Guarantor/list.xhtml', true)

'Add Guarantor'
WebUI.click(findTestObject('Facility/FacilityRegister/Guarantor/Page_ MBF IT Core System - Facility/img_AddGuarantor'))

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

'Search'
WebUI.setText(findTestObject('Facility/FacilityRegister/Guarantor/Page_ MBF IT Core System - Facility/input_SearchCDBInfo'), 
    'AHM')

WebUI.delay(GlobalVariable.wait_medium_time)

'Select CDB'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/Guarantor/Page_ MBF IT Core System - Facility/select_CDBInfo'), 
    '045788', true)

'Relation'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/Guarantor/Page_ MBF IT Core System - Facility/select_RelationWthLessee'), 
    'UNCLE', true)

//'Relation (Not Working)'
//CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('FacilityRegister/Guarantor/Page_ MBF IT Core System - Facility/iframe_popupFrame'),
//	findTestObject('FacilityRegister/Guarantor/Page_ MBF IT Core System - Facility/select_RelationWthLessee'), 'UNCLE', GlobalVariable.wait_js_long_time)
WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Guarantor/Page_ MBF IT Core System - Facility/input_SaveGuarantor'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.click(findTestObject('Facility/FacilityRegister/FinancingForm/input_frmMainbtnAL_saveExec'))

WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Guarantor/input_Back to Home_frmMainbtnA'))

WebUI.acceptAlert()

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

