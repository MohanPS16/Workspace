package A1_arrayTest;

public class A4_ArrayTest {

	public static void main(String[] args) {
		
		int [] y= new int [15];
		y[0]=10;
		y[1]=20;
		y[2]=30;
		y[3]=40;
		y[4]=50;
		y[5]=60;//remaining data will be saved as 0
		
		for(int a=0;a<y.length;a++){
			System.out.println(y[a]);
		}
	}
}
