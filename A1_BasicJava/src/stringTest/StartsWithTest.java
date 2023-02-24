package stringTest;

	public class StartsWithTest {
		public static void main(String[] args) {
		String a= "Bajaj Finance";
		String b= "Bajaj Auto";
		String c= "Adani Power";
		String d= "Adani Ports";
		
		System.out.println(a.startsWith("bajaj"));
		System.out.println(b.startsWith("Bajaj"));
		System.out.println(c.startsWith("Adani"));
		System.out.println(d.startsWith("ADNAI"));
		
		}
}
