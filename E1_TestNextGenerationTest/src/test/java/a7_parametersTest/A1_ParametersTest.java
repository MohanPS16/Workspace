package a7_parametersTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A1_ParametersTest {

	@Parameters({"BROWSER","URL","USERNAME","PASSWORD"})
	@Test
	public void loginTest(String browser ,String url ,String username, String password){
		System.out.println("Open Browser	: "+browser);
		System.out.println("Enter url       : "+url);
		System.out.println("Enter Username  : "+username);
		System.out.println("Enter Password  : "+password);
		System.out.println("Click Login Button");
	
	}
}
