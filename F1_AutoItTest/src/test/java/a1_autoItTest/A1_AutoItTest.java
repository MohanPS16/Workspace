package a1_autoItTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_AutoItTest {

	public static void main(String[] args) throws InterruptedException, IOException {

				WebDriverManager.chromedriver().setup();
				WebDriver wd=new ChromeDriver();
				wd.manage().window().maximize();
				wd.get("http://djangovinoth.pythonanywhere.com/login/");
				
				WebElement username = wd.findElement(By.id("id_username"));
				username.sendKeys("Raghul.ps");
				WebElement password = wd.findElement(By.id("id_password"));
				password.sendKeys("shanthip02");
				password.submit();
				
				wd.get("http://djangovinoth.pythonanywhere.com/FileUploadDownload/");
				WebElement upload=wd.findElement(By.name("newfile"));
				
				Actions a=new Actions(wd);
				a.click(upload).build().perform();
 				
				Thread.sleep(5000);
				Runtime.getRuntime().exec("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\F1_AutoItTest\\executable\\fileUpload.exe");
			}
		}


