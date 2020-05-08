import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'BusinessType'
BusinessType = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/Occupation'))

println('BusinessType: ' + BusinessType)

// Select Last Of Row in Table Address
WebDriver driver = DriverFactory.getWebDriver()

//'To locate table'
WebElement TableAddress = driver.findElement(By.xpath('//*[@id="frmMain:tblAddress:tb"]'))

//'To locate rows of table it will Capture all the rows available in the table '
List<WebElement> RowsIdAddress = TableAddress.findElements(By.tagName('tr'))

println('No. of rows: ' + RowsIdAddress.size())

// Iterate row table
for (int i = 0; i < RowsIdAddress.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = RowsIdAddress.get(i).findElements(By.tagName('td'))

    println(Cols.get(0).getText())

    'Verifying the expected text in the each cell'
    if (Cols.get(0).getText().equalsIgnoreCase('ID ADDRESS')) {
        'To locate anchor in the expected value matched row to perform action'
        Cols.get(4).findElement(By.tagName('a')).click()

        break
    }
}

AddressMain = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/Address'), 
    'value', FailureHandling.STOP_ON_FAILURE)

RTMain = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressRT'), 
    'value', FailureHandling.STOP_ON_FAILURE)

RWMain = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressRW'), 
    'value', FailureHandling.STOP_ON_FAILURE)

/*================================= Desa ===================================================*/
IdDesaMain = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressDesa'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println('IdDesa :' + IdDesaMain)

TestObject ExtractMainDesaValue = findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressDesaText')

ExtractMainDesaValue.addProperty('xpath', ConditionType.EQUALS, ('//*[@id="frmMain:cmbSubDistrict"]/option[@value=' + IdDesaMain) + 
    ']', true)

DesaMain = WebUI.getText(ExtractMainDesaValue)

println(DesaMain)

/*===========================================================================================*/
/*================================= Kecamatan ===================================================*/
'Buat Var. IdKecamatan & Ambil ID Kecamatan yang ada pada test objeck kecamatan'
IdKecamatanMain = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressKecamatan'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println('idKecamatan :' + IdKecamatanMain)

'Buat Test Object Kecamatan dengan Xpath mapping id kecamatan->label kecamatan'
TestObject ExtractKecamatanValue = findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressKecText')

ExtractKecamatanValue.addProperty('xpath', ConditionType.EQUALS, ('//*[@id="frmMain:cmbDistrict"]/option[@value=' + IdKecamatanMain) + 
    ']', true)

KecamatanMain = WebUI.getText(ExtractKecamatanValue)

println(KecamatanMain)

/*====================================================================================*/
/*====================================== Kabupaten ==============================================*/
IdKabupatenMain = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressKab'), 
    'value', FailureHandling.STOP_ON_FAILURE)

println('IdDesa :' + IdKabupatenMain)

TestObject ExtractMainKabValue = findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressKabText')

ExtractMainKabValue.addProperty('xpath', ConditionType.EQUALS, ('//*[@id="frmMain:cmbCity"]/option[@value=' + IdKabupatenMain) + 
    ']', true)

KabupatenMain = WebUI.getText(ExtractMainKabValue)

println(KabupatenMain)

/*====================================================================================*/
ZIPCodeMain = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressZIPCode'))

'ID Address'
IdAddress = ((((((((((((AddressMain + ' RT/RW : ') + RTMain) + '/') + RWMain) + ' DESA ') + DesaMain) + ' Kec. ') + KecamatanMain) + 
' KAB. ') + KabupatenMain) + ' ') + ZIPCodeMain)

println('ID Address: ' + IdAddress)

'Telephone No Id Address'
PhoneIdAddress = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMobph'), 
    FailureHandling.OPTIONAL)

println('PhoneIdAddress: ' + PhoneIdAddress)

'Close Iframe Id Address'
WebUI.click(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressCloseIframe'))

'Mailing Address'
for (int i = 0; i < RowsIdAddress.size(); i++) {
    'To locate columns(cells) of that specific row'
    List<WebElement> Cols = RowsIdAddress.get(i).findElements(By.tagName('td'))

    'Verifying the expected text in the each cell'
    if (Cols.get(0).getText().equalsIgnoreCase('MAILING ADDRESS')) {
        'To locate anchor in the expected value matched row to perform action'
        Cols.get(4).findElement(By.tagName('a')).click()

        AddressMail = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMail'), 
            'value', FailureHandling.STOP_ON_FAILURE)

        RTMail = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMailRT'), 
            'value', FailureHandling.STOP_ON_FAILURE)

        RWMail = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMailRW'), 
            'value', FailureHandling.STOP_ON_FAILURE)

        /*================================= Desa ===================================================*/
        IdDesaMail = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMailDesa'), 
            'value', FailureHandling.STOP_ON_FAILURE)

        println('IdDesa :' + IdDesaMail)

        TestObject ExtractMailDesaValue = findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressDesaText')

        ExtractMailDesaValue.addProperty('xpath', ConditionType.EQUALS, ('//*[@id="frmMain:cmbSubDistrict"]/option[@value=' + 
            IdDesaMail) + ']', true)

        DesaMail = WebUI.getText(ExtractMailDesaValue)

        println(DesaMail)

        /*===========================================================================================*/
        /*================================= Kecamatan ===================================================*/
        'Buat Var. IdKecamatan & Ambil ID Kecamatan yang ada pada test objeck kecamatan'
        IdKecamatanMail = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMailKecamatan'), 
            'value', FailureHandling.STOP_ON_FAILURE)

        println('idKecamatan :' + IdKecamatanMail)

        'Buat Test Object Kecamatan dengan Xpath mapping id kecamatan->label kecamatan'
        TestObject ExtractMailKecamatanValue = findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMailKecamatanText')

        ExtractMailKecamatanValue.addProperty('xpath', ConditionType.EQUALS, ('//*[@id="frmMain:cmbDistrict"]/option[@value=' + 
            IdKecamatanMail) + ']', true)

        KecamatanMail = WebUI.getText(ExtractMailKecamatanValue)

        println(KecamatanMail)

        /*====================================================================================*/
        /*====================================== Kabupaten ==============================================*/
        IdKabupatenMail = WebUI.getAttribute(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMailKab'), 
            'value', FailureHandling.STOP_ON_FAILURE)

        println('IdDesa :' + IdKabupatenMail)

        TestObject ExtractMailKabValue = findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressMailKabText')

        ExtractMailKabValue.addProperty('xpath', ConditionType.EQUALS, ('//*[@id="frmMain:cmbCity"]/option[@value=' + IdKabupatenMail) + 
            ']', true)

        KabupatenMail = WebUI.getText(ExtractMailKabValue)

        println(KabupatenMail)

        /*====================================================================================*/
        ZIPCodeMail = WebUI.getText(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressZIPCode'))

        MailAddressFull = ((((((((((((AddressMail + ' RT/RW : ') + RTMail) + '/') + RWMail) + ' DESA ') + DesaMail) + ' Kec. ') + 
        KecamatanMail) + ' KAB. ') + KabupatenMail) + ' ') + ZIPCodeMail)

        println('MailAddressFull: ' + MailAddressFull)

        'Close Iframe Mail Address'
        WebUI.click(findTestObject('Object Repository/DisbursementSheetCompare/ExtractCDBValueObject/AddressCloseIframe'))

        break
    }
}

WebUI.callTestCase(findTestCase('DisbursementSheetCompare/Extractor/WritetoExcelCDB'), [('BusinessType') : BusinessType, ('IdAddress') : IdAddress
        , ('MailAddressFull') : MailAddressFull, ('PhoneIdAddress') : PhoneIdAddress], FailureHandling.STOP_ON_FAILURE)

