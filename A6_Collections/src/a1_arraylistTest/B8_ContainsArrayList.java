package a1_arraylistTest;

import java.util.ArrayList;

public class B8_ContainsArrayList {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Four");
		a.add("Five");
		
		System.out.println(a.contains("Four"));
		System.out.println(a.contains("Six"));
	}
}
