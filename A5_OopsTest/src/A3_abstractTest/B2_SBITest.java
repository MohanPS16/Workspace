package A3_abstractTest;

public class B2_SBITest extends A1_RbiTest {

	public static void main(String[] args) {
		credit();
		debit();
		B2_SBITest a= new B2_SBITest();//object created in class can call only functions inside the class
		a.loan();
		a.personalloan();
		
		A1_RbiTest b= new B2_SBITest();//can create object with mapping to abstract to class
		b.loan();
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("SBI Loan From RBI");
	}
	public void personalloan(){
		System.out.println("Personal Loan Function");
	}
}
