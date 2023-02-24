package a4_hashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A3_HashMapTest {

	public static void main(String[] args) {
		HashMap a= new HashMap();
		a.put("username", "abc");
		a.put("password", "abc@123");
		a.put("domain", "testing");
		a.put("company", "vcentry");
		a.put(null, "Mohan P S");
		a.put("Mail", null);
		
		//System.out.println(a.get("username"));
		//System.out.println(a.get("company"));

		Set s= a.keySet();
		Iterator it= s.iterator();
		
		//Iterator it=a.keySet().iterator(); this is one line method
		
		while (it.hasNext()){
			String key = (String) it.next();
			System.out.println(key+"   -   "+ a.get(key));
		}
		
		
	}
}
