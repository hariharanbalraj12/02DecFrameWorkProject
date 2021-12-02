package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.utilities.BaseClass;
import org.utilities.FbLaunchPojoClass2;
import org.utilities.FblaunchPojo1;

import com.fasterxml.jackson.databind.exc.ValueInstantiationException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLaunch extends BaseClass {

	public static void main(String[] args) throws IOException {

		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		printTitle();
		printCrntUrl();

		FbLaunchPojoClass2 f = new FbLaunchPojoClass2();

		fillValue(f.getTxtUser(), "Hariharan");
		fillValue(f.getTxtPass(), "Magi@1209");

		driver.navigate().refresh();

		fillValue(f.getTxtUser(), excelData(1, 4));
		fillValue(f.getTxtPass(), excelData(3, 3));

		entBtn(f.getBtnLogin());
	}

}
