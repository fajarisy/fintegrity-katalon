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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

'Login Maker VA14 Payment Maker'
WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : Maker], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('VA Payment/VA Payment 14/VAPayment 14_Maker'), [('directoryVA') : '', ('ReceivingBank') : '101601;PJ7-00000-0000-0000-0000-0000'
        , ('Description') : 'Test Katalon\r\n'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

'Login Approver  VA Payment '
WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : Approver], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('VA Payment/VA Payment 14/VAPayment14_Checker'), [('UploadDate') : UploadDate, ('TotalTransaction') : TotalTransaction], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

