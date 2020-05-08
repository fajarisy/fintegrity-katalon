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

//==========================Business Licence=====================================================

WebUI.switchToDefaultContent()

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

WebUI.selectOptionByLabel(findTestObject('Object Repository/CDB/Company/ComboBoxButton/ComboBoxButton'), 
	'Company Registration Info', false, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/AddBusinessLicence'), 
	GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/AddBusinessLicence'),
	GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/iframeBusinessLicence'), 
	GlobalVariable.wait_long_time,FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/DocumentNo'), '123')

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/iframeBusinessLicence'), 
	findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/DocIssueDate'), 'Oct 7, 2019', GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/SaveButton'))

WebUI.acceptAlert()
//================================company registration (TDP)================================================================

WebUI.switchToDefaultContent()

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/CompanyRegistration/AddCompanyRegistration'),
	GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/CompanyRegistration/AddCompanyRegistration'),
	GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/CompanyRegistration/iframeCompanyRegistration'),
	GlobalVariable.wait_long_time,FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/CompanyRegistration/DocumentNo'), '123')

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/CompanyRegistration/iframeCompanyRegistration'),
	findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/DocIssueDate'), 'Oct 7, 2019', GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/CompanyRegistration/DeedDomicile'), 'Test')

WebUI.click(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/SaveButton'))

WebUI.acceptAlert()
//====================================Akte Pendirian======================================================================
WebUI.switchToDefaultContent()

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePendirian/AddAktePendirian'),
	GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePendirian/AddAktePendirian'),
	GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePendirian/IframeAktePendirian'),
	GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePendirian/DocumentNo'), '123')

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePendirian/IframeAktePendirian'),
	findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/DocIssueDate'), 'Oct 7, 2019', GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePendirian/SaveButton'))

WebUI.acceptAlert()
//================================Akte Perubahan Terakhir=======================================================================

WebUI.switchToDefaultContent()

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePerubahanTerakhir/AddAktaPerubahan'),
	GlobalVariable.wait_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePerubahanTerakhir/AddAktaPerubahan'),
	GlobalVariable.wait_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePerubahanTerakhir/IframeAktaPerubahan'),
	GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePerubahanTerakhir/DocumentNo'), '123')

CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJSIframe'(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePerubahanTerakhir/IframeAktaPerubahan'),
	findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/BusinessLicence/DocIssueDate'), 'Oct 7, 2019', GlobalVariable.wait_long_time)

WebUI.click(findTestObject('Object Repository/CDB/Company/CompanyRegistrationInfo/AktePerubahanTerakhir/SaveButton'))

WebUI.acceptAlert()