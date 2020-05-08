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
import java.util.Date as Date
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Calendar as Calendar
import java.text.DecimalFormat as DecimalFormat

'BPKB NAME'
BPKB_Name = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractRegisterValueObjects/BPKB_Name'), 
    'value')

println(BPKB_Name)

'OpenAsset'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/DisbursementSheetCompare/ExtractRegisterValueObjects/OpenAsset1'), 
    15)

'ChassisNo'
ChassisNo = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractRegisterValueObjects/AssetChassis'))

println(ChassisNo)

'EngineNo'
EngineNo = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractRegisterValueObjects/AssetEnggineNo'))

println(EngineNo)

'Description of Goods'
DescriptionofGoods = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractRegisterValueObjects/DescriptionofGoods'), 
    'value')

println('DescriptionofGoods: ' + DescriptionofGoods)

'Close Menu Asset'
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Object Repository/DisbursementSheetCompare/ExtractRegisterValueObjects/CloseAsset'), 
    15)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/Extractor/WritetoExcelRegister'), [('BPKB_Name') : BPKB_Name, ('ChassisNo') : ChassisNo
        , ('EngineNo') : EngineNo, ('DescriptionofGoods') : DescriptionofGoods], FailureHandling.STOP_ON_FAILURE)

