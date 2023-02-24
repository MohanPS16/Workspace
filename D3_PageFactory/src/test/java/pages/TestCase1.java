package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("Raghul.ps");
		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("shanthip02");
		password.submit();
		wd.get("http://djangovinoth.pythonanywhere.com/simpleform/");
		WebElement product=wd.findElement(By.id("id0"));
		product.sendKeys("Apple");
		WebElement mobile = wd.findElement(By.id("id1"));
		mobile.sendKeys("Ipad - 2");
		WebElement Email = wd.findElement(By.id("id2"));
		Email.sendKeys("psrahul@gmail.com");
		WebElement category =wd.findElement(By.name("cars"));
		Select s=new Select(category);
		s.selectByValue("Electronics");
		WebElement quantity =wd.findElement(By.id("id4"));
		quantity.sendKeys("2");
		WebElement name =wd.findElement(By.id("id5"));
		name.sendKeys("Mohan P S");
		WebElement radio=wd.findElement(By.id("idyes"));
		radio.click();
		WebElement check=wd.findElement(By.id("cod"));
		check.click();
		
		
	}
}
