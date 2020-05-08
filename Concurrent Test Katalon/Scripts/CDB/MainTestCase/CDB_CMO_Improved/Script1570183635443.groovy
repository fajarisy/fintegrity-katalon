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

if (CustomerType == 'C') {
    WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_CMO_Corporate'), [('CustomerName') : CustomerName, ('CustomerType') : CustomerType
            , ('CMO') : CMO, ('CompanyName') : CompanyName, ('CompanyType') : CompanyType, ('FoundedYear') : FoundedYear, ('NPWPNo') : NPWPNo
            , ('BusinessSegment') : BusinessSegment, ('PaidUAAP') : PaidUAAP, ('AML') : AML], FailureHandling.STOP_ON_FAILURE)
} else if (CustomerType == 'P') {
    WebUI.callTestCase(findTestCase('CDB/MainTestCase/CDB_CMO_Personal'), [('CustomerName') : CustomerName, ('IdCard') : IdCard
            , ('CMO') : CMO, ('CustomerType') : CustomerType], FailureHandling.STOP_ON_FAILURE)
}

