package com.opencart.utility;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {

	public static void handlingAlertPopup(WebDriver ldriver) {

		try {

			ldriver.switchTo().alert().accept();

		} catch (NoAlertPresentException e) {

		}

	}

	public static byte[] takeScreenshot(WebDriver ldriver) {

		return ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.BYTES);

	}

}
