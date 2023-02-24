package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static void loadUrl(WebDriver wd, String Url){
		wd.get(Url);
	}	
	public static void enterUserName(WebDriver wd, String userName){
		wd.findElement(By.id("id_username")).sendKeys(userName);
	}
	public static void enterPassword(WebDriver wd, String passWord){
		wd.findElement(By.id("id_password")).sendKeys(passWord);
	}
	public static void clickLoginButton(WebDriver wd){
		wd.findElement(By.id("id_password")).click();
}
	public static void verifyWelcomeMsg(WebDriver wd, String msg){
		String data=wd.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/a[2]")).getText();
		Assert.assertEquals(msg, data);
	}
	public static void clickLogout(WebDriver wd){
		wd.findElement(By.linkText("Logout")).click();
	}
}