package com.opencart.page;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.utility.BrowserFactory;

public class HomePage {

   public WebDriver driver;

	@BeforeMethod
	public void setupConnections() {

		this.driver = BrowserFactory.launchApplication(driver, "chrome", "https://www.demoblaze.com/index.html");

	}

	/*
	 * @AfterMethod public void closeConnecctions() {
	 * 
	 * BrowserFactory.quitApplication(driver);
	 * 
	 * }
	 */

}
