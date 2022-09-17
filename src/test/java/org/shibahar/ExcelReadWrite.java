package org.shibahar;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadWrite {


    @Test
    public void ExcelRead() throws IOException {

        FileInputStream fis = new FileInputStream("/Users/snagarajan/Documents/SeleniumBasics/src/test/java/Test/testexcel.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet hs = wb.getSheet("sheet1");

        Row row=        hs.getRow(0);

        Cell cell=row.getCell(0);

        System.out.println(hs.getRow(0).getCell(0));

        int lastRow = hs.getLastRowNum();
        for(int i=0; i<=lastRow; i++){
            Row row1 = hs.getRow(i);
            Cell cell1 = row.createCell(2);

            cell.setCellValue("WriteintoExcel");

        }

        FileOutputStream fos = new FileOutputStream("/Users/snagarajan/Documents/SeleniumBasics/src/test/java/Test/testexcel.xlsx");
        wb.write(fos);
        fos.close();

    }
}
