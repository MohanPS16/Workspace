package switchTest;

public class A1_SwitchTest {
	public static void main(String[] args) {
		int age=50;
		switch (age) {
		case 10:
			System.out.println("Age is 10");
			break;
		case 20:
			System.out.println("Age is 20");
			break;
		case 30:
			System.out.println("Age is 30");
			break;
		case 40:
			System.out.println("Age is 40");
			break;
		case 50:
			System.out.println("Age is 50");
			break;
		default:
			System.out.println("Age is not Eligible");
			break;
		}
	}
}
