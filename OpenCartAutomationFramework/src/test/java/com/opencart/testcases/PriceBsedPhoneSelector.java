package com.opencart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.opencart.page.HomePage;
import com.opencart.page.PhonesPage;
import com.opencart.page.StorePage;

public class PriceBsedPhoneSelector extends HomePage {

	@Test
	public void addingHighPricePhoneToCart() throws InterruptedException {

		PhonesPage phenePage = PageFactory.initElements(driver, PhonesPage.class);
		phenePage.collectPhonePrices();
		String maxPhonePrice = phenePage.getMaxPhonePrice();
		WebElement phoneElementByMaxPrice = phenePage.getPhoneElementByPrice(maxPhonePrice);
		phoneElementByMaxPrice.click();
		StorePage storePage = PageFactory.initElements(driver, StorePage.class);
		storePage.maxMobilePriceAddCart();
	}

	@Test
	public void addingLowPricePhoneTocart() throws InterruptedException {

		PhonesPage phenePage = PageFactory.initElements(driver, PhonesPage.class);
		phenePage.collectPhonePrices();
		String minPhonePrice = phenePage.getMinPhonePrice();
		WebElement phoneElementByMinPrice = phenePage.getPhoneElementByPrice(minPhonePrice);
		phoneElementByMinPrice.click();
		StorePage storePage = PageFactory.initElements(driver, StorePage.class);
		storePage.minMobilePriceAddCart();

	}

}
