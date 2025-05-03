package com.opencart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesPage {

	WebDriver driver;

	public PhonesPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(xpath = "//a[text()='Phones']")
	WebElement phoneIcon;

	public void clickOnPhoneField() throws InterruptedException {

		Thread.sleep(5000);

		phoneIcon.click();
	}

}
