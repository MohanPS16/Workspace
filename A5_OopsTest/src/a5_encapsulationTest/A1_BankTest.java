package a5_encapsulationTest;

public class A1_BankTest {

	private int accNo;
	private int balance=1000;
	private int debit;
	private int credit;
	
	public void setAccNo(int accNo){
		this.accNo = accNo;
	}
	public int getAccNo(){
		System.out.println("Please Wait We Are Verifying");
		return accNo;
	}
	public void setDebit(int debit){
		this.debit=debit;
	}
	public int getDebit(){
		balance=balance-debit;
		System.out.println("Your requested amount"+debit );
		return balance;
	}
	public void setCredit(int credit){
		this.credit=credit;
	}
	public int getCredit(){
		balance=balance+credit;
		System.out.println("Your Deposited Amount"+credit);
		return balance;
	}
}
