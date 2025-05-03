package com.opencart.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	public static WebDriver launchApplication(WebDriver ldriver, String browserName, String appURl) {

		if (browserName.equals("chrome")) {

			ldriver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			ldriver = new FirefoxDriver();

		} else if (browserName.equals("edge")) {

			ldriver = new EdgeDriver();

		} else {

			System.out.println("We do not support this browser");
		}

		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ldriver.manage().window().maximize();
		ldriver.get(appURl);
		ldriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		return ldriver;

	}

	public static WebDriver quitApplication(WebDriver ldriver) {

		ldriver.quit();

		return ldriver;

	}

}
