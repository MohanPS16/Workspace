package a2_Interface;

public class F3_Employee implements F1_Manager, F2_TeamLead {
public static void main(String[] args) {
	F3_Employee a= new F3_Employee();
	a.add();
	a.sub();
}

@Override
public void add() {
	// TODO Auto-generated method stub
	System.out.println("Mohan");
}

@Override
public void sub() {
	// TODO Auto-generated method stub
	System.out.println("P S");
}
}
