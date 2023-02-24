package a2_Interface;

public interface C1_WorldBank {

	public void credit();
	public void debit();
	
	//After JAVA Version 1.8
	public static void loan(){
		System.out.println("Loan Logic from World Bank");
	}
	public  static void carloan(){
		System.out.println("Car Loan From World Bank");
	}
	
}
