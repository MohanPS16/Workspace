package testCases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.vcentry.lab.initializer.ElementFinder;
import com.vcentry.lab.initializer.Initializer;
import com.vcentry.lab.inputReader.InputReader;
import com.vcentry.lab.pages.CheckOutPage;
import com.vcentry.lab.pages.HomePage;
import com.vcentry.lab.pages.LoginPage;
import com.vcentry.lab.reportGenerator.ScreenshotGenerator;

public class CheckoutPageValidator extends Initializer {

	@BeforeMethod
	public void setUp() throws IOException{
		if(wd==null){
		initialize();
		}else{
			System.out.println("-------Browser opened already-------");
		}
	}
	@Test(dataProvider="mydata")
	public void validateCheckoutPage(String setName,String username,String password, String productName, String mobNum, String mailId, 
			String selectText, String productQty,String purchaserName) throws IOException{
		wd.get(envProp.getProperty("URL"));
	System.out.println(setName);
	log=reports.startTest(setName+"initialised");
//		wd.findElement(By.id("id_username")).sendKeys("Raghul.ps");
//		wd.findElement(By.id("id_password")).sendKeys("shanthip02");
//		wd.findElement(By.id("id_password")).submit();
//		wd.get(envProp.getProperty("LAB_URL"));
//		
//		wd.findElement(By.id("element44")).click();
//		wd.findElement(By.id("element45")).click();
//		wd.findElement(By.id("id0")).sendKeys("product A");
//		wd.findElement(By.id("id1")).sendKeys("1234567");
//		wd.findElement(By.id("id2")).sendKeys("mail@gamil.com");
//		WebElement dropdown= wd.findElement(By.id("id3"));
//		Select s=new Select(dropdown);
//		s.selectByVisibleText("Electrical");
//		wd.findElement(By.id("id4")).sendKeys("5");
//		wd.findElement(By.id("id5")).sendKeys("rahul");
//		wd.findElement(By.id("idyes")).click();
//		wd.findElement(By.id("cod")).click();
//		wd.findElement(By.id("order")).click();

		//Step 2
		// Login page
//		wd.findElement(By.id(locatorProp.getProperty("LOGINPAGE_TYPE_USERNAME_ID"))).sendKeys("Raghul.ps");
//		wd.findElement(By.id(locatorProp.getProperty("LOGINPAGE_TYPE_PASSWORD_ID"))).sendKeys("shanthip02");
//		wd.findElement(By.id("id_password")).submit();
//		wd.get(envProp.getProperty("LAB_URL"));
//
//		// Home Page
//		wd.findElement(By.id(locatorProp.getProperty("HOMEPAGE_CLICK_FRAMEWORKFORM_ID"))).click();
//		wd.findElement(By.id(locatorProp.getProperty("HOMEPAGE_CLICK_SIMPLEFORM_ID"))).click();
//		// Checkout page
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_TYPE_PRODUCTNAME_ID"))).sendKeys("product A");
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_TYPE_MOBILE_ID"))).sendKeys("1234567");
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_TYPE_EMAIL_ID"))).sendKeys("maila@mail.com");
//		WebElement dropdown = wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_SELECT_PRODUCTCAT_ID")));
//		Select s = new Select(dropdown);
//		s.selectByVisibleText("Electrical");
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_TYPE_PRODUCTQTY_ID"))).sendKeys("10");
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_TYPE_PURCHASERNAME_ID"))).sendKeys("purchaser A");
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_CLICK_GSTYES_ID"))).click();
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_CHECK_COD_ID"))).click();
//		wd.findElement(By.id(locatorProp.getProperty("CHECKOUT_CLICK_PLACEORDER_ID"))).click();

		
		//Step 3
//		ElementFinder.findById("LOGINPAGE_TYPE_USERNAME_ID").sendKeys("Raghul.ps");
//		ElementFinder.findById("LOGINPAGE_TYPE_PASSWORD_ID").sendKeys("shanthip02");
//		ElementFinder.findById("LOGINPAGE_TYPE_PASSWORD_ID").submit();
//		wd.get(envProp.getProperty("LAB_URL"));
//
//		// Home Page
//		ElementFinder.findById("HOMEPAGE_CLICK_FRAMEWORKFORM_ID").click();
//		ElementFinder.findById("HOMEPAGE_CLICK_SIMPLEFORM_ID").click();
//		//checkout page
//		ElementFinder.findById("CHECKOUT_TYPE_PRODUCTNAME_ID").sendKeys("product A");
//		ElementFinder.findById("CHECKOUT_TYPE_MOBILE_ID").sendKeys("123456");
//		ElementFinder.findById("CHECKOUT_TYPE_EMAIL_ID").sendKeys("maila@mail.com");
//		WebElement dropdown = ElementFinder.findById("CHECKOUT_SELECT_PRODUCTCAT_ID");
//
//		Select s = new Select(dropdown);
//		s.selectByVisibleText("Electrical");
//
//		ElementFinder.findById("CHECKOUT_TYPE_PRODUCTQTY_ID").sendKeys("10");
//		ElementFinder.findById("CHECKOUT_TYPE_PURCHASERNAME_ID").sendKeys("purchaser A");
//		ElementFinder.findById("CHECKOUT_CLICK_GSTYES_ID").click();
//		ElementFinder.findById("CHECKOUT_CHECK_COD_ID").click();
//		ElementFinder.findById("CHECKOUT_CLICK_PLACEORDER_ID").click();

////		step 4
////		LoginPage
		LoginPage.enterUserName(username);
		LoginPage.enterPassword(password);
		LoginPage.submitLoginPage();
		
//		HomePage
		wd.get(envProp.getProperty("LAB_URL"));
		HomePage.clickFrameworkForm();
		HomePage.clickSimpleForm();
		
//		
//		CheckOutPage
		CheckOutPage.enterProdutName(productName);
		CheckOutPage.enterMobileNumber(mobNum);
		CheckOutPage.enterEmailId(mailId);
		CheckOutPage.selectProductCat(selectText);
		CheckOutPage.enterProdutQty(productQty);
		CheckOutPage.enterPruchaserName(purchaserName);
		CheckOutPage.clickGstYes();
		CheckOutPage.clickCOD();
		CheckOutPage.clickPlaceOrder();
		log.log(LogStatus.PASS, "Checkout page validator sucessfully loaded");

	}

	@DataProvider(name="mydata")
	public static Object getData() throws IOException{
			if(InputReader.verifyRunMode("CheckoutPageValidator")){
		Object [][] x =InputReader.verifyMultiData("CheckoutPageValidator");

		return x;	
		}
			return null;
	}
	@AfterMethod
	public void teardown(ITestResult it) throws IOException {
		ScreenshotGenerator.generateScreenshot(it);
		HomePage.clickLogout();
	}


	@AfterClass
	public void browserQuit(){
		wd.quit();
	}
	}


