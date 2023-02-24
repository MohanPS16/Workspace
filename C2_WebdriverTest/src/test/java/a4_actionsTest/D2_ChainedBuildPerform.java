package a4_actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D2_ChainedBuildPerform {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("Raghul.ps");
		WebElement password = wd.findElement(By.id("id_password"));
		password.sendKeys("shanthip02");
		password.submit();
		
		wd.get("http://djangovinoth.pythonanywhere.com/resize/");
		WebElement resize =wd.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions a=new Actions(wd);
//		a.clickAndHold(resize).perform();
//		Thread.sleep(2000);
//		a.moveToElement(resize, 80, 80);
//		Thread.sleep(2000);
//		a.release(resize).perform();
		
		a.clickAndHold(resize).moveByOffset(80, 80).build().perform();
		a.release();
	}
}
