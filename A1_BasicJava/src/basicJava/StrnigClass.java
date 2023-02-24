package basicJava;

public class StrnigClass {

	public static void main(String[] args) {
		
		String s= "Hello World";
		
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder(s);
		s2.append(false);
		System.out.println(s2);
		s2.append(0);
		System.out.println(s2);
		s2.capacity();
		System.out.println(s2);
		s2.insert(2, 5);
		System.out.println(s2);
		
	}
}
