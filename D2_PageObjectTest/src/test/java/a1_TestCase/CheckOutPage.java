package a1_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.base;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckoutPage;
import pages.LoginPage;

public class CheckOutPage {

	public static void main(String[] args) {
		// readable , reusable, Maintainable
//		WebDriverManager.chromedriver().setup();
//		WebDriver wd= new ChromeDriver();
//		wd.manage().window().maximize();
		WebDriver wd= base.openBrowser();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		LoginPage.enterUserName(wd, "Raghul.ps");
		LoginPage.enterPassword(wd, "shanthip02");
		LoginPage.clickLoginButton(wd);
		
		
		CheckoutPage.simpleFormPage(wd);
		CheckoutPage.enterProductName(wd, "Samsung");
		CheckoutPage.enterMobileName(wd, "Samsung J-2");
		CheckoutPage.enterEmailId(wd, "psrahul24@gmail.com");
		CheckoutPage.selectProductCategory(wd, "Electrical");
		CheckoutPage.enterProductQuantity(wd, "3");
		CheckoutPage.enterPurchaserName(wd, "Mohan");
		CheckoutPage.clickGSTYes(wd);
		CheckoutPage.checkCOD(wd);		
		CheckoutPage.clickPlaceOrder(wd);
	}
}
