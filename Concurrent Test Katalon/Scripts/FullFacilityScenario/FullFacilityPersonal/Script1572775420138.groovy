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

WebUI.callTestCase(findTestCase('EntryBooking/EntryBooking_All'), [('Maker') : 'DEBBY', ('Checker') : 'CHAIRUL', ('Approver') : 'DEBBY'
        , ('CustomerType') : 'C', ('CustomerName') : 'CLOP', ('PhoneNumber') : '0982312938', ('Address') : 'Jakarta', ('SupplierName') : 'HONDA JAKARTA CENTER'
        , ('isOpenBrowser') : false, ('FacilityType') : 'CONSL'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/FullScenarioCDBv2'), [('CMO') : 'ADITYO', ('BA') : 'DINA', ('CustomerName') : 'CONCURRENT_F6B'
        , ('IdCard') : '302900012206670', ('BM') : 'YANUAR', ('CustomerType') : 'P', ('NPWPNo') : '2765426783654ASE', ('CompanyName') : 'CLOP'
        , ('FoundedYear') : '1988', ('CompanyType') : 'PT000', ('BusinessSegment') : '3', ('PaidUAAP') : '1000000', ('AML') : 'L'
        , ('Maker') : 'DEBBY', ('Checker') : 'CHAIRUL', ('Approver') : 'DEBBY', ('PhoneNumber') : '2398492834902', ('Address') : 'JAKARTA'
        , ('FacilityType') : 'CONSL', ('SupplierName') : 'HONDA JAKARTA CENTER'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Facility/FacilityRegister/MainTestCase/FacilityRegisterImproved'), [('CMO') : '', ('BA') : ''
        , ('CA') : '', ('BM') : '', ('LegalMaker') : '', ('CustomerType') : '', ('CustomerName') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('UpdateAdditionalInfo/MainTestCase/UpInfoAll'), [('CustomerName') : '', ('BA') : '', ('BM') : ''
        , ('ChassisNo') : '', ('EngineNo') : '', ('VirtualAcct') : '', ('Description') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('RequestDisburse/MainTestCase/RequestDisburseAll'), [('CustomerName') : 'DONI OKTRA VOLTA'
        , ('BA') : 'IRMA', ('BM') : 'HANNES', ('FINMaker') : 'RACHMITA', ('FINChecker') : 'NATALIA', ('FINDIR') : 'HIROSE'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Disbursement/MainTestCase/DisbursementAll'), [('FINMaker') : 'NATALIA', ('FINChecker') : 'YUNILIA'
        , ('FINDir') : 'HIROSE', ('CustomerName') : 'NewContract_CC01'], FailureHandling.STOP_ON_FAILURE)

