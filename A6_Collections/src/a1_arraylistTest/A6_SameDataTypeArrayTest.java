 package a1_arraylistTest;

import java.util.ArrayList;
import java.util.Collections;

public class A6_SameDataTypeArrayTest {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("Rohini P S");
		a.add("Mohan P S");
		a.add("Shanthi P");
		a.add("Nisha S G");
		
		System.out.println("--------Before Sort--------");
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
		Collections.sort(a);
		System.out.println("------After sort------");
		for (int i=0; i<a.size();i++){
			System.out.println(a.get(i));
		}
	}
}
