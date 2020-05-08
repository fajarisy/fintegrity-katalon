import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.DecimalFormat as DecimalFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

DecimalFormat df2 = new DecimalFormat('#.##')

WebDriver driver = DriverFactory.getWebDriver()

'Contrtact No'
ContractNo = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/ContractNumber'))
println("ContractNo: " + ContractNo)

'Credit Type'
CreditType = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/CreditType'))
println("CreditType: " + CreditType)

'Insurance Type'
switch (true) {
    case WebUI.verifyElementChecked(findTestObject('Object Repository/DisbursementSheetCompare/ExdtractDisburseValueObjects/InsTypeRadioBtnPAIAD'), 
        15, FailureHandling.OPTIONAL):
        InsuranceType = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsTypeLabelPAIAD'))
        println("InsuranceType: "+InsuranceType)

        break
    case WebUI.verifyElementChecked(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsTypeRadioBtnNet'), 
        15, FailureHandling.OPTIONAL):
        InsuranceType = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsTypeLabelNet'))
        println("InsuranceType: "+InsuranceType)

        break
    case WebUI.verifyElementChecked(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsTypeRadioBtnCAPITAL'), 
        15, FailureHandling.OPTIONAL):
        InsuranceType = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsTypeLabelCAPITAL'))

        println("InsuranceType: "+InsuranceType)

        break
    case WebUI.verifyElementChecked(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsTypeRadioBtnYearly'), 
        15, FailureHandling.OPTIONAL):
        InsuranceType = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsTypeLabelYearly'))

        println("InsuranceType: "+InsuranceType)

        break
}

'Facility_Package'
FacilityPackage = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/PackageValue')).substring(2)
println("FacilityPackage: "+FacilityPackage)

'Facility_Date'
String ComDate = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/Date'))
println("ComDate: "+ComDate)

String OLD_FORMAT = 'dd/MM/yyyy'

String NEW_FORMAT = 'dd MMMM yyyy'

String OldDateString = ComDate

String NewComDate

SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT)

Date d = sdf.parse(OldDateString)

sdf.applyPattern(NEW_FORMAT)

NewComDate = sdf.format(d)

println("NewComDate: "+NewComDate)

'Name of Borrower'
NameofBorrower = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/Name'))
println("NameofBorrower: "+NameofBorrower)

'Term of Lease'
TermofLeaseRaw = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/TermofLease'), 'value')
TermofLease = (TermofLeaseRaw + ' Months')
println('Term of Lease: ' + TermofLease)

'Mode of Payment (Payment Freq & Payment Indicator)'
PaymentFreq = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/PaymentFreq'), 'value')
println("PaymentFreq: "+PaymentFreq)

PaymentIndicator = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/PaymentIndicator'))
println("PaymentIndicator: "+PaymentIndicator)

PaymentMethod = ((PaymentFreq + ' - in ') + PaymentIndicator)
println("PaymentMethod: "+PaymentMethod)

'Interest Rate'
InterestRateRaw = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InterestRate'))
InterestRate = (InterestRateRaw.substring(0, 4) + ' %')
println("InterestRate: "+InterestRate)

'Subsidy Interest Rate'
SubInterestRateRaw = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InterestRateSubsidy'))
SubInterestRate = (SubInterestRateRaw.substring(0, 4) + ' %')
println("SubInterestRate: "+SubInterestRate)

'RateType'
RateType = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/RateType'))
println("RateType: "+RateType)

'FreqGracePeriod'
FreqGracePeriod = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/FreqGracePeriod'))
println("FreqGracePeriod: "+FreqGracePeriod)

'LifeInsurance'
LifeInsurance = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/LifeInsurance'))
println("LifeInsurance: "+LifeInsurance)

'Cost of Goods'
AcquisitionAmmount = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/AcquisitionAmount'), 'value')
println("AcquisitionAmmount: "+AcquisitionAmmount)

'Less Down Payment'
DownPayment = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/DownPayment'), 'value')
println("DownPayment: "+DownPayment)

'Approved Proposal Amount'
FinancingAmount = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/AppvdProposalAmount'))
println("FinancingAmount: "+FinancingAmount)

'Residual Value'
ResidualValue = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/ResidualValue'))
println("ResidualValue: "+ResidualValue)

'Subsidy ATPM'
SubsidyATPM = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/SubsidyATPM')).toString().substring(0, 4)
println("SubsidyATPM: "+SubsidyATPM)

'Disbursedto'
SupplierName = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/SupplierName'))
println("SupplierName: "+SupplierName)

'Insurance Company'
InsuranceCompanyRaw = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/InsuranceCompany'))
InsuranceCompany = InsuranceCompanyRaw.substring(2)
println("InsuranceCompany: "+InsuranceCompany)

/*======================== Life Insurance Company ==========================*/
println('=================================== Life Insurance Company ======================================')

'ExcessInsurance'
ExcessInsurance = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/ExcessInsurance'))
println("ExcessInsurance: "+ExcessInsurance)

'ExcessInsurancePercent'
ExcessInsurancePercent = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/ExcessInsurancePercent'), 'value')
println("ExcessInsurancePercent: "+ExcessInsurancePercent)

/*if(ExcessInsurancePercent != null || ExcessInsurancePercent != ""){
 ExcessInsurancePercent.substring(0, 3)
 println(ExcessInsurancePercent)
 }*/
'First Installment'
WebElement Table = driver.findElement(By.xpath('//*[@id="frmMain:j_id541:tb"]'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> Rows = Table.findElements(By.tagName('tr'))
println('No. of rows: ' + Rows.size())

// Iterate row table
println(PaymentIndicator)

FirstInstallment = ''

if (PaymentIndicator == 'Arrear') {
    for (int i = 0; i < Rows.size(); i++) {
        'To locate columns(cells) of that specific row'
        List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

        'Verifying the expected text in the each cell'
        if (Cols.get(0).getText().equalsIgnoreCase('0')) {
            'To locate anchor in the expected value matched row to perform action'
            FirstInstallment = Cols.get(5).getText()

            println('FirstInstallment: ' + FirstInstallment)

            break
        }
    }
} else if (PaymentIndicator == 'Advance') {
    for (int i = 0; i < Rows.size(); i++) {
        'To locate columns(cells) of that specific row'
        List<WebElement> Cols = Rows.get(i).findElements(By.tagName('td'))

        'Verifying the expected text in the each cell'
        if (Cols.get(0).getText().equalsIgnoreCase('1')) {
            'To locate anchor in the expected value matched row to perform action'
            FirstInstallment = Cols.get(5).getText()

            println('FirstInstallment: ' + FirstInstallment)

            break
        }
    }
}

'Fee'
PolicyFee = ''

FiduciaFee = ''

DealerFixedAmount = ''

WebElement TableFee = driver.findElement(By.xpath('//*[@id="frmMain:pnlFee"]/fieldset/table/tbody'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> RowsFee = TableFee.findElements(By.tagName('tr'))

println('No. of rows: ' + RowsFee.size())

for (int i = 0; i < RowsFee.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> ColsFee = RowsFee.get(i).findElements(By.tagName('td'))

    'Verifying the expected text in the each cell'
    if (ColsFee.get(0).getText().contains('Policy')) {
        'To locate anchor in the expected value matched row to perform action'
        PolicyFee = ColsFee.get(3).getText()
        println("PolicyFee: "+PolicyFee)

        break
    }
}

for (int i = 0; i < RowsFee.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> ColsFee = RowsFee.get(i).findElements(By.tagName('td'))

    'Verifying the expected text in the each cell'
    if (ColsFee.get(0).getText().contains('Fiducia')) {
        'To locate anchor in the expected value matched row to perform action'
        FiduciaFee = ColsFee.get(3).getText()

        println("FiduciaFee: " + FiduciaFee)

        break
    }
}

WebElement TableRefund = driver.findElement(By.xpath('//*[@id="frmMain:dtIntroducer:tb"]'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> RowsRefund = TableRefund.findElements(By.tagName('tr'))

println('No. of rows: ' + RowsRefund.size())

for (int i = 0; i < RowsRefund.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> ColsRefund = RowsRefund.get(i).findElements(By.tagName('td'))
	println(ColsRefund.get(2).getText())
    'Verifying the expected text in the each cell'
    if (ColsRefund.get(2).getText().contains('DEALER')) {
        'To locate anchor in the expected value matched row to perform action'

        'Dealer Fixed Amount'
        DealerFixedAmount = ColsRefund.get(11).getText()
		println('DealerFixedAmount: ' + DealerFixedAmount)
        
		'Dealer Legal Name'
		DealerLegalName = ColsRefund.get(3).getText()
		println('DealerLegalName: ' + DealerLegalName)
		
		'Refund Dealer Bank'
		DealerBankName = ColsRefund.get(6).getText()
		println('DealerBankName: ' + DealerBankName)
		
		'Refund Dealer Bank Branch'
		DealerBankBranch = ColsRefund.get(7).getText().substring(5)
		println('BankBranch: ' + DealerBankBranch)
		
		'Refund Dealer Bank+Branch'
		DealerBankNamePlusBranch = DealerBankName+"-" + DealerBankBranch
		println('DealerBankNamePlusBranch: ' + DealerBankNamePlusBranch)
		
		'Dealer Tax'
		RefundDealerTaxAmount = ColsRefund.get(12).getText()
		println('RefundDealerTaxAmount: ' + RefundDealerTaxAmount)
		
		'Dealer Fixed Amount After Tax'
        DealerFixedAmountAfterTax = ColsRefund.get(13).getText()
		println('DealerFixedAmountAfterTax: ' + DealerFixedAmountAfterTax)
		
		'Dealer Account Bank No'
        DealerAcNo = ColsRefund.get(9).getText()
		println('DealerAcNo: ' + DealerAcNo)
        
		'Dealer Commission/AmmountAfterDiscount'
		DealerCommission = ColsRefund.get(15).getText()
		println('DealerCommission: ' + DealerCommission)
		
		break;
    } 
}

for (int i = 0; i < RowsRefund.size(); i++) {
	List<WebElement> ColsRefund = RowsRefund.get(i).findElements(By.tagName('td'))
	println(ColsRefund.get(2).getText())
	if (ColsRefund.get(2).getText().equalsIgnoreCase('SALES')) {
        'Sales Refund Receiver'
        RefundReceiverType = ColsRefund.get(2).getText()
        println('Rec: ' + RefundReceiverType)

        'Receiver Name'
        ReceiverName = ColsRefund.get(3).getText()
        println('ReceiverName: ' + ReceiverName)

        'BankName'
        BankName = ColsRefund.get(6).getText()
        println('BankName: ' + BankName)

        'AcNoSales'
        AcNoSales = ColsRefund.get(9).getText()
        println('A/c No: ' + AcNoSales)

        'Commission'
        Commission = ColsRefund.get(11).getText()
        println('Commission Amount: ' + Commission)

        'Tax%'
        SalesRefundTax = ColsRefund.get(12).getText()
        println('Tax%: ' + SalesRefundTax)

        'Tax Amount Refund Sales'
        SalesRefundTaxAmount = ColsRefund.get(13).getText()
        println('TaxAmount: ' + SalesRefundTaxAmount)

        'Commission After Tax'
        CommissionAfterTax = ColsRefund.get(15).getText()
        println('Amount after tax: ' + CommissionAfterTax)

        break;
    }
} 

'Life Insurance Rate'
LifeInsuranceRateRaw = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/LifeInsuranceRate'))
ExtractInsuranceRate = LifeInsuranceRateRaw.replaceAll('[^0-9.]', '')
LifeInsuranceDouble = Double.parseDouble(ExtractInsuranceRate)
LifeInsuranceRate = (df2.format(LifeInsuranceDouble) + ' %' /*Default rounding half_even*/ )
println('LifeInsuranceRate: ' + LifeInsuranceRate)

'Life Insurance Company'
LifeInsuranceCompanyRaw = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/LifeInsuranceCompany'))
LifeInsuranceCompany = LifeInsuranceCompanyRaw.substring(2)
println('LifeInsuranceCompany: ' + LifeInsuranceCompany)

'Life Insurance Premi'
LifeInsurancePremi = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/LifeInsurancePremi'))
println('LifeInsurancePremi: ' + LifeInsurancePremi)


'Life Insurance Table'
WebElement TableLifeIns = driver.findElement(By.xpath('//*[@id="frmMain:dtLifeIns:tb"]'))
//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> RowsLifeIns = TableLifeIns.findElements(By.tagName('tr'))
println('No. of rows: ' + RowsLifeIns.size())
for (int i = 0; i < RowsLifeIns.size(); i++) {
	'To locate columns(cells) of that specific row'
	List<WebElement> ColsLifeIns = RowsLifeIns.get(i).findElements(By.tagName('td'))
	
	'Verifying the expected text in the each cell'
	if (ColsLifeIns.get(0).getText().equalsIgnoreCase(LifeInsuranceCompany)) {
		
		'Life insurance BANK Name'
		LifeInsBankName = ColsLifeIns.get(3).getText()
		println(LifeInsBankName)
		
		'Life Insurance Amount'
		LifeInsuranceAmount = ColsLifeIns.get(6).getText()
		println(LifeInsuranceAmount)
		
		break
	}
}

'LifeInsBACCT'
LifeInsBACCT = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/LifeInsuranceBankAcctName'), 'value')
println(LifeInsBACCT)

'LifeInsBACCTNo'
LifeInsBACCTNo = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/LifeInsuranceCompanyBankAccount'), 'value')
println(LifeInsBACCTNo)

'DisburseAmount'
DisburseAmount = (WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractDisburseValueObjects/DisburseAmount')))
println('DisburseAmount: ' + DisburseAmount)

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/Extractor/WritetoExcelDisbursement'), [('CreditType') : CreditType, ('InsuranceType') : InsuranceType
        , ('FacilityPackage') : FacilityPackage, ('ComDate') : ComDate, ('NameofBorrower') : NameofBorrower, ('TermofLease') : TermofLease
        , ('PaymentMethod') : 	PaymentMethod, ('InterestRate') : InterestRate, ('SubInterestRate') : SubInterestRate, ('RateType') : RateType
        , ('FreqGracePeriod') : FreqGracePeriod, ('LifeInsurance') : LifeInsurance, ('AcquisitionAmmount') : AcquisitionAmmount
        , ('DownPayment') : DownPayment, ('FinancingAmount') : FinancingAmount, ('ResidualValue') : ResidualValue, ('SubsidyATPM') : SubsidyATPM
        , ('SupplierName') : SupplierName, ('InsuranceCompany') : InsuranceCompany
        , ('ExcessInsurance') : ExcessInsurance, ('ExcessInsurancePercent') : ExcessInsurancePercent, ('FirstInstallment') : FirstInstallment
        , ('PolicyFee') : PolicyFee, ('FiduciaFee') : FiduciaFee, ('DealerFixedAmount') : DealerFixedAmount, ('RefundDealerTaxAmount') : RefundDealerTaxAmount
        , ('DealerFixedAmountAfterTax') : DealerFixedAmountAfterTax, ('DealerAcNo') : DealerAcNo, ('RefundReceiverType') : RefundReceiverType
        , ('ReceiverName') : ReceiverName, ('BankName') : BankName, ('AcNoSales') : AcNoSales, ('Commission') : Commission
        , ('SalesRefundTax') : SalesRefundTax, ('SalesRefundTaxAmount') : SalesRefundTaxAmount, ('CommissionAfterTax') : CommissionAfterTax
		, ('BankPaidTo') : DealerBankNamePlusBranch,('DealerBankName') : DealerBankName, ('DisburseAmount') : DisburseAmount, ('DealerCommission') : DealerCommission,('DealerLegalName') : DealerLegalName,
		, ('LifeInsuranceRate') : LifeInsuranceRate,('LifeInsuranceCompany') : LifeInsuranceCompany, ('LifeInsurancePremi') : LifeInsurancePremi, ('LifeInsBACCT') : LifeInsBACCT
		, ('LifeInsBACCTNo') : LifeInsBACCTNo, ('LifeInsBankName') : LifeInsBankName, ('LifeInsuranceAmount') : LifeInsuranceAmount, ('ContractNo') : ContractNo], FailureHandling.STOP_ON_FAILURE)

