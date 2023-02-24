package a2_finalTest;

public class A3_OtherBank extends A2_RBI{//if parent class is declared as final it cannot be extended

	
	public static void main(String[] args) {
	InterestCalculator();	
	}
	
	   public static void InterestCalculator(){
		System.out.println("Other Bank Interest Calculator....");// if parent function is set final we cannot override the same function
	}
}
