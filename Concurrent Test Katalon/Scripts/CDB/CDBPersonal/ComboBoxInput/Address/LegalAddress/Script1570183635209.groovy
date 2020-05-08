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

//WebUI.scrollToElement(findTestObject('CDB/Personal/Page_FormCDBPersonal/img_frmMaintblDocChecking0idch'), GlobalVariable.wait_short_time)
WebUI.waitForElementPresent(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'), GlobalVariable.wait_js_long_time)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('CDB/Personal/Page_FormCDBPersonal/img'), GlobalVariable.wait_js_long_time)

'Wait For Loading Page'
WebUI.delay(GlobalVariable.wait_short_time)

WebUI.waitForElementVisible(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/AddressTextArea'), GlobalVariable.wait_long_time)

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/AddressTextArea'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/Country'), 'IDN', false)

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/Region'), '3172000000' //jakarta utara
    , false)

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/District'), '3172010000' //penjaringan
    , false)

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.selectOptionByValue(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/SubDistrick'), '3172011005' //pluit
    , false)

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/RT'), '009')

WebUI.setText(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/RW'), '099')

'Call Add TestCase Telephone'
WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Address/Telephone'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_long_time)

'Save Address'
WebUI.click(findTestObject('Object Repository/CDB/Personal/ComboBoxInput/Address/SaveButton'))

WebUI.acceptAlert()

WebUI.delay(GlobalVariable.wait_long_time)

