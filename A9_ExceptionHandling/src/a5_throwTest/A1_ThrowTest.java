package a5_throwTest;

public class A1_ThrowTest {

	public static void main(String[] args) throws Exception {
		createException();
	}
	public static void createException() throws Exception{
		
		System.out.println("enter your age..");
		int age = 16;
		if (age>18){
			System.out.println("Allow to vote");
		}else {
			ArithmeticException e= new ArithmeticException("Under 18, so not allowed");
			throw e;
			
		}
	}
}
