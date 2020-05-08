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
import customKeywords.CustomKeywordJS as CustomKeywordJS
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : BA, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

'Fintegrity Main Menu - Click Update Additional Info'
if (WebUI.verifyElementNotPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoHome/HomeMenuUpinfo'), 
    GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)) {
    WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoHome/HomeMenuUpinfo'), 
        GlobalVariable.wait_long_time)

    CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoHome/HomeMenuUpinfo'), 
        GlobalVariable.wait_js_long_time)
}

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoHome/HomeMenuUpinfo'), 
    GlobalVariable.wait_js_long_time)

WebUI.waitForPageLoad(GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

WebUI.waitForElementClickable(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoListMenu/SearchDropDown'), 
    GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

'Choose Option to search by customer name'
WebUI.selectOptionByValue(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoListMenu/SearchDropDown'), 
    'lesseName:s', false)

WebUI.delay(GlobalVariable.wait_medium_time)

'Fill name of Customer'
WebUI.setText(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoListMenu/SearchTextInput'), CustomerName)

'Button Search'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoListMenu/ButtonSearch'), 
    GlobalVariable.wait_js_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoListMenu/ResultTable'), 
    GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

'Button Open Facility'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoListMenu/OpenFacilityButton'), 
    GlobalVariable.wait_js_long_time)

WebUI.waitForPageLoad(GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

'Click Save Button'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/FloatingButton/UpInfoSaveButton'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()

WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/FloatingButton/EditButton'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

'Click Edit Button'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/FloatingButton/EditButton'), 
    GlobalVariable.wait_js_long_time)

WebUI.waitForElementClickable(findTestObject('UpdateAdditionalInfo/UpdateAdditionalInfoForm/EditButtonOnTable'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

'Click Edit Button on Table'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('UpdateAdditionalInfo/UpdateAdditionalInfoForm/EditButtonOnTable'), 
    GlobalVariable.wait_js_long_time)

//WebUI.switchToFrame(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/ObjectLeaseForm'), GlobalVariable.wait_medium_time)
'Switch to Frame/modal'
WebUI.focus(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/ObjectLeaseForm'))

WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/ChassisNo'), 
    GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/ChassisNo'), ChassisNo)

WebUI.setText(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/EngineNo'), EngineNo)

WebUI.setText(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/VirtualAcct'), VirtualAcct)

WebUI.setText(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/Description'), Description)

'Save button on Modal'
WebUI.click(findTestObject('Object Repository/UpdateAdditionalInfo/UpdateAdditionalInfoForm/UpInfoSaveButtonOnModal'))

WebUI.acceptAlert()

'Save UpInfo'
WebUI.switchToDefaultContent()

WebUI.waitForElementPresent(findTestObject('Object Repository/UpdateAdditionalInfo/FloatingButton/UpInfoSaveButton'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/FloatingButton/UpInfoSaveButton'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()

'Send Next'
WebUI.waitForElementClickable(findTestObject('Object Repository/UpdateAdditionalInfo/FloatingButton/UpInfoSendNext'), GlobalVariable.wait_long_time, 
    FailureHandling.OPTIONAL)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/UpdateAdditionalInfo/FloatingButton/UpInfoSendNext'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.waitForAlert(30)

WebUI.acceptAlert()

