import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/CDBTestSuite/ConcurrentCDBFullCompany/CDBFullCompany05')

suiteProperties.put('name', 'CDBFullCompany05')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\FUJITSU\\Document\\Automatization Test\\Katalon Test Script\\Concurrent Test Katalon\\Reports\\20191030_153330\\CDBTestSuite\\ConcurrentCDBFullCompany\\CDBFullCompany05\\20191030_153334\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/CDBTestSuite/ConcurrentCDBFullCompany/CDBFullCompany05', suiteProperties, new File("D:\\FUJITSU\\Document\\Automatization Test\\Katalon Test Script\\Concurrent Test Katalon\\Reports\\20191030_153330\\CDBTestSuite\\ConcurrentCDBFullCompany\\CDBFullCompany05\\20191030_153334\\testCaseBinding"))
