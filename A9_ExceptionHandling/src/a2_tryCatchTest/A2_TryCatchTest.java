package a2_tryCatchTest;

public class A2_TryCatchTest {

public static void main(String[] args) {
		
		System.out.println("login app");
		
		try {
		int a = 1;
		int b = 1;
		int result = a/b;
		
		System.out.println("Result is - "+result);
		int [] x= new int[2];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		
		} catch(ArithmeticException e){
			System.out.println("Alert - You have entered less than 0");
			System.out.println("Log - "+ e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Alert - You have reached maximum index");
			System.out.println("Log - "+e.getMessage());
		}
		System.out.println("logout app");
}
}
