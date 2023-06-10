package pl.coderslab.xls;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Xls {
    public static void main(String[] args) throws IOException {

        File myFile = new File("UK-C-0028.xls");
        FileInputStream fis = new FileInputStream(myFile);
        // Finds the workbook instance for XLSX file
        HSSFWorkbook myWorkBook = new HSSFWorkbook(fis);
        // Return first sheet from the XLSX workbook
        HSSFSheet mySheet = myWorkBook.getSheetAt(0);
        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = mySheet.iterator();
        // Traversing over each row of XLSX file
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            // For each row, iterate through each columns
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
//                System.out.println(cell.getCellType());
                switch (cell.getCellType()) {
                    case STRING: System.out.print(cell.getStringCellValue() + "\t");
                    break;
//                        case Cell.CELL_TYPE_NUMERIC: System.out.print(cell.getNumericCellValue() + "\t");
//                        break;
//                        case Cell.CELL_TYPE_BOOLEAN: System.out.print(cell.getBooleanCellValue() + "\t");
//                        break;
//                        default :
                        }
            }
            System.out.println("");
        }
    }
}
