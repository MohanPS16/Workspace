package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1500);
		wd.findElement(By.xpath(".//input[@name='username']")).sendKeys("Admin");
		wd.findElement(By.xpath(".//input[@name='password']")).sendKeys("admin123");
		wd.findElement(By.xpath(".//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(1500);
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
	Thread.sleep(1500);
		JavascriptExecutor js=(JavascriptExecutor)wd;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);
		List<WebElement> text=wd.findElements(By.xpath(".//div[@class='oxd-table-row oxd-table-row--with-border']"));
		for (int i=0;i<=text.size();i++){
			String data =text.get(i).getText();
			System.out.print(data);
		}
		System.out.println(" /n");
	}
}
