package a3_elementTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I2_RadioButton {

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
		wd.get("http://djangovinoth.pythonanywhere.com/radiobutton/");
		
		List<WebElement> radio= wd.findElements(By.name("technology2"));	
		for(int i=0; i<radio.size();i++){
			String data=radio.get(i).getAttribute("value");
			if(data.equals("Flask")){
				radio.get(i).click();
				break;
			}
		}
	}
}
