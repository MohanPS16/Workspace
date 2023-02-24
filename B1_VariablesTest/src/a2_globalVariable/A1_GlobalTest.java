package a2_globalVariable;

public class A1_GlobalTest {

	public static int a=5;//public means its a global variable and can be used to in entire package with extends keyword
	public static int b=2;//only static means class level variable
	
	public static void main(String[] args) {
		add();
		sub();
	}

	
	public static void add(){
		
		int k=a+b;
		System.out.println(k);
	}
	public static void sub (){
		int s=a-b;
		System.out.println(s);
	}
}
