package a2_Interface;

public class E1_Bank implements E1_A, E1_B {
public static void main(String[] args) {
	E1_Bank a=new E1_Bank();
	a.credit();
	a.debit();
}

@Override
public void debit() {
	// TODO Auto-generated method stub
	System.out.println("debit function");
}

@Override
public void credit() {
	// TODO Auto-generated method stub
	System.out.println("Credit function");
}

}
