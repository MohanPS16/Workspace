package a1_arraylistTest;

import java.util.ArrayList;

public class B2_DifferentIndexOrderArrayList {
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(0, "Mohan P S");
		a.add(1, "Mohan P S - 1");
		a.add("Mohan P S - 2");
		a.add(3, "Mohan P S - 3");
		a.add(2,"Mohan P S - 4");
		
		for (int i =0;i<a.size();i++){
			System.out.println(a.get(i));
		}
}
}
