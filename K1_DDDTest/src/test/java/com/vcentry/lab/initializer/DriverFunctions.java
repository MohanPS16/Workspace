package com.vcentry.lab.initializer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriverFunctions {

	public static void selectByIndex(WebElement element, int index){
		try{
		Select s= new Select(element);
		s.selectByIndex(index);
		}catch (Exception e){
			System.out.println("Unable to select by index");
		}
	}
	public static void selectByValue(WebElement element, String value){
		try{
		Select s= new Select(element);
		s.selectByValue(value);
		}catch (Exception e){
			System.out.println("Unable to select by value");
		}
	}
	public static void selectByVisibleText(WebElement element, String Text){
		Select s= new Select(element);
		s.selectByVisibleText(Text);
	}
	
	
}
