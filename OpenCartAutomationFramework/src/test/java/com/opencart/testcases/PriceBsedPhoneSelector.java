package com.opencart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.opencart.page.HomePage;
import com.opencart.page.PhonesPage;

public class PriceBsedPhoneSelector extends HomePage {

	@Test
	public void addingHighPricePhoneToCart() throws InterruptedException {

		PhonesPage phenePage = PageFactory.initElements(driver, PhonesPage.class);
		phenePage.clickOnPhoneField();

	}

}
