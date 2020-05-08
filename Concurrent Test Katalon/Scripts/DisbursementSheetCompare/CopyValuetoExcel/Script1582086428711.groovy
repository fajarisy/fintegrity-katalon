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
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import org.apache.xmlbeans.impl.store.Locale.domNthCache as domNthCache
import java.lang.String as String

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\DisbursementSheetCompare\\DISBSHEET.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheetAt(0)

TipeKredit = sheet.getRow(5-1).getCell(7-1).getStringCellValue()
println(TipeKredit)

InsType = sheet.getRow(6-1).getCell(7-1).getStringCellValue()
println(InsType)

def Package = sheet.getRow(7-1).getCell(7-1).getStringCellValue()
println(Package)

def Date = sheet.getRow(8-1).getCell(7-1).getDateCellValue()
println(Date)

Borrower = sheet.getRow(9-1).getCell(7-1).getStringCellValue()
println(Borrower)

Address = sheet.getRow(10-1).getCell(7-1).getStringCellValue()
println(Address)

//============================================================== 2

Bpkb = sheet.getRow(12-1).getCell(7-1).getStringCellValue()
println(Bpkb)

ContractPerson = sheet.getRow(13-1).getCell(7-1).getStringCellValue()
println(ContractPerson)

TelpNo = sheet.getRow(14-1).getCell(7-1).getStringCellValue()
println(TelpNo)

MailingAddress = sheet.getRow(15-1).getCell(7-1).getStringCellValue()
println(MailingAddress)

//=============================================================== 3

BusinessType = sheet.getRow(17-1).getCell(7-1).getStringCellValue()
println(BusinessType)

ContractNo = sheet.getRow(18-1).getCell(7-1).getStringCellValue()
println(ContractNo)

DescriptionofGoods = sheet.getRow(19-1).getCell(7-1).getStringCellValue()
println(DescriptionofGoods)

ChassisNo = sheet.getRow(20-1).getCell(7-1).getStringCellValue()
println(ChassisNo)

EngineNo = sheet.getRow(21-1).getCell(7-1).getStringCellValue()
println(EngineNo)

TermofLease = sheet.getRow(22-1).getCell(7-1).getStringCellValue()
println(TermofLease)

ModeofPayment = sheet.getRow(23-1).getCell(7-1).getStringCellValue()
println(ModeofPayment)

InterestRate = sheet.getRow(24-1).getCell(7-1).getNumericCellValue()
println(InterestRate + "%")

SubsidyInterestRate = sheet.getRow(25-1).getCell(7-1).getNumericCellValue()
println(SubsidyInterestRate + "%")

FixedAnnualy = sheet.getRow(26-1).getCell(7-1).getStringCellValue()
println(FixedAnnualy)

//====================================================================== 5


CommitmentFee = sheet.getRow(28-1).getCell(8-1).getNumericCellValue()
println(CommitmentFee)

LifeInsurance = sheet.getRow(29-1).getCell(8-1).getNumericCellValue()
println(LifeInsurance)

CarInsurance = sheet.getRow(30-1).getCell(8-1).getNumericCellValue()
println(CarInsurance)

ConvertIns = sheet.getRow(31-1).getCell(8-1).toString()

InsuranceCapitalized = sheet.getRow(31-1).getCell(8-1).getNumericCellValue()
println(InsuranceCapitalized)

FirstInstallment = sheet.getRow(32-1).getCell(8-1).getNumericCellValue()
println(FirstInstallment)

CostofGoods = sheet.getRow(33-1).getCell(8-1).getNumericCellValue()
println(CostofGoods)

LessDownPayment = sheet.getRow(34-1).getCell(8-1).getDateCellValue()
println(LessDownPayment)

ApprovedPropossalAmount = sheet.getRow(35-1).getCell(8-1).getNumericCellValue()
println(ApprovedPropossalAmount)

ResidualValue = sheet.getRow(37-1).getCell(8-1).getNumericCellValue()
println(ResidualValue)

Option = sheet.getRow(38-1).getCell(8-1).getNumericCellValue()
println(Option)

Subsidy_ATPM = sheet.getRow(39-1).getCell(8-1).getNumericCellValue()
println(Subsidy_ATPM)

Subsidy_TDP_ATPM = sheet.getRow(40-1).getCell(8-1).getNumericCellValue()
println(Subsidy_TDP_ATPM)

file.close()

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/Extractor/WritetoExcelDisbursement'), [('Nilai') : Nilai], FailureHandling.STOP_ON_FAILURE)

