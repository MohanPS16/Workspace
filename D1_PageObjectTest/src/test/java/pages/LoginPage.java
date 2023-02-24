package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void enterUserName(WebDriver wd, String username){
		wd.findElement(By.id("id_username")).sendKeys(username);
	}
	public static void enterPassword(WebDriver wd, String password){
		wd.findElement(By.id("id_password")).sendKeys(password);
	}
	public static void clickLoginButton(WebDriver wd){
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
	}
	public static void clickSignUpLink(WebDriver wd){
		wd.findElement(By.linkText("Sign Up Now")).click();
	}

}
