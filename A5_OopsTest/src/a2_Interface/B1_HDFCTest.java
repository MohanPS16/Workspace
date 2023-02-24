package a2_Interface;

public class B1_HDFCTest implements A1_RBITest{
	public static void main(String[] args) {
		A1_RBITest.accNo();
		B1_HDFCTest a= new B1_HDFCTest();
				a.credit();
				a.debit();
				a.loan();
				//a.eduloan();
				
		A1_RBITest b = new B1_HDFCTest();
		b.credit();
		b.debit();
		b.loan();
		//b.eduloan();This won't show because we can't create object from parent(Interface) to child(class)
		
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC - Online - Credit Function");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC- Debit Function");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC Loan Function");
	}
	public void eduloan(){
		System.out.println("Education Loan");
	}
}
