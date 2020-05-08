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

WebUI.waitForElementPresent(findTestObject('Facility/FacilityRegister/FinancingForm/AddAsset_ObjectLease'), GlobalVariable.wait_long_time)
WebUI.waitForElementClickable(findTestObject('Facility/FacilityRegister/FinancingForm/AddAsset_ObjectLease'), GlobalVariable.wait_long_time)
'Click Add Asset'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Facility/FacilityRegister/FinancingForm/AddAsset_ObjectLease'), 
    GlobalVariable.wait_js_long_time)

not_run: WebUI.click(findTestObject('Facility/FacilityRegister/FinancingForm/AddAsset_ObjectLease'))

//WebUI.waitForElementClickable(findTestObject('CDB/Personal/Page_FormCDBPersonal/input_frmMainchkboxType'), GlobalVariable.wait_js_long_time)
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/select_AssetSubType'), '2', false)

WebUI.selectOptionByLabel(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/select_AssetManufacturer'), 'HONDA', 
    false)

WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/select_AssetUnitModel'), 'BRIO RS CVT ', 
    false)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/select_AssetManufactureYear'), '2016', 
    false)

//WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/Asset/Page_ MBF IT Core System - Facility/select_AssetManufactureYear'), 
//    '2018', true)
WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/textarea_AssetDescription'), 'Test Katalon New')

'Color'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/select_OtherInfoColor'), 'BLACK', 
    false)

'Note'
WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/textarea_OtherInfoNote'), 'Test Katalon New')

'Asset Price'
WebUI.setText(findTestObject('Object Repository/Facility/FacilityRegister/ComboBoxMenu/Asset_input_price/input_Price_MaininputPrice'), 
    '200000000')

'Address'
WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/textarea_OtherInfoAddressBPKB'), 'JL. ANGGREK NO. 10')

'City'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/select_OtherInfoCity'), '3204000000', 
    false)

'Condition'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/select_OtherInfoCondition'), 'NEW00', 
    false)

'Search Supplier'
WebUI.setText(findTestObject('Facility/FacilityRegister/FinancingForm/input_AssetFilter_supplier'), 'HONDA Jakarta Center')

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

'Select search item'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_SupplierAsset'), '240', false)

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

'Save Button'
WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Asset/input_ButtonSave'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_long_time)

'Click Back Button'
WebUI.waitForElementClickable(findTestObject('Object Repository/Facility/FloatingButton/BackButton'), 
	GlobalVariable.wait_short_time, FailureHandling.OPTIONAL)
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Facility/FloatingButton/BackButton'), 
    GlobalVariable.wait_js_long_time)

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

