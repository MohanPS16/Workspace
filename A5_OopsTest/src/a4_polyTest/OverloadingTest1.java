package a4_polyTest;

public class OverloadingTest1 {

	static int add(int a, int b) {
		return a+b;
		
	}
	static int add(int a, int b, int c) {
		return a+b+c;
	}
}
	class TestMethodCalling{
		public static void main(String[] args) {
			System.out.println(OverloadingTest1.add(10, 15));
			System.out.println(OverloadingTest1.add(14, 52, 85));
		}
	}

