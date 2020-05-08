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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('EntryBooking/EntryBooking_All'), [('Maker') : Maker, ('Checker') : Checker, ('Approver') : Approver
        , ('CustomerType') : CustomerType, ('CustomerName') : CustomerName, ('PhoneNumber') : PhoneNumber, ('Address') : Address
        , ('SupplierName') : SupplierName, ('isOpenBrowser') : false, ('FacilityType') : FacilityType], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : CMO, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_CMO_Improved'), [('CustomerType') : CustomerType, ('CustomerName') : CustomerName
        , ('FoundedYear') : FoundedYear, ('NPWPNo') : NPWPNo, ('CompanyName') : CompanyName, ('IdCard') : IdCard, ('CompanyType') : CompanyType
        , ('BusinessSegment') : BusinessSegment, ('PaidUAAP') : PaidUAAP, ('AML') : AML, ('CMO') : CMO], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : true], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : BA, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_BA'), [('BranchAdmin') : BA, ('CustomerName') : CustomerName, ('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : true], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : BM, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_BM'), [('BM') : BM, ('CustomerName') : CustomerName, ('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : true], FailureHandling.STOP_ON_FAILURE)

