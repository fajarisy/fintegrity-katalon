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

'Delay'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/select_FinancingScheme')
	, GlobalVariable.wait_long_time)

'Select Financin Scheme'
WebUI.selectOptionByValue(findTestObject('Object Repository/Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/select_FinancingScheme'), 
    '/Facility/FinancingScheme/form.xhtml', false)

'Delay'
WebUI.delay(GlobalVariable.wait_short_time)

'Calc Method'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/select_CalculationMethod'), 
    'FIXFF', false)

'Delay'
WebUI.delay(GlobalVariable.wait_short_time)

'Grace Period'
WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_GracePeriod'), '0')

'Delay'
WebUI.delay(GlobalVariable.wait_short_time)

'Payment Indikator'
WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_PaymenIndicatorAdv'))

'Payment Indikator'
WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_PaymentIndicatorArr'))

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

'Freq Grace period'
if (true) {
    WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/select_FreqGracePeriod'), 
        '01', false)
} else {
    WebUI.verifyElementNotClickable(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/select_FreqGracePeriod'))
}

'Rate Type Fixed'
WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_RateTypeFixed'))

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_InterestRate'), '10.125')

'Subsisdy Interest By'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/select_SubsidyInterestBy'), 
    'NONE', false)

'Subsidy Interest'
WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_SubsidyInterest'), '00')

'Residual Value'
WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_ResidualValue'), '0')

'Delay'
WebUI.delay(GlobalVariable.wait_short_time)

'Generate Payment'
WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_BtnGeneratePayment'))

'Delay'
WebUI.delay(GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/FinancingScheme/input_BtnSave'))

WebUI.acceptAlert()

'Delay'
WebUI.delay(GlobalVariable.wait_long_time)

