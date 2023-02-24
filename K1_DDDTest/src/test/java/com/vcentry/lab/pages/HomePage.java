package com.vcentry.lab.pages;

import com.vcentry.lab.initializer.ElementFinder;

public class HomePage {

	public static void clickFrameworkForm() {
		ElementFinder.findById("HOMEPAGE_CLICK_FRAMEWORKFORM_ID").click();

	}

	public static void clickSimpleForm() {
		ElementFinder.findById("HOMEPAGE_CLICK_SIMPLEFORM_ID").click();

	}
	public static void clickLogout() {
		ElementFinder.findByLinkText("HOMEPAGE_CLICK_LOGOUT_LINKTEXT").click();
	}
}
