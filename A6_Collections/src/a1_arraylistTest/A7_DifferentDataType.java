package a1_arraylistTest;

import java.util.ArrayList;
import java.util.Collections;

public class A7_DifferentDataType {
public static void main(String[] args) {
	
	ArrayList a= new ArrayList();
	a.add(2);
	a.add("Rohini P S");
	a.add('n');
	a.add("Shanthi P");
	a.add(true);
	a.add(1.2);
	
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
