import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('EntryBookingEnhanced/MainTestCase/EntryBooking_All'), [('CMO') : CMO, ('BM') : BM, ('CustomerName') : CustomerName
        , ('FacilityType') : FacilityType, ('CustomerType') : CustomerType, ('PhoneNumber') : PhoneNumber, ('Address') : Address
        , ('SupplierName') : SupplierName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_RO_MAKER'), [('PlaceOfBirth') : PlaceOfBirth, ('CMO') : CMO, ('CustomerName') : CustomerName
        , ('CustomerType') : CustomerType, ('DateOfBirth') : DateOfBirth, ('IdCard') : IdCard, ('Address') : Address, ('Country') : Country
        , ('Region') : Region, ('District') : District, ('SubDistrict') : SubDistrict, ('Rt') : RT, ('Rw') : RW, ('PhoneType') : PhoneType
        , ('PhoneNo') : PhoneNo], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_RO_APPROVER'), [('BM') : BM, ('CustomerName') : CustomerName, ('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

