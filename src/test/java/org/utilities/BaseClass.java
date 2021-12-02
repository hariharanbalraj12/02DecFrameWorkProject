package org.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void winMax() {
		driver.manage().window().maximize();
	}

	public static void printTitle() {
		String s = driver.getTitle();
		System.out.println(s);
	}

	public static void printCrntUrl() {
		String s = driver.getCurrentUrl();
		System.out.println(s);
	}

	public static void fillValue(WebElement ref, String value) {
		ref.sendKeys(value);
	}

	public static void viewValue(WebElement ref) {
		String s = ref.getAttribute("value");
		System.out.println(s);

	}

	public static void entBtn(WebElement ref) {
		ref.click();

	}

	public static String excelData(int rownumber, int cellnumber) throws IOException {

		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\FrameWoks\\exceldatasheets\\Book1.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("Sheet1");

		Row r = s.getRow(rownumber);

		Cell c = r.getCell(cellnumber);

		int cellType = c.getCellType();

		String value = "";

		if (cellType == 1) {

			value = c.getStringCellValue();

		} else if (cellType == 0) {

			if (DateUtil.isCellDateFormatted(c)) {

				Date d = c.getDateCellValue();

				SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yyyy");
				value = sim.format(d);

			} else {
				double numCelVal = c.getNumericCellValue();

				long l = (long) numCelVal;
				value = String.valueOf(l);

			}
			

		}
		return value;

	}
	private void hariMani() {
		System.out.println("Hariharan");

	}

}
