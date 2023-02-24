package a1_arraylistTest;

import java.util.ArrayList;

public class C3_ToArrayArrayList {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");

		Object[] obj= a.toArray();
		System.out.println(obj.length);
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		System.out.println(obj[2]);
		
	}
}
