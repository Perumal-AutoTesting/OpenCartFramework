package com.opencart.utility;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {

	public static void handlingAlertPopup(WebDriver ldriver) {

		try {

			ldriver.switchTo().alert().accept();

		} catch (NoAlertPresentException e) {

		}

	}

}
