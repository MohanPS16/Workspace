 package returnType;

public class A2_ReturnTypeTest {
public static void main(String[] args) {
 String welcomeResult =	welcomeMsg();
 String addressRsult = address();
 String result = welcomeResult.concat(addressRsult);
 System.out.println(result);
}
public static String welcomeMsg(){
	String a = "Mohan";
	String b = "P S";
	String c =a.concat(b);
	System.out.println(c);
	return c;
}
public static String address(){
	String a = " Manali ";
	String b = " Chennai ";
	String c = a.concat(b);
	int n=600068;
	System.out.println(c);
	return c+n;
}
}

