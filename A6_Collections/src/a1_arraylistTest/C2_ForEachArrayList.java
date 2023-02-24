package a1_arraylistTest;

import java.util.ArrayList;

public class C2_ForEachArrayList {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		a.add("Five");
		a.add("Six");
		
	//for(int i=0; i<a.size();i++){
		//	System.out.println(a.get(i));
		
		for (Object data : a) {
			System.out.println(data);
			
		}
	}
}
