package a4_actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C8_DragAndDrop {
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
	
		wd.get("http://djangovinoth.pythonanywhere.com/draganddrop/");
		WebElement source=wd.findElement(By.id("draggable"));
		WebElement target=wd.findElement(By.id("droppable"));
		
		Actions a=new Actions(wd);
		//a.dragAndDrop(source, target); This is a chain action. .build.perform
		//a.dragAndDrop(source, target).perform();
		a.dragAndDrop(source, target).build().perform();
		
		
	}
}
