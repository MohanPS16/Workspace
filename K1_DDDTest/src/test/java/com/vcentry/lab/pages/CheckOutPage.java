package com.vcentry.lab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.lab.initializer.ElementFinder;

public class CheckOutPage {

	public static void enterProdutName(String data) {
		ElementFinder.findById("CHECKOUT_TYPE_PRODUCTNAME_ID").sendKeys(data);

	}

	public static void enterMobileNumber(String data) {
		ElementFinder.findById("CHECKOUT_TYPE_MOBILE_ID").sendKeys(data);

	}

	public static void enterEmailId(String data) {
		ElementFinder.findById("CHECKOUT_TYPE_EMAIL_ID").sendKeys(data);

	}

	public static void selectProductCat(String data) {
		WebElement dropdown = ElementFinder.findById("CHECKOUT_SELECT_PRODUCTCAT_ID");

		Select s = new Select(dropdown);
		s.selectByVisibleText(data);
	}

	public static void enterProdutQty(String data) {

		ElementFinder.findById("CHECKOUT_TYPE_PRODUCTQTY_ID").sendKeys(data);

	}

	public static void enterPruchaserName(String data) {
		ElementFinder.findById("CHECKOUT_TYPE_PURCHASERNAME_ID").sendKeys(data);

	}

	public static void clickGstYes() {
		ElementFinder.findById("CHECKOUT_CLICK_GSTYES_ID").click();

	}

	public static void clickCOD() {
		ElementFinder.findById("CHECKOUT_CHECK_COD_ID").click();

	}

	public static void clickPlaceOrder() {
		ElementFinder.findById("CHECKOUT_CLICK_PLACEORDER_ID").click();

	}

}
