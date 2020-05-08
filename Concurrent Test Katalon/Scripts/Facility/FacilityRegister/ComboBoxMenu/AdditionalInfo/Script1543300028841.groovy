import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//WebUI.selectOptionByValue(findTestObject('Object Repository/Facility/FacilityRegister/AdditionalInfo/select_AssetLife InsuranceComm'), 
//    '/Facility/AdditionalInfo/form.xhtml', true)
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/select_AssetLife InsuranceComm'), 
    '/Facility/AdditionalInfo/form.xhtml', false)

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/input_Search_frmMainacctFilter'), 'ahmad')

'Delay'
WebUI.delay(GlobalVariable.wait_long_time)

'Delay'
WebUI.delay(GlobalVariable.wait_long_time)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/select_MR. AHMAD RAMADHANI RAH'), 
    '087681', true)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/select_CORE FAMILY MEMBERS  SP'), 
    'SELFC', true)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/select_HIGHLOWMEDIUM'), 
    'LOW00', true)

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/textarea_TEST KATALON'), 'test katalon')

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/input_Average Net Flow_frmMain'), '10')

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/input_Deposit Outstanding_frmM'), '10')

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/input_Cash Flow Ratio against'), '10')

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/input_Cash Flow from Operating'), '10')

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/input_Cash Flow from Investing'), '1,000')

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/select_INVESTMENTOPERATIONWORK'), 
    'OPRTN', true)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/select_INVESTMENTOPERATIONWORK'), 
    'WORCP', true)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/select_INVESTMENTOPERATIONWORK'), 
    'INVES', true)

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/textarea_TEST DEC ADDINFO'), 'additional description')

WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/AdditionalInfo/input_Back to Home_frmMainbtnA'))

WebUI.acceptAlert()

'Delay'
WebUI.delay(GlobalVariable.wait_js_long_time)

'Delay'
WebUI.delay(GlobalVariable.wait_long_time)

