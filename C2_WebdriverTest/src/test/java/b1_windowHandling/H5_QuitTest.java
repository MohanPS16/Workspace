package b1_windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H5_QuitTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement closeButton= wd.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		closeButton.click();
		WebElement search= wd.findElement(By.name("q"));
		search.sendKeys("samsung mobile");
		search.submit();
		Thread.sleep(2000);
		List<WebElement> links=wd.findElements(By.className("_4rR01T"));
		String data= links.get(0).getText();
		System.out.println(data);
		links.get(0).click();
		//child window
		// LinkedHashSet
		Set<String> sessions= wd.getWindowHandles();
		Iterator<String> it=sessions.iterator();
		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		String parentId=it.next();
		String childId=it.next();
		wd.switchTo().window(childId);
		Thread.sleep(2000);
		//wd.close();
		wd.quit();
}
}
