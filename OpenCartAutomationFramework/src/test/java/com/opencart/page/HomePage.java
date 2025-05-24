package com.opencart.page;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.aventstack.chaintest.service.ChainPluginService;
import com.opencart.utility.BrowserFactory;
import com.opencart.utility.BrowserUtils;

@Listeners(ChainTestListener.class)
public class HomePage {

	public WebDriver driver;

	@BeforeSuite
	public void systemInfo() {

		ChainPluginService.getInstance().addSystemInfo("BrowserName", "chrome");
		ChainPluginService.getInstance().addSystemInfo("Owner Name", "Perumal");
		ChainPluginService.getInstance().addSystemInfo("build version", "V.0.1");

	}

	@BeforeMethod
	public void setupConnections() {

		this.driver = BrowserFactory.launchApplication(driver, "chrome", "https://www.demoblaze.com/index.html");

	}

	@AfterMethod
	public void closeConnecctions(ITestResult screenshot) {

		if (!screenshot.isSuccess() || screenshot.isSuccess()) {

			ChainTestListener.embed(BrowserUtils.takeScreenshot(driver), "image/png");

		}

		BrowserFactory.quitApplication(driver);

	}

}
