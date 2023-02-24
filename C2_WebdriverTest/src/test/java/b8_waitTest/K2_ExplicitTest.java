package b8_waitTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K2_ExplicitTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		//Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(wd, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/main/div/div/div/div/form/fieldset/div[1]/div/input")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/main/div/div/div/div/form/fieldset/div[1]/div/input")));
		
		WebElement username =wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/div[1]/div/input"));
		
		username.sendKeys("Raghul.ps");
		
	}
}
