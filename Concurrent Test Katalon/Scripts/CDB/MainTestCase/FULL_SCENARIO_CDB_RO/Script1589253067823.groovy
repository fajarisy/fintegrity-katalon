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

WebUI.callTestCase(findTestCase('EntryBookingEnhanced/MainTestCase/EntryBooking_All'), [('CMO') : findTestData('CDB/CDB_RO').getValue(
            1, 1), ('BM') : findTestData('CDB/CDB_RO').getValue(2, 1), ('CustomerName') : findTestData('CDB/CDB_RO').getValue(
            3, 1), ('FacilityType') : findTestData('CDB/CDB_RO').getValue(4, 1), ('CustomerType') : findTestData('CDB/CDB_RO').getValue(
            5, 1), ('PhoneNumber') : findTestData('CDB/CDB_RO').getValue(6, 1), ('Address') : findTestData('CDB/CDB_RO').getValue(
            7, 1), ('SupplierName') : findTestData('CDB/CDB_RO').getValue(8, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_RO_MAKER'), [('PlaceOfBirth') : findTestData('CDB/CDB_RO').getValue(
            9, 1), ('CMO') : findTestData('CDB/CDB_RO').getValue(1, 1), ('CustomerName') : findTestData('CDB/CDB_RO').getValue(
            3, 1), ('CustomerType') : findTestData('CDB/CDB_RO').getValue(5, 1), ('DateOfBirth') : findTestData('CDB/CDB_RO').getValue(
            10, 1), ('IdCard') : findTestData('CDB/CDB_RO').getValue(11, 1), ('Address') : findTestData('CDB/CDB_RO').getValue(
            12, 1), ('Country') : findTestData('CDB/CDB_RO').getValue(13, 1), ('Region') : findTestData('CDB/CDB_RO').getValue(
            14, 1), ('District') : findTestData('CDB/CDB_RO').getValue(15, 1), ('SubDistrict') : findTestData('CDB/CDB_RO').getValue(
            16, 1), ('Rt') : findTestData('CDB/CDB_RO').getValue(17, 1), ('Rw') : findTestData('CDB/CDB_RO').getValue(18, 
            1), ('PhoneType') : findTestData('CDB/CDB_RO').getValue(19, 1), ('PhoneNo') : findTestData('CDB/CDB_RO').getValue(
            20, 1)], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_RO_APPROVER'), [('BM') : findTestData('CDB/CDB_RO').getValue(2, 1)
        , ('CustomerName') : findTestData('CDB/CDB_RO').getValue(3, 1), ('CustomerType') : findTestData('CDB/CDB_RO').getValue(
            5, 1)], FailureHandling.STOP_ON_FAILURE)

