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
import dynamicSelector.DynamicSelector
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

WebUI.waitForPageLoad(GlobalVariable.wait_long_time)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Procurement/FloatingButtons/PickTaskButton')
		, 10, FailureHandling.OPTIONAL)){
	CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/FloatingButtons/PickTaskButton')
		, 10)
	WebUI.waitForAlert(GlobalVariable.wait_short_time)
	WebUI.acceptAlert()
}

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkForm/AddBenchmarkPrice')
		, GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkForm/AddBenchmarkPrice')
		, GlobalVariable.wait_long_time)

//String dynamicId = 'frmMain:jsLink_btnAdd_'
//String xpath = String.format(DynamicSelector.dynamicIdPath, dynamicId)
//WebUI.click(DynamicSelector.getMyTestObject("xpath", xpath))

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkForm/AddBenchmarkPrice')
	, GlobalVariable.wait_js_long_time)

WebUI.waitForElementPresent(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/SupplierAssetInformation')
	, GlobalVariable.wait_long_time, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/SupplierAssetInformation')
	, '%%%')

WebUI.delay(GlobalVariable.wait_medium_time)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/SupplierAssetInformationList')
	, 'ASONIC STORE', false)

WebUI.setText(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/UnitPrice'), '7000')

WebUI.click(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/PercentageButton'))

WebUI.delay(GlobalVariable.wait_short_time)

WebUI.setText(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/DiscountPercentage'), '10')

WebUI.selectOptionByLabel(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/PaymentType')
	, 'Transfer', false)

WebUI.click(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/Sugested'))

WebUI.setText(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/Remarks'), 'Benchmark Price Completed by automation test software')

//CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/SaveButton'), GlobalVariable.wait_short_time)

WebUI.click(findTestObject('Object Repository/Procurement/BenchmarkPrice/BenchmarkPriceIframe/SaveButton'))

WebUI.acceptAlert()