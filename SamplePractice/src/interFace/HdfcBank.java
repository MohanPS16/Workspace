package interFace;

public class HdfcBank implements RbiTest {
public static void main(String[] args) {
	HdfcBank a= new HdfcBank();
	a.account();
	a.kyc();
	a.minimumbalance();
	RbiTest.charges();//to call static write class.
}


@Override
public void account() {
	// TODO Auto-generated method stub
	System.out.println("Account opening Format");
}

@Override
public void minimumbalance() {
	// TODO Auto-generated method stub
	System.out.println("Maintain Monthly Minimum Balance of 1000  rs");
}

@Override
public void kyc() {
	// TODO Auto-generated method stub
	System.out.println("Mandatory kyc updation");
}
}
