package A3_abstractTest;

public class B2_HDFCBank extends A1_RbiTest {
public static void main(String[] args) {
	credit();
	debit();
	B2_HDFCBank a=new B2_HDFCBank();
	a.loan();
}
	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Loan From HDFC");
	}

}
