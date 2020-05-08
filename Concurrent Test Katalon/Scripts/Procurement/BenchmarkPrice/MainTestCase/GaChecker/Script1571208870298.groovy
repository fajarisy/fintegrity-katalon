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

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : GaChecker, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Procurement/BenchmarkPrice/HometaskBenchmarkPrice/HomeTaskBenchmark'), [('PRno') : PRno
        , ('ItemName') : ItemName], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkForm/CheckItemGaChecker'), 
    GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkForm/CheckItemGaChecker'), 
    GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkForm/CheckItemGaChecker'), 
    GlobalVariable.wait_js_long_time)

WebUI.callTestCase(findTestCase('Procurement/FloatingButtons/ApproveButtonBenchmark'), [:], FailureHandling.STOP_ON_FAILURE)

