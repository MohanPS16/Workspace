package staticTest;

public class StaticTest {

	public static void main(String[] args) {
		StaticTest a=new StaticTest();
		a.calc();
	}
	public void add(){
		System.out.println("--add--");
	}
	public static void sub(){
		System.out.println("--sub--");
	}
	public void calc(){
		add();
		sub();
	}
}
