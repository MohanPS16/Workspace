package a5_encapsulationTest;

public class B1_GpayTest {

	public static void main(String[] args) {
		
		A1_BankTest a=new A1_BankTest();
		a.setAccNo(1234567890);
		System.out.println(a.getAccNo()+" This Account No is Active");
		
		System.out.println("----------------");
		
		a.setDebit(300);
		System.out.println(a.getDebit()+" Your Balance");
		
		
		System.out.println("---------------");
		
		a.setCredit(500);
		System.out.println(a.getCredit()+" Your Balance");
	}
}
