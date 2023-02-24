package a4_polyTest;

public class A1_OverLoadTest {

	public static void main(String[] args) {
		add(1, 2);
		add(2, 1, 1);
		add(1, 2, 2);
		add(1, 2, "Your Output=");
	}
	public static void add(int a,int b){
		//int a=1;
		//int b=2;
		int c=a+b;
		System.out.println(c);
	}
	public static void add(int a,int b,int d){
		//int a=1;
		//int b=2;
		//int d=1;
		int c=a+b+d;
		System.out.println(c);
		
	}
	public static void add(int a,int b, String msg){
		int c=a+b;
		System.out.println(msg+c);
	}
}
