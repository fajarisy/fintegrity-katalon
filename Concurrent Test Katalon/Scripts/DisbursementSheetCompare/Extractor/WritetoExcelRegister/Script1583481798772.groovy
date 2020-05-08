import java.lang.ClassValue.Identity

import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook


FileInputStream file = new FileInputStream(new File('D:\\TestDataKatalon\\DisbursementSheetCompare\\Disbursement_Sheet_synch.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheet('CF Single')

'BPKB Name'
sheet.getRow(9-1).createCell(3-1).setCellValue(BPKB_Name)
println(BPKB_Name)

'Description of Goods'
sheet.getRow(15-1).createCell(3-1).setCellValue(DescriptionofGoods)
println(DescriptionofGoods)

'Chassis No'
sheet.getRow(16-1).createCell(3-1).setCellValue(ChassisNo)
println(ChassisNo)

'Engine No'
sheet.getRow(17-1).createCell(3-1).setCellValue(EngineNo)
println(EngineNo)

file.close()

FileOutputStream outFile = new FileOutputStream(new File('D:\\TestDataKatalon\\DisbursementSheetCompare\\Disbursement_Sheet_synch.xlsx'))

workbook.write(outFile)

outFile.close()
