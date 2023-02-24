package a1_arraylistTest;

import java.util.ArrayList;

public class B4_SubListArrayList {

	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add("One");//0
		a.add("Two");//1
		a.add("Three");//2
		a.add("Four");//3
		a.add("Five");//4
		a.add("Six");//5
		a.add("Seven");//6
		a.add("Eight");//7
		
		System.out.println(a.subList(2, 6));
		
		//ArrayList sub= (ArrayList) a.subList(1, 7);
		
	}
}
