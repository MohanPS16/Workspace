package stringTest;

public class EndsWithTest {
	public static void main(String[] args) {
	String a= "IOCL Ltd";
	String b= "BPCL Ltd";
	String c= "TATA Steel";
	String d= "JSW Steel";

	
	System.out.println(a.endsWith("Ltd"));
	System.out.println(b.endsWith("ltd"));
	System.out.println(c.endsWith("steel"));
	System.out.println(d.endsWith("Steel"));
	}
}
