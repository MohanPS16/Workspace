package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public static void goToUrl(WebDriver driver) {
		driver.get("http://djangovinoth.pythonanywhere.com/input/");
	}
	public static void inputTypes(WebDriver driver) {
		driver.findElement(By.xpath(".//input[@name='firstname']")).sendKeys("Raghul.PS");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("mohanps");
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("mohanps@gmial.com");
		driver.findElement(By.xpath(".//input[@name='email']")).submit();
	}
	public static void logout(WebDriver driver) {
		driver.findElement(By.linkText("Logout")).click();
	}
}
