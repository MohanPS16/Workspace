 package a3_tryCatchFinally;

public class A1_TryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println("Book my show login");
		System.out.println("Book Movie Tickets");
		try{
			System.out.println("Bank Login");
			int i=1/0;
		}catch(Exception e) {
			System.out.println("----Transaction Failed----");
		}finally {//this needed in case of the program fails still output should be shown
			System.out.println("Bank Logout");
		}
		System.out.println("Book My show Logout");		
	}
}
