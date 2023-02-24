package a2_setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A1_HashSetTest {

	public static void main(String[] args) {
		
		//HashSet a= new HashSet();
		Set a = new HashSet();
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
		
		Iterator it= a.iterator();//hasnext()-boolean, next()-data
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
