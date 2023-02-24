package a6_imageTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F4_CropTest {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo=wd.findElement(By.className("lnXdpd"));
		Dimension d =logo.getSize();
		int height=d.height;
		int width =d.width;
		
		Point point= logo.getLocation();
		int x=point.x;
		int y=point.y;
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//crop operations
		//copy->crop->replce in src
		BufferedImage copy=ImageIO.read(src);
		BufferedImage crop=copy.getSubimage(x, y, width, height);
		ImageIO.write(crop, "jpg", src);
				
		FileHandler.copy(src, new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\C2_WebdriverTest\\Screenshot\\file.jpg"));
		
	
	}
}
