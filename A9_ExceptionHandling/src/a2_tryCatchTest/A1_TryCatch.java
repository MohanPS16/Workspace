package a2_tryCatchTest;

public class A1_TryCatch {

public static void main(String[] args) {
		
		System.out.println("login app");
		
		try {
		int a = 1;
		int b = 0;
		int result = a/b;
		System.out.println("Result is"+result);
		} catch(ArithmeticException e){
			System.out.println("Alert - You have entered less than 0");
			System.out.println("Log - "+ e.getMessage());
		}
		System.out.println("logout app");
}
}
