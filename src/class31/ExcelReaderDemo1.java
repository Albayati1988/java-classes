package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;

public class ExcelReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // location of file on the computer
        String path="Files/Book1.xlsx";

        // Navigate to the file
        FileInputStream fileInputStream=new FileInputStream(path);

       XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
       // from the excel file we need to get the sheet first using below method
       XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");
       // as we are interested in the row 1 we pass 1 inside the getrow method
        //rows and  columns are indexed based just like arrays
       Row row=sheet1.getRow(1);
        Cell cell=row.getCell(1);
        System.out.println(cell);


    }
}
