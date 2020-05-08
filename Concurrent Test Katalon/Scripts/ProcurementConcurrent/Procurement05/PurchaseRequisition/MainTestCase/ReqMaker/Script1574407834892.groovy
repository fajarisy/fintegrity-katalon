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

not_run: WebUI.callTestCase(findTestCase('LoginLogout/Login'), [('username') : ReqMaker, ('isOpenBrowser') : false, ('finPass') : 'Mbf137??'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ProcurementConcurrent/Procurement05/PurchaseRequisition/HomeTaskandMenu/MainMenuPurchaseRequisition/SelectMenuPurchaseRequisition'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ProcurementConcurrent/Procurement05/PurchaseRequisition/PurchaseRequisitionForm/PurchaseRequisitionHeader/PurchaseRequisitionHeader'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ProcurementConcurrent/Procurement05/PurchaseRequisition/PurchaseRequisitionForm/PurchaseRequisitionItem/PurchaseRequisitionItem'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)

WebUI.callTestCase(findTestCase('Procurement/FloatingButtons/SaveButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToDefaultContent()

WebUI.waitForElementVisible(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRForm/PRNo'), 90)

PRno = WebUI.getText(findTestObject('Object Repository/Procurement/PurchaseRequisition/PRForm/PRNo'))

FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\Procurement\\_tmp5.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('PRno')

int row = sheet.getLastRowNum()

println(sheet.getRow(row).getCell(0))

while (sheet.getRow(row).getCell(0) != null) {
    sheet.createRow(row + 1)

    row++

    sheet.getRow(row).createCell(0).setCellValue(PRno)

    break
}

file.close()

FileOutputStream outFile = new FileOutputStream(new File('D:\\TestDataKatalon\\Procurement\\_tmp5.xlsx'))

workbook.write(outFile)

outFile.close()

WebUI.callTestCase(findTestCase('Procurement/FloatingButtons/SendNextButton'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15)


