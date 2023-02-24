package a4_hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class A2_HashTableOptional {
public static void main(String[] args) {
	
	Hashtable a= new Hashtable();
	a.put("username", "abc");
	a.put("password", "abc@123");
	a.put("domain", "testing");
	a.put("company", "vcentry");
	
	//a.put(null, "ABCD");hashTable wont allow null key and value
	//a.put("mail", null);
	Enumeration e= a.keys();//this Enumeration is used get all the key 
	//e.hasMoreElements();hashNext();
	//e.nextElement();  next()
	
		//while (e.hasMoreElements()){
		//System.out.println(a.get(e.nextElement())); method to retrieve key
		
		
		while (e.hasMoreElements()){
			String key = (String) e.nextElement();
			System.out.println(key+"  -  "+a.get(key));//method to get key and value
	}
}
}
