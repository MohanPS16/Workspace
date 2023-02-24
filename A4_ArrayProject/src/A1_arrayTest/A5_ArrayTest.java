package A1_arrayTest;

public class A5_ArrayTest {
	public static void main(String[] args) {
		Object [] x=new Object[5];
		x[0]=10;
		x[1]="Mohan P S";
		x[2]='s';
		x[3]=1.2;
		x[4]=true;
		
		for(int a=0; a<x.length;a++){
			System.out.println(x[a]);
			
		}
	}
}
