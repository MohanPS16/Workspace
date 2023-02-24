package a2_tryCatchTest;

public class A6_AddError {

	public static void main(String[] args) {
		add();
	}
	
	public static void add(){
		System.out.println("----Add Function----");
		add();
	}
}
