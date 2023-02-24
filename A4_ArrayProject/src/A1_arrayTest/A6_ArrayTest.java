package A1_arrayTest;

public class A6_ArrayTest {
public static void main(String[] args) {
	
	String [] [] x=new String [3][4];//2D Array
	
	x[0][0]="Mohan P S";
	x[0][1]="Raghul";
	x[0][2]="Jhanvi";
	x[0][3]="Nisha";
	
	x[1][0]="Srinivasan";
	x[1][1]="Shanthi";
	x[1][2]="Rohini";
	x[1][3]="Vcentry";
	
	x[2][0]="Guindy";
	x[2][1]="Chennai";
	x[2][2]="Manali";
	x[2][3]="Testing";
	
	for (int row=0;row<x.length;row++){
		for(int col=0;col<x[row].length;col++){
			System.out.print(x[row][col]+"   ");
		}
		System.out.println();
	}
	
}
}
