package org.testing;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FrameWoks\\exceldatasheets\\Book1.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(4);

		Cell c = r.getCell(0);
		
		String stringCellValue = c.getStringCellValue();
		
		  if (stringCellValue.equals("mani")) {
			  
			  c.setCellValue("dhina");
			
		}

		FileOutputStream fo = new FileOutputStream(f);

		w.write(fo);

		System.out.println("success");

	}

}
