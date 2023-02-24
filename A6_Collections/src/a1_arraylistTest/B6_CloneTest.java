package a1_arraylistTest;

import java.util.ArrayList;

public class B6_CloneTest {
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		a.add("Five");
		
		ArrayList clone=(ArrayList)a.clone();
		System.out.println(a);
		System.out.println(clone);
		System.out.println("---------");
		
		clone.add("Six");
		System.out.println(a);
		System.out.println(clone);
	}
}
