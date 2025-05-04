package com.opencart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StorePage {

	WebDriver driver;

	public StorePage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(xpath = "//h3[@class='price-container']/following::a")
	WebElement addToCart;

	public void maxMobilePriceAddCart() {

		addToCart.click();

	}

	public void minMobilePriceAddCart() {

		addToCart.click();

	}

}
