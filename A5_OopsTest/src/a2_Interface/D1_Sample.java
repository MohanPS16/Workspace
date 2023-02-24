package a2_Interface;

public class D1_Sample implements C1_WorldBank{
public static void main(String[] args) {
	D1_Sample a= new D1_Sample();
		a.credit();
		a.debit();
		
		C1_WorldBank b= new D1_Sample();
		b.credit();
		b.debit();
		
		C1_WorldBank.loan();
		C1_WorldBank.carloan();//to call static function write class. and functions will appear
		
}
	
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("Sample Credit Card");
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("Sample Debit Function");
	}

}
