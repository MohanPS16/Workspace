package a4_hashTable;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class A5_LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap a= new LinkedHashMap();
		a.put("username", "abc");
		a.put("password", "abc@123");
		a.put("domain", "testing");
		a.put("company", "vcentry");
		a.put("Mail", null);
		a.put(null, "Mohan P S");
		a.put(null, "9600097120");
		a.put("9600097120",null);
		
		Set s= a.keySet();
		Iterator it= s.iterator();
		
		//Iterator it=a.keySet().iterator();
		
		while (it.hasNext()){
			String key = (String) it.next();
			System.out.println(key+"   -   "+ a.get(key));
	}
}
}
