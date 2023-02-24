package a8_dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A1_DataProvider {

	@Test(dataProvider="mydata")
	public void loginTest(String browser ,String url ,String username, String password, String msg){
		System.out.println("Open Browser	: "+browser);
		System.out.println("Enter url       : "+url);
		System.out.println("Enter Username  : "+username);
		System.out.println("Enter Password  : "+password);
		System.out.println("Welcome Msg 	: "+msg);
		System.out.println("Click Login Button");
	}
	@DataProvider(name="mydata")
	public static Object getData(){
//		Object[][] data=new Object[dataset][data];
//		Object[][] data=new Object[row][col];
//		Object[][] data=new Object[iteration][data];
		Object[][] data=new Object[3][5];
		//first dataset
		data[0][0]="firefox";
		data[0][1]="http://djangovinoth.pythonanywhere.com/login/";
		data[0][2]="Raghul.ps";
		data[0][3]="shanthip02";
		data[0][4]="welcome message 1";
		//second dataset
		data[1][0]="chrome";
		data[1][1]="http://djangovinoth.pythonanywhere.com/login/";
		data[1][2]="Raghulps";
		data[1][3]="shanthip02";
		data[1][4]="welcome message 2";
		//third data set
		data[2][0]="chrome";
		data[2][1]="http://djangovinoth.pythonanywhere.com/login/";
		data[2][2]="Raghulps";
		data[2][3]="shanthip02";
		data[2][4]="welcome message 3";
		return data;
	}
}
