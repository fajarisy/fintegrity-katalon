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

'Occupation'
WebUI.switchToDefaultContent()

WebUI.scrollToElement(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaintblDocChecking0idch'), GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('CDB/Personal/Page_FormCDBPersonal/select_AddressBank StatementGu'), '/CIF/Personal/Occupation/list.xhtml', 
    false)

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.click(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'))

'Wait for Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

'Employment Type - Default Value CIVIL'
WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/EmploymentType'), 
    'ENTER', false)

'Wait for Loading Page - if Employment Type is Selected not Default Value'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByIndex(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/BusinessField'), 3)

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/CompanyName'), 'N13R 4UT0M4T4')

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/DurationWork'), '5')

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/MonthlyIncome'), '10,000,0000')

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/OtherIncome'), '2,000,000')

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/FulyPaidUnit'), '3')

WebUI.click(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Occupation/SaveButton'))

WebUI.acceptAlert()