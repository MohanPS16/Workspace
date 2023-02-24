package b8_waitTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J9_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		WebElement username =wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/div[1]/div/input"));
		Thread.sleep(10000);
		username.sendKeys("Raghul.ps");
	}
}
