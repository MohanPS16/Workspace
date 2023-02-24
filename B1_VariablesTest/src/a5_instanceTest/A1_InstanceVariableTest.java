package a5_instanceTest;

public class A1_InstanceVariableTest {

	int a=5;
	int b=2;
	
	public static void main(String[] args) {
		add();
	}
	public static void add(){
		A1_InstanceVariableTest obj= new A1_InstanceVariableTest();
		int k=obj.a+obj.b;
		
	}
}
