package a3_tryCatchFinally;

public class A2_TryFinally {

	public static void main(String[] args) {
		
		System.out.println("Login Book Myshow app");
		try {
		System.out.println("Login Bank app");
		int i =1/0;
		}finally {		
		System.out.println("Logout Bank app");
		}
		System.out.println("Logout Book MyShow app"); 
}
}