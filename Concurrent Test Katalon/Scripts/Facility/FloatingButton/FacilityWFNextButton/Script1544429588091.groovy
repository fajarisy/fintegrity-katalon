import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.media.rtp.GlobalReceptionStats
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

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

WebUI.switchToDefaultContent()

'Send Next'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Facility/FloatingButton/FacilityWFNext'), GlobalVariable.wait_js_long_time)

WebUI.waitForAlert(GlobalVariable.wait_short_time)

WebUI.acceptAlert()

WebUI.waitForElementNotPresent(findTestObject('Facility/FloatingButton/FacilityWFNext'), GlobalVariable.wait_long_time, FailureHandling.OPTIONAL)

'Wait for Loading Page'
WebUI.delay(15)

