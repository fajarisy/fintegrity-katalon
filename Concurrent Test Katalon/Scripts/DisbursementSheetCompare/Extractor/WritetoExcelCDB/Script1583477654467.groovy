import java.lang.ClassValue.Identity

import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\DisbursementSheetCompare\\Disbursement_Sheet_synch.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('CF Single')

'Id Address'
sheet.getRow(8-1).createCell(3-1).setCellValue(IdAddress)
println(IdAddress)

'Phone Number'
sheet.getRow(11-1).createCell(3-1).setCellValue(PhoneIdAddress)
println(PhoneIdAddress)

'MailAddressFull'
sheet.getRow(12-1).createCell(3-1).setCellValue(MailAddressFull)
println(MailAddressFull)

'Business Type'
sheet.getRow(13-1).createCell(3-1).setCellValue(BusinessType)
println(BusinessType)

file.close()

FileOutputStream outFile = new FileOutputStream(new File('D:\\TestDataKatalon\\DisbursementSheetCompare\\Disbursement_Sheet_synch.xlsx'))

workbook.write(outFile)

outFile.close()
