package returnType;

public class A1_ReturnTypeTest {
	public static void main(String[] args) {
		add();//call
		sub();//call
		int addResult=add();//call
		int subResult=sub();//call
		int mainResult=addResult+subResult;//call
		System.out.println(mainResult);
		}
	public static int add(){
		int a=1;
		int b=1;
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public static int sub(){
		int a=5;
		int b=2;
		int c=a-b;
		System.out.println(c);
		return c;
}
}