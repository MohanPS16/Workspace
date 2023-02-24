package a1_arraylistTest;

import java.util.ArrayList;

public class B5_CopyArrayList {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		a.add("Five");
		
		ArrayList copy=a;
		System.out.println(a);
		System.out.println(copy);
		System.out.println("---------");
		
		copy.add("Six");
		System.out.println(a);
		System.out.println(copy);//using copy will affect a also so use cloning
	}
}
