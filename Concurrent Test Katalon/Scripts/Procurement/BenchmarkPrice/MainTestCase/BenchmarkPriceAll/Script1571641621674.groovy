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

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : GaMaker, ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Procurement/BenchmarkPrice/MainTestCase/GaMaker'), [('PRno') : PRno, ('ItemName') : 'Dummyitem1'
        , ('GaMaker') : 'NATALIA'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : true], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : GaChecker, ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Procurement/BenchmarkPrice/MainTestCase/GaChecker'), [('GaChecker') : GaChecker, ('ItemName') : 'DummyItem1'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : true], FailureHandling.STOP_ON_FAILURE)

