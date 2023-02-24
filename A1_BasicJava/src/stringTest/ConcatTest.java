
package stringTest;

public class ConcatTest {
public static void main(String[] args) {
	int a =1;
	int b =2;
	System.out.println(a+b);
	
	String c= "Mohan ";
	String d= "P S";
	System.out.println(c+d);//True should not use this type for adding String
	System.out.println(c.concat(d));//True should use this method to add a String
	
}
}
