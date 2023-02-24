package forLoopings;

public class A4_ForTest {
	public static char c;
	
	public static void main(String[] args) {
		for (char i= 'a'; i<='z'; i++){
			System.out.print(i);
		}
		System.out.println();
		for(c='Z';c>='A';c--){
			System.out.println(c);
		}
	}
}
