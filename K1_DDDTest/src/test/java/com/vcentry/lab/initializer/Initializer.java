package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.vcentry.lab.util.ReportOptimiser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initializer {
	
	public static boolean isReport=false;
	
	
	public static ExtentReports reports;
	public static ExtentTest log;
	
	
	public static WebDriver wd=null;
	
	/*
	*@author mohan p s
	*@date 20-jan-2023
	*@purpose declare the locator variables
	*/
	public static FileInputStream locatorFis=null;
	public static Properties locatorProp=null;
	/*
	*@author mohan p s
	*@date 20-jan-2023
	*@purpose declare the environment variables
	*/
	public static FileInputStream envFis=null;
	public static Properties envProp=null;
	
	/*
	 * @author mohan p s
	 * @date 20-jan-2023
	 * @purpose initialize the environment, locator, excel, report, webdriver variables 
	 * @throws IOException
	 */
	
	public static void initialize() throws IOException{
	
		if(!isReport){
		reports = new ExtentReports("C:/Users/Rohini/Desktop/Workspace/batch251/K1_DDDTest/report/index.html");
		isReport=true;
		ReportOptimiser.optimizeReport();
		}
		envFis=new FileInputStream(new File("src\\test\\resources\\com\\vcentry\\lab\\config\\env.properties"));
		envProp=new Properties();
	    envProp.load(envFis);
	  
	    locatorFis=new FileInputStream(new File("src\\test\\resources\\com\\vcentry\\lab\\config\\locator.properties"));
		locatorProp=new Properties();
	    locatorProp.load(locatorFis);
	  
	    
	    if(envProp.getProperty("BROWSER").equals("chrome")){
	    	WebDriverManager.chromedriver().setup();
	    	wd=new ChromeDriver();
	    }else if(envProp.getProperty("BROWSER").equals("firefox")){
	    	WebDriverManager.firefoxdriver().setup();
	    	wd=new FirefoxDriver();
	    }else if(envProp.getProperty("BROWSER").equals("ie")){
	    	WebDriverManager.iedriver().setup();
	    	wd=new InternetExplorerDriver();
	    }
	   wd.manage().window().maximize();
	   wd.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //event firing webdriver
	   
	}
}
