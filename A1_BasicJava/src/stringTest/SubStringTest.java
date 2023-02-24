package stringTest;

public class SubStringTest {
public static void main(String[] args) {
	String a= "Software Testing";
	String b= "Selenium With Java";
	String c= "Automation Testing";
	String d= "Programm Language JAVA";
	
	
	System.out.println(a.substring(9));
	System.out.println(b.substring(8));
	System.out.println(c.substring(11));
	System.out.println(d.substring(9));
	
	System.out.println(a.substring(4, 8));
	System.out.println(b.substring(10, 18));
	System.out.println(d.substring(3, 9));
	System.out.println(a.substring(0, 5));
	
	
}
}
