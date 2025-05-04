package com.opencart.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesPage {

	WebDriver driver;

	public PhonesPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	ArrayList<String> arrayPice = new ArrayList<String>();

	@FindBy(xpath = "//a[text()='Phones']")
	WebElement phoneIcon;

	@FindBy(xpath = "//div[@class='card-block']//h5")
	List<WebElement> priceElements;


	public void collectPhonePrices() throws InterruptedException {

		Thread.sleep(5000);

		phoneIcon.click();

		for (WebElement phonePriceList : priceElements) {

			try {

				String price = phonePriceList.getText().replace(",", " ").trim();
				arrayPice.add(price);

			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
	}

	public String getMaxPhonePrice() {

		return Collections.max(arrayPice);

	}

	public String getMinPhonePrice() {

		return Collections.min(arrayPice);

	}

	public WebElement getPhoneElementByPrice(String price) {

		String maxXpath = "//h5[text()= '" + price + "']/preceding-sibling::h4";
		return driver.findElement(By.xpath(maxXpath));
	}

}
