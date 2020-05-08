import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TSC_EB_CDB_FCLT/TSC_EB_CDB_FCLT_002')

suiteProperties.put('name', 'TSC_EB_CDB_FCLT_002')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\Nurochim\\Fintegrity Test\\FintegrityTest_001\\Reports\\TSC_EB_CDB_FCLT\\TSC_EB_CDB_FCLT_002\\20180710_194353\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TSC_EB_CDB_FCLT/TSC_EB_CDB_FCLT_002', suiteProperties, [new TestCaseBinding('Test Cases/TS_Collection/EB_CDB_FCLT', 'Test Cases/TS_Collection/EB_CDB_FCLT',  [ 'EBMaker' : 'DEBBY' , 'CustBM' : 'YANUAR' , 'EBApprover' : 'DEBBY' , 'CustomerType' : 'P' , 'CustMaker' : 'DEBBY' , 'PhoneNumber' : '09921398912' , 'Address' : 'Jakarta' , 'EBChecker' : 'YANUAR' , 'CustomerName' : 'Test Customer DataDriven 29' , 'FacilityType' : 'CONSL' , 'CustBA' : 'DEBBY' , 'SupplierName' : 'HONDA' ,  ])])
