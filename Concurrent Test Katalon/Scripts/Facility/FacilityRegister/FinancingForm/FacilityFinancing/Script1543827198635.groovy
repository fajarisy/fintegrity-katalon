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

WebUI.waitForElementPresent(findTestObject('Facility/FacilityRegister/FinancingForm/select_MarketingTeam'), GlobalVariable.wait_js_long_time)

//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/TaskPanelOpen'))
//
//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/TaskPanelClose'))
//
//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/TaskPanelFacilityHeader'))
//
//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/TableTaskFacilityColumnHeader'))
//
//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/TableTaskFacilityFirstRow'))
//
//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/TableTaskFacility_LastPage'))
//
//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/TableTaskFacility_PreviousPage'))
//
//not_run: WebUI.click(findTestObject('Facility/FacilityRegister/Page_ MBF IT Core System - DEBBY -/FacilityRegister_OpenForm'))
'Marketing Team'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_MarketingTeam'), 'VHCL1', false)

'Package'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_Package'), '0', false)

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_medium_time)

'Currency'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_Currency'), 'IDR', false)

'OTR'
WebUI.setText(findTestObject('Facility/FacilityRegister/FinancingForm/input_OTR_Price'), '200,000,000')

'DP'
WebUI.setText(findTestObject('Facility/FacilityRegister/FinancingForm/input_frmDownPayment'), '50,000,000')

'Subsidy DP by'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_SubsidyDPBy'), 'NONE', false)

'Subsidy Amount'
WebUI.setText(findTestObject('Facility/FacilityRegister/FinancingForm/input_SubsidyAmount'), '')

'Deposit Refund'
WebUI.setText(findTestObject('Facility/FacilityRegister/FinancingForm/input_SecDepositRefundI'), '')

'Payment Method'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_PaymentMethod'), 'VACCT', false)

'Asset Type'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_AssetType'), '2', false)

'Vehicle Type'
WebUI.click(findTestObject('Facility/FacilityRegister/FinancingForm/input_VehicleTypeRadioPassengger'))

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

'Condition'
WebUI.click(findTestObject('Facility/FacilityRegister/FinancingForm/input_ConditionNew'))

'Used Year'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_UsedYear'), '0', false)

'Purpose of Use'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_PurposeOfUse'), 'COFMB', false)

'Freq of payment'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/FinancingForm/select_FreqOfPayment'), '01', false)

'Lease Period'
WebUI.setText(findTestObject('Facility/FacilityRegister/FinancingForm/input_LeasePeriod'), '24')

'Opinion Originator'
WebUI.setText(findTestObject('Facility/FacilityRegister/FinancingForm/textarea_OpinionOfOriginator'), 'Test Opinion Katalon')

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_medium_time)

'Save Button'
WebUI.callTestCase(findTestCase('Facility/FloatingButton/FacilitySaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

