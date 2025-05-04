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
		WebElement phoneElementByMaxPrice = phenePage.getPhoneElementByPrice(maxPhonePrice);
		phoneElementByMaxPrice.click();
	}

	@Test
	public void addingLowPricePhoneTocart() throws InterruptedException {

		PhonesPage phenePage1 = PageFactory.initElements(driver, PhonesPage.class);
		phenePage1.collectPhonePrices();
		String minPhonePrice = phenePage1.getMinPhonePrice();
		WebElement phoneElementByMinPrice = phenePage1.getPhoneElementByPrice(minPhonePrice);
		phoneElementByMinPrice.click();

	}

}
