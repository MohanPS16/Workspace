package a1_finalizeTest;

public class A1_FinalizeTest {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized call ");
	}
	
	public static void main(String[] args) {
		
		A1_FinalizeTest a1= new A1_FinalizeTest();
		A1_FinalizeTest a2= new A1_FinalizeTest();
		A1_FinalizeTest a3= new A1_FinalizeTest();
		
		a1=null;
		a2=null;
		a3=null;
		
		System.gc();//-> finalize() garbage collector 
	}
}
