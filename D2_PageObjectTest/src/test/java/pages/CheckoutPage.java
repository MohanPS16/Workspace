package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {


		public static void simpleFormPage(WebDriver wd){
			wd.get("http://djangovinoth.pythonanywhere.com/simpleform/");
		}
		public static void enterProductName(WebDriver wd, String productname){
			wd.findElement(By.id("id0")).sendKeys(productname);
		}
		public static void enterMobileName(WebDriver wd, String mobilename){
			wd.findElement(By.id("id1")).sendKeys(mobilename);
		}
		public static void enterEmailId(WebDriver wd, String emailid){
			wd.findElement(By.id("id2")).sendKeys(emailid);
		}
		public static void selectProductCategory(WebDriver wd, String categoryname){
			Select s= new Select(wd.findElement(By.id("id3")));
			s.selectByValue(categoryname);
		}
		public static void enterProductQuantity(WebDriver wd, String num){
			wd.findElement(By.id("id4")).sendKeys(num);
		}
		public static void enterPurchaserName(WebDriver wd, String purchasername){
			wd.findElement(By.id("id5")).sendKeys(purchasername);
		}
		public static void clickGSTYes(WebDriver wd){
			wd.findElement(By.id("idyes")).click();
		}
		public static void clickGSTNo(WebDriver wd){
			wd.findElement(By.id("idno")).click();
		}
		public static void checkCOD(WebDriver wd){
			wd.findElement(By.id("cod")).click();
		}
		public static void checkNetBanking(WebDriver wd){
			wd.findElement(By.id("netbank")).click();
		}
		public static void clickPlaceOrder(WebDriver wd){
			wd.findElement(By.name("button")).click();
		}
	}

