package a2_Interface;

public class B2_ICICITest implements A1_RBITest{
public static void main(String[] args) {
	B2_ICICITest a= new B2_ICICITest();
	a.carloan();
	a.credit();
	a.debit();
	a.loan();
	
	A1_RBITest b= new B2_ICICITest();
	b.credit();
	b.debit();
	b.loan();
	//b.carloan();
}

@Override
public void credit() {
	// TODO Auto-generated method stub
	System.out.println("ICICI- Direct-Credit Function");
}

@Override
public void debit() {
	// TODO Auto-generated method stub
	System.out.println("ICICI- Direct-Debit function");
}

@Override
public void loan() {
	// TODO Auto-generated method stub
	System.out.println("ICICI-Direct-Loan function");
}
public void carloan(){
	System.out.println("ICICI- Car Loan");
}
}
