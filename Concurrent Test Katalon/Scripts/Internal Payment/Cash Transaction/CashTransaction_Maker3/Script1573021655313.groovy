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
import customKeywords.CustomKeywordJS as CustomKeywordJS
import internal.GlobalVariable as GlobalVariable

import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.xmlbeans.impl.store.Locale.domNthCache as domNthCache
import java.lang.String as String



/*
WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.0.100:4040/Fintegrity')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_UserName_frmMainuserName', [('variable') : 'DWI']), 
    'DWI')

WebUI.setText(findTestObject('Page_ MBF IT Core System - Login 1336/input_Password_frmMainpassword', [('variable') : 'Mbf137??']), 
    'Mbf137??')

WebUI.click(findTestObject('LoginLogout/Page_ Login/input_frmMainbtnLogin'))
*/

WebUI.delay(10)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/span_Cash Transaction'), 
    10)

WebUI.delay(10)

CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/img (Add)'), 
    10)

'Select Posting Period'
WebUI.selectOptionByValue(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/select_postingperiod'), PostingPeriod, false)

'Select Transaction Type'
WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Transaction Type_Business Trip'))

//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Test 2/input_Other-Tax_frmMaintranFor'))
'Input Description'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Text_Desc'), Description)

WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/input_frmMainbtnAL_saveExec'))

WebUI.acceptAlert()

//============get cash no function==========
WebUI.delay(20)

WebUI.waitForElementPresent(findTestObject("Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction/generatedcashno"), 10, FailureHandling.STOP_ON_FAILURE)

String GenerateCashNo = WebUI.getText(findTestObject("Object Repository/Internal Payment - Cash Transaction/Maker Cash Transaction/generatedcashno"), FailureHandling.STOP_ON_FAILURE)

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Cash Transaction\\CashTransaction.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('CT3')

//int row = sheet.getLastRowNum()

println(sheet.getRow(1).getCell(5))

sheet.getRow(1).getCell(5)
sheet.getRow(1).createCell(5).setCellValue(GenerateCashNo)

file.close()

FileOutputStream outFile = new FileOutputStream(new File('D:\\TestDataKatalon\\Cash Transaction\\CashTransaction.xlsx'))

workbook.write(outFile)

outFile.close()

//======================

'Search Employee'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Input_Search Employee'), SearchEmployee)

WebUI.delay(10)

'choose employee'
WebUI.selectOptionByValue(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/search employee'), 
    Employee, true)

'Input Application No'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Text_AppId'), ApplicationNo)

//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Transaction_Date'))
'Input Transaction Date'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Transaction_Date'), 
    TransDate, GlobalVariable.wait_js_long_time)

//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Input_Trans_Date'))
//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Transaction_Date'))
//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/From_Date'),'16/09/2019')
'Input Date From'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/From_Date'), 
    DateFrom, GlobalVariable.wait_js_long_time)

//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Transaction_Date'))
//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/To_Date'),'18/09/2019')
'Input Date To'
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/To_Date'), 
    DateTo, GlobalVariable.wait_js_long_time)

'Input Total Days'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/TotalDays'), TotalDay)

'Input Country'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Country_Name'), Country)

'Input City'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/City_Name'), City)

'Input Purpose'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Purpose'), Purpose)

'Input Request Date'
//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Request_Payment_Date'))
CustomKeywords.'customKeywords.CustomKeywordJS.setDateUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Request_Payment_Date'), 
  RequestDate, GlobalVariable.wait_js_long_time)

'Save Cash Transaction'
//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/SaveCashTransaction'))
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/SaveCashTransaction'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()
WebUI.delay(5)

'Button Add Detail Transaction'
//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Add_Transaction_Button'))
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Add_Transaction_Button'), 
    10)

'Input Branch'
WebUI.selectOptionByValue(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Branch'), Branch, false)

'Search Entry Type'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Input_Search_EntryType'), SearchEntryType)

WebUI.delay(10)

'Input entry type'
WebUI.selectOptionByValue(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Select_EntryType'), 
    EntryType, false)

'Input Amount'
WebUI.setText(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/input_Amount'), Amount)

'Expense Type'
WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Expense_Type', [('variable') : 'OTHER']))

'Button Save Detail Transaction'
WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Save_Transaction'))

WebUI.acceptAlert()

WebUI.waitForElementClickable(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/SaveCashTransaction'), 
    10)

WebUI.refresh()
WebUI.delay(10)

'Button Send To Checker'
//WebUI.click(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Send_to_Checker'))
CustomKeywords.'customKeywords.CustomKeywordJS.clickUsingJS'(findTestObject('Internal Payment - Cash Transaction/Maker Cash Transaction/Send_to_Checker'), 
    GlobalVariable.wait_js_long_time)

WebUI.acceptAlert()
WebUI.delay(20)
