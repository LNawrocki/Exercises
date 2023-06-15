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

        File myFile = new File("UK-C-0028-Z9.xls");
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
*/

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
        String quality = "";
        String country = "";
        String delType = "";
        String finalDest = "";
        String additionalInfo = "brak";

        String posNr = "";
        String articleCode = "";
        String pcs = "";
        String unit = "";
        String additionalInformation = "";

        boolean posFlag = false;


        File myFile = new File("UK-C-0028-Z9.xls");
        FileInputStream fis = new FileInputStream(myFile);
        // Finds the workbook instance for XLSX file
        HSSFWorkbook myWorkBook = new HSSFWorkbook(fis);
        // Return first sheet from the XLSX workbook
        HSSFSheet mySheet = myWorkBook.getSheetAt(0);
        // Get iterator to all the rows in current sheet
        Iterator<Row> rowIterator = mySheet.iterator();
        // Traversing over each row of XLSX file
        while (rowIterator.hasNext() ) {
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
                    quality = cellContent.split(":")[cellContent.split(":").length-1];
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
                    rowIterator.next();
                    rowIterator.next();

                    posFlag = true;
                }
                if (cell.getRowIndex() == 8 && cell.getColumnIndex() == 1 && cellContent.equals("Pos.")) {
                    cellIterator.next();
                    posFlag = true;
                }
//                System.out.println(cell.getStringCellValue());



                    if (cell.getColumnIndex() == 1 && posFlag) {
                        posNr = cell.getStringCellValue();
                    }
                    if (cell.getColumnIndex() == 2 && posFlag) {
                        articleCode = cell.getStringCellValue();
                    }
                    if (cell.getColumnIndex() == 3 && posFlag) {
                        pcs = cell.getStringCellValue();
                    }
                    if (cell.getColumnIndex() == 4 && posFlag) {
                        unit = cell.getStringCellValue();
                    }
                    if (cell.getColumnIndex() == 8 && posFlag) {
                        additionalInformation = cell.getStringCellValue();
                    }


           }

            if (posFlag && !(posNr.contains("ORDER") || posNr.contains("Client") || posNr.contains("Agent"))) {
                System.out.print("posNr = " + posNr);
                System.out.print(" articleCode = " + articleCode);
                System.out.print(" pcs = " + pcs);
                System.out.print(" unit = " + unit);
                System.out.println(" additionalInformation = " + additionalInformation);
            }
        }


//        System.out.println("orderNumber = " + orderNumber);
//        System.out.println("idNumber = " + idNumber);
//        System.out.println("client = " + client);
//        System.out.println("agent = " + agent);
//        System.out.println("delDate = " + delDate);
//        System.out.println("quantity = " + quality);
//        System.out.println("destCountry = " + country);
//        System.out.println("delType = " + delType);
//        System.out.println("finalDest = " + finalDest);
//        System.out.println("additionalInfo = " + additionalInfo);
    }
}


