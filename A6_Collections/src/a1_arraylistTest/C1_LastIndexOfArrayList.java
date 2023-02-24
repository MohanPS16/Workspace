package a1_arraylistTest;

import java.util.ArrayList;

public class C1_LastIndexOfArrayList {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		a.add("Five");
		a.add("Four");
		
		System.out.println(a.indexOf("Four"));
		
		System.out.println(a.lastIndexOf("Four"));
	}
}
