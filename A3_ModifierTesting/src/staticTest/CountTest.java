package staticTest;

public class CountTest {
	
	public static int i=0;
	
public static void main(String[] args) {
	CountTest a =new CountTest();
	CountTest b =new CountTest();
	CountTest c =new CountTest();
	a.increment();
	b.increment();
	c.increment();
}
	public void increment(){
		i++;
		System.out.println(i);
	}
}
