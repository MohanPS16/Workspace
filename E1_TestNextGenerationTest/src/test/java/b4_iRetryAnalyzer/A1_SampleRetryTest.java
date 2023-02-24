package b4_iRetryAnalyzer;

import org.testng.annotations.Test;

public class A1_SampleRetryTest {

	public static int x=0;
	
	@Test(retryAnalyzer = MyRetry.class)
	public void loginTest(){
		
		System.out.println("Program Started");
		if(x==3){
		int i=1/1;
		}
		else{
			int i=1/0;
		}
		System.out.println("Program Completed");
	}
}
