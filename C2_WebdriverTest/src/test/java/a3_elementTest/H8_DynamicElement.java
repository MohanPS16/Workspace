package a3_elementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H8_DynamicElement {

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
		
		wd.get("http://djangovinoth.pythonanywhere.com/SingleAndMultiImage/");
//		/html/body/main/div/div[2]/div/div[2]/div/div/div/div[1]/div/div/p
//		/html/body/main/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/p
		
		String startingXpath = "/html/body/main/div/div[2]/div/div[2]/div/div/div/div[";
		String endingXpath = "]/div/div/p";
		
		int i=1;
		while(true){
			try{
			String fullXpath= startingXpath + i + endingXpath;
			i++;
			String data = wd.findElement(By.xpath(fullXpath)).getText();
			System.out.println(data);
			}catch(Exception e){
				System.out.println("Log - No such element exception caused");
				break;
			}
		}	
	}
}
