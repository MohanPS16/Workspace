package a1_arraylistTest;

import java.util.ArrayList;

public class B7_SetArrayList {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Four");
		a.add("Five");
		
		System.out.println(a);
		a.set(2, "Three");
		System.out.println(a);
	}
}
