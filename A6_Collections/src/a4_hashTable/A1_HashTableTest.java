package a4_hashTable;

import java.util.Hashtable;

public class A1_HashTableTest {

	public static void main(String[] args) {
		
		Hashtable a= new Hashtable();
		a.put("username", "abc");
		a.put("password", "abc@123");
		a.put("domain", "testing");
		a.put("company", "vcentry");
		 
		System.out.println(a.get("username"));//faster than index searching
		System.out.println(a.get("domain"));
		System.out.println(a.get("tesing"));//if key is wrong it will show null
		System.out.println(a.get("password"));
	}
}
