package stringTest;

public class EqualTest {

	public static void main(String[] args) {
		String a= "mohan";
		String b= "mohan";
		System.out.println(a==b);//True-Wrong format to check equal of String variable
		
		String c= "ps";
		String d= "ps";
		System.out.println(c.equals(d));//true-Correct format to check equal of two String	

	}

}
