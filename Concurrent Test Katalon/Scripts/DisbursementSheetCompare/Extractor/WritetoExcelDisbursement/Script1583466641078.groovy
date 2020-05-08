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

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\DisbursementSheetCompare\\Disbursement_Sheet_synch.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('CF Single')

sheet.getRow(3-1).createCell(3-1).setCellValue(CreditType)
println(CreditType)

sheet.getRow(4-1).createCell(3-1).setCellValue(InsuranceType)
println(InsuranceType)

sheet.getRow(5-1).createCell(3-1).setCellValue(FacilityPackage)
println(FacilityPackage)

sheet.getRow(6-1).createCell(3-1).setCellValue(ComDate)
println(ComDate)

sheet.getRow(7-1).createCell(3-1).setCellValue(NameofBorrower)
println(NameofBorrower)

sheet.getRow(14-1).createCell(3-1).setCellValue(ContractNo)
println(ContractNo)

sheet.getRow(18-1).createCell(3-1).setCellValue(TermofLease)
println(TermofLease)

sheet.getRow(19-1).createCell(3-1).setCellValue(PaymentMethod)
println(PaymentMethod)

sheet.getRow(20-1).createCell(3-1).setCellValue(InterestRate)
println(InterestRate)

sheet.getRow(21-1).createCell(3-1).setCellValue(SubInterestRate)
println(SubInterestRate)

sheet.getRow(23-1).createCell(3-1).setCellValue(LifeInsurance)
println(LifeInsurance)

sheet.getRow(24-1).createCell(3-1).setCellValue(FirstInstallment)
println(FirstInstallment)

sheet.getRow(27-1).createCell(3-1).setCellValue(AcquisitionAmmount)
println(AcquisitionAmmount)

sheet.getRow(28-1).createCell(3-1).setCellValue(DownPayment)
println(DownPayment)

sheet.getRow(29-1).createCell(3-1).setCellValue(FinancingAmount)
println(FinancingAmount)

sheet.getRow(30-1).createCell(3-1).setCellValue(ResidualValue)
println(ResidualValue)

sheet.getRow(32-1).createCell(3-1).setCellValue(SubsidyATPM)
println(SubsidyATPM)

sheet.getRow(36-1).createCell(3-1).setCellValue(InsuranceCompany)
println(InsuranceCompany)

sheet.getRow(40-1).createCell(3-1).setCellValue(ExcessInsurancePercent)
println(ExcessInsurancePercent)

sheet.getRow(42-1).createCell(3-1).setCellValue(FinancingAmount)
println(FinancingAmount)

sheet.getRow(43-1).createCell(3-1).setCellValue(ExcessInsurance)
println(ExcessInsurance)

sheet.getRow(44-1).createCell(3-1).setCellValue(FirstInstallment)
println(FirstInstallment)

sheet.getRow(48-1).createCell(3-1).setCellValue(PolicyFee)
println(PolicyFee)

sheet.getRow(49-1).createCell(3-1).setCellValue(FiduciaFee)
println(FiduciaFee)

sheet.getRow(53-1).createCell(3-1).setCellValue(DisburseAmount)
println(DisburseAmount)

sheet.getRow(54-1).createCell(3-1).setCellValue(DealerFixedAmount)
println(DealerFixedAmount)

sheet.getRow(57-1).createCell(3-1).setCellValue(RefundDealerTaxAmount)
println(RefundDealerTaxAmount)

sheet.getRow(58-1).createCell(3-1).setCellValue(DealerFixedAmountAfterTax)
println(DealerFixedAmountAfterTax)

sheet.getRow(59-1).createCell(3-1).setCellValue(DealerCommission)
println(DealerCommission)

sheet.getRow(66-1).createCell(3-1).setCellValue(SupplierName)
println(SupplierName)

sheet.getRow(67-1).createCell(3-1).setCellValue(BankPaidTo)
println(BankPaidTo)

sheet.getRow(68-1).createCell(3-1).setCellValue(DealerAcNo)
println(DealerAcNo)

sheet.getRow(69-1).createCell(3-1).setCellValue(DisburseAmount)
println(DisburseAmount)

sheet.getRow(71-1).createCell(3-1).setCellValue(RefundReceiverType)
println(RefundReceiverType)

sheet.getRow(72-1).createCell(3-1).setCellValue(ReceiverName)
println(ReceiverName)

sheet.getRow(74-1).createCell(3-1).setCellValue(BankName)
println(BankName)

sheet.getRow(75-1).createCell(3-1).setCellValue(AcNoSales)
println(AcNoSales)

sheet.getRow(76-1).createCell(3-1).setCellValue(Commission)
println(Commission)

sheet.getRow(78-1).createCell(3-1).setCellValue(SalesRefundTax)
println(SalesRefundTax)

sheet.getRow(79-1).createCell(3-1).setCellValue(SalesRefundTaxAmount)
println(SalesRefundTaxAmount)

sheet.getRow(80-1).createCell(3-1).setCellValue(CommissionAfterTax)
println(CommissionAfterTax)

sheet.getRow(82-1).createCell(3-1).setCellValue(DealerLegalName)
println(DealerLegalName)

sheet.getRow(84-1).createCell(3-1).setCellValue(DealerBankName)
println(DealerBankName)

sheet.getRow(85-1).createCell(3-1).setCellValue(DealerAcNo)
println(DealerAcNo)

sheet.getRow(88-1).createCell(3-1).setCellValue(RefundDealerTaxAmount)
println(RefundDealerTaxAmount)

sheet.getRow(90-1).createCell(3-1).setCellValue(DealerFixedAmountAfterTax)
println(DealerFixedAmountAfterTax)

sheet.getRow(100-1).createCell(3-1).setCellValue(LifeInsuranceRate)
println(LifeInsuranceRate)

sheet.getRow(101-1).createCell(3-1).setCellValue(LifeInsuranceCompany)
println(LifeInsuranceCompany)

sheet.getRow(102-1).createCell(3-1).setCellValue(LifeInsurancePremi)
println(LifeInsurancePremi)

sheet.getRow(103-1).createCell(3-1).setCellValue(LifeInsBACCT)
println(LifeInsBACCT)

sheet.getRow(104-1).createCell(3-1).setCellValue(LifeInsBankName)
println(LifeInsBankName)

sheet.getRow(105-1).createCell(3-1).setCellValue(LifeInsBACCTNo)
println(LifeInsBACCTNo)

sheet.getRow(106-1).createCell(3-1).setCellValue(LifeInsuranceAmount)
println(LifeInsuranceAmount)

file.close()

FileOutputStream outFile = new FileOutputStream(new File('D:\\TestDataKatalon\\DisbursementSheetCompare\\Disbursement_Sheet_synch.xlsx'))

workbook.write(outFile)

outFile.close()
