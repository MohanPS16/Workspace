package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void enterUsername(WebDriver driver,String username) {
		driver.findElement(By.xpath(".//input[@id='id_username']")).sendKeys(username);
	}
	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(By.xpath(".//input[@id='id_password']")).sendKeys(password);
		driver.findElement(By.xpath(".//input[@id='id_password']")).submit();
	}
}
