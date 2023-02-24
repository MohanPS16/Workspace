package executionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import testCases.LoginPage;

public class ExecutionClass {

	public static WebDriver wd;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		
		wd.findElement(By.xpath(".//input[@name='username']")).sendKeys("Admin");
		wd.findElement(By.xpath(".//input[@name='password']")).sendKeys("admin123");
		wd.findElement(By.xpath(".//input[@name='password']")).submit();
		Thread.sleep(1500);
		
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		Thread.sleep(1500);
		wd.findElement(By.xpath(".//input[@name='firstName']")).sendKeys("rahul");
		wd.findElement(By.name("middleName")).sendKeys("rahul");
		wd.findElement(By.name("lastName")).sendKeys("rahul");
		wd.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();	
	
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		Thread.sleep(1500);
		wd.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("rahul");
		wd.findElement(By.xpath(".//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	
	}
}
