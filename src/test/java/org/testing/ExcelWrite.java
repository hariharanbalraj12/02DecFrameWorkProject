package org.testing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FrameWoks\\exceldatasheets\\Book2.xlsx");

		f.createNewFile();

		Workbook w = new XSSFWorkbook();

		Sheet s = w.createSheet("Sheet1");

		Row r = s.createRow(8);

		Cell c = r.createCell(4);

		c.setCellValue("hari");

		FileOutputStream fOut = new FileOutputStream(f);

		w.write(fOut);
		System.out.println("success");
	}

}
