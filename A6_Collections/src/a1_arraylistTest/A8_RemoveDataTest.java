package a1_arraylistTest;

import java.util.ArrayList;

public class A8_RemoveDataTest {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("Mohan P S");
		a.add("Rohini P S");
		a.add("Nisha S G");
		a.add("Shanthi P");
		a.add("Samsung");
		
		System.out.println("--------Before Remove--------");
		for (int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		
		a.remove(4);
		a.remove(0);
		System.out.println("------After Remove------");
		for (int i=0; i<a.size();i++){
			System.out.println(a.get(i));
	}
}
}