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

'Wait Page to Load'
WebUI.waitForPageLoad(GlobalVariable.wait_medium_time)

'Dropdown Click Commision'
WebUI.waitForElementPresent(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/select_DropdownCommission'), 
    GlobalVariable.wait_medium_time, FailureHandling.OPTIONAL)

WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/select_DropdownCommission'), 
    '/Facility/Commission/form.xhtml', false)

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

'Add Commision'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_AddCommission'), 
    GlobalVariable.wait_js_long_time)

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_Commission'), 
    '5')

WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_Ammount'), '300000')

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_BankBranch'), 
    'Jakarta')

'Receiver Type'
WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/select_ReceiverType (1)'), 
    'SALES', false)

'Delay'
WebUI.delay(GlobalVariable.wait_medium_time)

'Name'
not_run: WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/select_Name'), 
    '23302', false)

'Delay'
not_run: WebUI.delay(GlobalVariable.wait_medium_time)

not_run: WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/select_BankName'), 
    '63', false)

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_BankAcctName (1)'), 
    'CHRISTIAN LESMANA')

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_BankAcctNo (1)'), 
    '437.771.7979')

'Add Commision Dealer'
not_run: WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_AddCommission'))

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/Commission'), 
    '5')

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/Comission_Amount'), 
    '300000')

'Delay'
not_run: WebUI.delay(GlobalVariable.wait_medium_time)

not_run: WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/Select_Receiver_Type'), 
    'DEALE', false)

'Delay'
not_run: WebUI.delay(GlobalVariable.wait_medium_time)

not_run: WebUI.waitForElementPresent(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/select_Dealer_Name'), 
    GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/select_Dealer_Name'), 
    '18634', false)

not_run: WebUI.selectOptionByValue(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/select_ABN Amro Bank NVAmerica'), 
    '13', false)

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/Bank_Branch'), 
    'Jakarta')

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/BANK_Acct_Name'), 
    'PT. IMPERIAL PUTRA PERDANA')

not_run: WebUI.setText(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionDealer/Bank_Acct_No'), 
    '437.379.3500')

not_run: WebUI.click(findTestObject('Facility/FacilityRegister/ComboBoxMenu/Commission/CommissionSales/input_Save'))

not_run: WebUI.acceptAlert()

'Delay'
not_run: WebUI.delay(GlobalVariable.wait_long_time)

