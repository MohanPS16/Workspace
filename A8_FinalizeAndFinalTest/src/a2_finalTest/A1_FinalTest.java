package a2_finalTest;

public class A1_FinalTest {

	public static void main(String[] args) {
		
		final int days = 7;
		final int salary = 100;
		
		//days = days+10; cannot modify the int data if final is given.
		
		int payment = days*salary;
		System.out.println(payment);	
	}
	public static void add() {
		final int a=10;
		final int b=15;
	}
	
}
