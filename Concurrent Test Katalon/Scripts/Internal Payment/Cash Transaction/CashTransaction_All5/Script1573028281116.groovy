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

'Login Maker CT'
WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : Maker], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Internal Payment/Cash Transaction/CashTransaction_Maker5'), [('PostingPeriod') : PostingPeriod
        , ('Description') : Description, ('SearchEmployee') : SearchEmployee, ('Employee') : Employee, ('ApplicationNo') : ApplicationNo
        , ('TransDate') : TransDate, ('DateFrom') : DateFrom, ('DateTo') : DateTo, ('TotalDay') : TotalDay, ('County') : Country
        , ('City') : City, ('Purpose') : Purpose, ('RequestDate') : RequestDate, ('Branch') : Branch, ('SearchEntryType') : SearchEntryType
        , ('EntryType') : EntryType, ('Amount') : Amount], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Internal Payment/Cash Transaction/CashTransaction_Maker'), [('PostingPeriod') : '09', ('Description') : 'DINAS - INSPEC CABANG'
//        , ('SearchEmployee') : 'CHAIRUL', ('Employee') : 'CHAIRUL', ('ApplicationNo') : '12848265843687621574', ('TransDate') : '17/09/2019'
//       , ('DateFrom') : '17/09/2019', ('DateTo') : '19/09/2019', ('TotalDay') : '2', ('Country') : 'Indonesia', ('City') : 'Makassar'
//       , ('Purpose') : 'Kunjungan ke Branch', ('RequestDate') : 'Sep 17, 2019', ('Branch') : 'PJ7', ('SearchEntryType') : 'TRAVEL'
//        , ('EntryType') : '405006-PJ7-D', ('Amount') : '4500000'], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

'Login Approver CT'
WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : Approver], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Internal Payment/Cash Transaction/CashTransaction_Approve5'), [('CashTransNo') : CashTransNo], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

'Login Maker CT Payment'
WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : MakerCTPayment, ('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Internal Payment/Cash Transaction/CashTransactionPayment_Maker5'), [('CashTransNo') : CashTransNo
        , ('PaymentDate') : PaymentDate, ('ActualPayment') : ActualPayment, ('BankAccount') : BankAccount], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

'Login Checker CT Payment'
WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : CheckerCTPayment, ('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Internal Payment/Cash Transaction/CashTransactionPayment_Checker5'), [('CashTransNo') : CashTransNo], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

'Login Approver CT Payment'
WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : ApproverCTPayment, ('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Internal Payment/Cash Transaction/CashTransactionPayment_Approver5'), [('CashTransNo') : CashTransNo], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isOpenBrowser') : true], FailureHandling.STOP_ON_FAILURE)

