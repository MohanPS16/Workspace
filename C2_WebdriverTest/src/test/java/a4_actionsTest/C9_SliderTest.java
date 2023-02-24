package a4_actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C9_SliderTest {

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
		
		wd.get("http://djangovinoth.pythonanywhere.com/slider/");
		WebElement element=	wd.findElement(By.xpath("//*[@id='slider']/span"));
		Actions a = new Actions(wd);
		a.dragAndDropBy(element, 80, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(element, 80, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(element, 80, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(element, -80, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(element, -80, 0).build().perform();
		
}
}