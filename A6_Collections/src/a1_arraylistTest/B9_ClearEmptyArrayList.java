package a1_arraylistTest;

import java.util.ArrayList;

public class B9_ClearEmptyArrayList {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Four");
		a.add("Five");
		
		System.out.println(a.isEmpty());
		
		a.clear();
		System.out.println(a.isEmpty());
		System.out.println(a);
	}
}
