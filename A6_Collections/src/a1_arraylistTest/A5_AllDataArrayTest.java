package a1_arraylistTest;

import java.util.ArrayList;

public class A5_AllDataArrayTest {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("Mohan P S");
		a.add("Rohini P S");
		a.add("Nisha S G");
		a.add("Shanthi P");

		for(int i=0; i<a.size();i++){
			System.out.println(a.get(i));
		}
	}
}
