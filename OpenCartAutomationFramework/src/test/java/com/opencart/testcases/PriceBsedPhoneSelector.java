package com.opencart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.opencart.page.HomePage;
import com.opencart.page.PhonesPage;

public class PriceBsedPhoneSelector extends HomePage {

	@Test
	public void addingHighPricePhoneToCart() throws InterruptedException {

		PhonesPage phenePage = PageFactory.initElements(driver, PhonesPage.class);
		phenePage.collectPhonePrices();
		String maxPhonePrice = phenePage.getMaxPhonePrice();
		WebElement phoneElementByPrice = phenePage.getPhoneElementByPrice(maxPhonePrice);
		phoneElementByPrice.click();
	}

}
