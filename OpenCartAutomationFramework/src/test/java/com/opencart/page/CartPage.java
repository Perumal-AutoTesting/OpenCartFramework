package com.opencart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(xpath = "//tr[@class='success']//a[text()='Delete']")
	WebElement deleteSamsungGalaxyProduct;

	public void deleteSamsunProductFromCart() {

		deleteSamsungGalaxyProduct.click();

	}

}
