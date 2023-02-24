package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRun {

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

		System.out.println(wd.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div")).getText());
		
	}
}