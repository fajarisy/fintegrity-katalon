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

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : CMO, ('isOpenBrowser') : false], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'customKeywords.LoginHelper.DoLogin'(GlobalVariable.Fintegrity, CMO, GlobalVariable.FinPass)

WebUI.callTestCase(findTestCase('CDB/HomeTaskCDB/HomeTaskImproved'), [('CustomerName') : CustomerName, ('CustomerType') : CustomerType], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/BasicInformation/BasicInformation'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/IdInformation/IdInformation'), [('IdCard') : IdCard], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/OtherInformation/OtherInformation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/FloatingButton/ButtonSave'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Address/LegalAddress'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/BankStatement/BankStatement'), [('CustomerName') : CustomerName], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Occupation/Occupation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/Payer/Payer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/CDBPersonal/ComboBoxInput/SurveyInterview/SurveyInterview'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CDB/FloatingButton/ButtonSendNext'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Logout'), [('isCloseBrowser') : false], FailureHandling.STOP_ON_FAILURE)

