package a2_setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class A4_LinkedHashSet {
	public static void main(String[] args) {
		
		LinkedHashSet a = new LinkedHashSet();
		a.add("c");
		a.add("b");
		a.add("a");
		a.add("d");
		a.add("e");
		
		a.add("c");
		a.add("b");
		a.add("a");
		a.add("d");
		a.add("e");
		//System.out.println(a);
		
		Iterator it= a.iterator();//hasnext(), next()
		
		while (it.hasNext()){
			System.out.println(it.next());
	}
	}
}
