package a1_arraylistTest;

import java.util.ArrayList;

public class B3_AddAllArrayList {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("Zero");
		a.add("one");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		
		ArrayList b= new ArrayList();
		b.add("Five");
		b.add("Six");
		b.add("Seven");
		b.add("Eight");
		b.add("Nine");
		
		System.out.println("----Before Add All----");
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		//a.add(b); This add in Different format
		a.addAll(b);//This is the function to add both the Array List
		
		System.out.println("----After Add All----");
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
	}
}
