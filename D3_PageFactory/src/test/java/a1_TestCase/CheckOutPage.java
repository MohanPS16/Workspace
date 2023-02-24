package a1_TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CheckoutPage;
import pages.LoginPage;

public class CheckOutPage {

	public static void main(String[] args) {
		// readable , reusable, Maintainable
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		LoginPage loginpage= PageFactory.initElements(wd, LoginPage.class);
		loginpage.enterUserName("Raghul.ps");
		loginpage.enterPassword("shanthip02");
		loginpage.clickLoginButton();
		
		wd.get("http://djangovinoth.pythonanywhere.com/simpleform/");
		
		CheckoutPage checkpage=PageFactory.initElements(wd, CheckoutPage.class);
		checkpage.enterProductName("Samsung");
		checkpage.enterMobileName("Samsung J-2");
		checkpage.enterEmailId("psrahul@gmail.com");
		checkpage.selectProductCategory("Electrical");
		checkpage.enterProductQuantity("4");
		checkpage.enterPurchaserName("Mohan");
		checkpage.clickGSTYes();
		checkpage.checkCOD();
		checkpage.clickPlaceOrder();
//		CheckoutPage.simpleFormPage(wd);
//		CheckoutPage.enterProductName(wd, "Samsung");
//		CheckoutPage.enterMobileName(wd, "Samsung J-2");
//		CheckoutPage.enterEmailId(wd, "psrahul24@gmail.com");
//		CheckoutPage.selectProductCategory(wd, "Electrical");
//		CheckoutPage.enterProductQuantity(wd, "3");
//		CheckoutPage.enterPurchaserName(wd, "Mohan");
//		CheckoutPage.clickGSTYes(wd);
//		CheckoutPage.checkCOD(wd);		
//		CheckoutPage.clickPlaceOrder(wd);
	}
}
