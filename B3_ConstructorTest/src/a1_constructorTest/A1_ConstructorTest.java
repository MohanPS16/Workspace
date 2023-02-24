package a1_constructorTest;

public class A1_ConstructorTest {

	public static int i;
	public static int j;
	
	public A1_ConstructorTest() {
		i=5;
		j=5;
		
	}
	A1_ConstructorTest(int i, int j){
		this.i=i;
		this.j=j;
		
	}
	public static void main(String[] args) {
		

	int k=i+j;
	System.out.println(k);
	System.out.println("------------");

	A1_ConstructorTest a=new A1_ConstructorTest();
	int x=i+j;
	System.out.println(x);
	System.out.println("------------");
	
	A1_ConstructorTest b=new A1_ConstructorTest(10,10);
		int y=i+j;
		System.out.println(y);
	
	
	}
}