package stringTest;

public class EqualIgnoreCase {
public static void main(String[] args) {
	String a= "PSMohan";
	String b= "psmohan";
	System.out.println(a.equals(b));
	
	System.out.println(a.equalsIgnoreCase(b));
}
}
