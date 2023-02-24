package a1_stringLitralAndObject;

public class A1_StringLitralAndObject {

	public static void main(String[] args) {
		
		String a="Vcentry";
		String b="Vcentry";
		String c=new String("Vcentry"); //String object will store variable in heap memory
		String d=new String("Vcentry");
		
		System.out.println(a==b);//true
		System.out.println(b==c);//false    ==compares the memory
		System.out.println(c==d);//false
		System.out.println("-------------------");
		System.out.println(a.equals(b));//true  // .equals will compare the values inside the string
		System.out.println(b.equals(c));//true
		System.out.println(c.equals(d));//true
	}
}
