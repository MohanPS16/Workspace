package a2_setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A2_TreeSet {
public static void main(String[] args) {
	
	TreeSet a = new TreeSet();
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
