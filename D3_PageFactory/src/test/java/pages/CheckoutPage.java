package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

		@FindBy(how=How.ID,using="id0")
		private WebElement productname;
		public void enterProductName(String productname){
			//wd.findElement(By.id("id0")).sendKeys(productname);
			this.productname.sendKeys(productname);
		}
		@FindBy(how=How.ID,using="id1")
		private WebElement mobilename;
		public void enterMobileName(String mobilename){
			//wd.findElement(By.id("id1")).sendKeys(mobilename);
			this.mobilename.sendKeys(mobilename);
		}
		@FindBy(how=How.ID,using="id2")
		private WebElement emailid;
		public void enterEmailId(String emailid){
			//wd.findElement(By.id("id2")).sendKeys(emailid);
			this.emailid.sendKeys(emailid);
		}
		@FindBy(how=How.ID,using="id3")
		private WebElement categoryname;
		public void selectProductCategory(String categoryname){
			Select s= new Select(this.categoryname);
			s.selectByValue(categoryname);
		}
		@FindBy(how=How.ID,using="id4")
		private WebElement num;
		public void enterProductQuantity(String num){
			//wd.findElement(By.id("id4")).sendKeys(num);
			this.num.sendKeys(num);
		}
		@FindBy(how=How.ID,using="id5")
		private WebElement purchasername;
		public void enterPurchaserName(String purchasername){
			//wd.findElement(By.id("id5")).sendKeys(purchasername);
			this.purchasername.sendKeys(purchasername);
		}
		@FindBy(how=How.ID,using="idyes")
		private WebElement clickGstYes;
		public void clickGSTYes(){
			//wd.findElement(By.id("idyes")).click();
			clickGstYes.click();
		}
		@FindBy(how=How.ID,using="idno")
		private WebElement clickGstNo;
		public void clickGSTNo(){
			//wd.findElement(By.id("idno")).click();
			clickGstNo.click();
		}
		@FindBy(how=How.ID,using="cod")
		private WebElement checkCod;
		public void checkCOD(){
			//wd.findElement(By.id("cod")).click();
			checkCod.click();
		}
		@FindBy(how=How.ID,using="netbank")
		private WebElement checkNetBank;
		public void checkNetBanking(){
			//wd.findElement(By.id("netbank")).click();
			checkNetBank.click();
		}
		@FindBy(how=How.ID,using="order")
		private WebElement placeOrder;
		public void clickPlaceOrder(){
			//wd.findElement(By.name("button")).click();
			placeOrder.submit();
		}
	}

