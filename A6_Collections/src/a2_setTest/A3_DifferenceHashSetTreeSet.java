package a2_setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A3_DifferenceHashSetTreeSet {

	public static void main(String[] args) {
		//TreeSet a = new TreeSet(); Won't allow different data type
		HashSet a = new HashSet();//it will allow different data type and result in random order
		a.add(1);
		a.add('x');
		a.add("a");
		a.add(true);
		a.add("e");
		a.add(null);
		
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
