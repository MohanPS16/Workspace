package a3_linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A1_LinkedList {

	public static void main(String[] args) {
		
		LinkedList a= new LinkedList();
		a.add("x");
		a.add(1);
		a.add('s');
		a.add(true);
		a.add(null);
		a.add("x");
		a.add(1);
		a.add('s');
		a.add(true);
		a.add("x");
		
		Iterator d= a.iterator();
		
		while (d.hasNext()){
			System.out.println(d.next());
		}
	}
}
