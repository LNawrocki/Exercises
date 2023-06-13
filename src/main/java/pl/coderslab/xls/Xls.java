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

/*
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

        String orderNumber = "";
        String idNumber = "";
        String client = "";
        String agent = "";
        String delDate = "";
        String quantity = "";
        String destCountry = "";
        String country = "";
        String delType = "";
        String finalDest = "";
        String additionalInfo = "";


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

//                System.out.print(cell.getStringCellValue() + "\t");
                String cellContent = cell.getStringCellValue();

                if (cellContent.contains("ORDER")) {
                    orderNumber = cellContent.split(" / ")[cellContent.split(" / ").length-1];
                }
                if (cellContent.contains("ID:")) {
                    idNumber = cellContent.split(":")[cellContent.split(":").length-1];
                }
                if (cellContent.contains("Client:")) {
                    client = cellContent.split(":")[cellContent.split(":").length-1];
                }
                if (cellContent.contains("Agent:")) {
                    agent = cellContent.split(":")[cellContent.split(":").length-1];
                }
                if (cellContent.contains("delDate:")) {
                    delDate = cellContent.split(":")[cellContent.split(":").length-1];
                }
                if (cellContent.contains("Quantity:")) {
                    quantity = cellContent.split(":")[cellContent.split(":").length-1];
                }
                if (cellContent.contains("Country:")) {
                    country = cellContent.split(":")[cellContent.split(":").length-1];
                }

                if (cellContent.contains("Delivery:")) {
                    delType = cellContent.split(":")[cellContent.split(":").length-1];
                }
                if (cellContent.contains("Final Dest.:")) {
                    finalDest = cellContent.split(":")[cellContent.split(":").length-1];
                }

                if (cell.getRowIndex() == 8 && cell.getColumnIndex() == 1 && !cellContent.equals("Pos.") ) {
                    additionalInfo = cell.getStringCellValue();
                } else {
                    additionalInfo = "puste";
                }
           }


//            String orderNumber = "";
//            String idNumber = "";
//            String client = "";
//            String agent = "";
//            String delDate = "";
//            String quantity = "";
//            String country = "";
//            String delType = "";
//            String finalDest = "";

        }
        System.out.println("orderNumber = " + orderNumber);
        System.out.println("idNumber = " + idNumber);
        System.out.println("client = " + client);
        System.out.println("agent = " + agent);
        System.out.println("delDate = " + delDate);
        System.out.println("quantity = " + quantity);
        System.out.println("destCountry = " + country);
        System.out.println("delType = " + delType);
        System.out.println("finalDest = " + finalDest);
        System.out.println("additionalInfo = " + additionalInfo);
    }
}

 */
