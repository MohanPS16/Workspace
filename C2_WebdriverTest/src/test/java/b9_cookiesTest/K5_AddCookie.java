package b9_cookiesTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K5_AddCookie {

	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://www.google.com/");
	Thread.sleep(3000);
	
	wd.manage().deleteAllCookies();
	
	Cookie ownCookie=new Cookie("company", "vcentry");
	wd.manage().addCookie(ownCookie);
	
	Set<Cookie> googleCookie =wd.manage().getCookies();

	Iterator<Cookie> it=googleCookie.iterator();
	while(it.hasNext()){
//		System.out.println(it.next());
		Cookie singleCookie=it.next();
		System.out.println(singleCookie.getName()+"------"+singleCookie.getDomain()+"-------"+singleCookie.getPath()+"------"+singleCookie.getSameSite()+"------"+singleCookie.getValue()+"------"+singleCookie.getExpiry());
	}
	System.out.println("Execution Completed");
}
}