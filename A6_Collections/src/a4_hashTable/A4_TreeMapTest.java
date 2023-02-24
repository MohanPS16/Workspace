package a4_hashTable;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class A4_TreeMapTest {

	public static void main(String[] args) {
		TreeMap a= new TreeMap();
		a.put("username", "abc");
		a.put("password", "abc@123");
		a.put("domain", "testing");
		a.put("company", "vcentry");
		
		a.put("email", null);//Will allow null value - Map rule
		//a.put(null, "Mohan P S");//Wont allow null key - Tree rule
		
		
		Set s= a.keySet();
		Iterator it= s.iterator();
		
		//Iterator it=a.keySet().iterator();
		
		while (it.hasNext()){
			String key = (String) it.next();
			System.out.println(key+"   -   "+ a.get(key));
		
		
	}
}
}