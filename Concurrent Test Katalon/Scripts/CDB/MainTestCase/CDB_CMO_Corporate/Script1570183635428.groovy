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

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : CMO, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/HomeTaskCDB/HomeTaskImproved'), [('CustomerName') : CustomerName, ('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/CompanyInformation/CompanyInformation'), [('CompanyType') : CompanyType, ('NPWPNo') : NPWPNo
        , ('FoundedYear') : FoundedYear, ('CompanyName') : CompanyName], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/OtherInformation/OtherInformation'), [('AML') : AML], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/BusinessInformation/BusinessInformation'), [('BusinessSegment') : BusinessSegment
        , ('PaidUAAP') : PaidUAAP], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Address/LegalAddress'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/ComboBoxInput/BankStatement/BankStatement'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/ComboBoxInput/SlikInformation/SlikInformation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/ComboBoxInput/ShareHolder/ShareHolder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/ComboBoxInput/SurveyInterview/SurveyInterview'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBCompany/ComboBoxInput/CompanyRegistrationInfo/CompanyRegistrationInfo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/FloatingButton/ButtonSave'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/FloatingButton/ButtonSendNext'), [:], FailureHandling.STOP_ON_FAILURE)

