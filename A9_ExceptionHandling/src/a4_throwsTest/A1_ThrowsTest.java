package a4_throwsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class A1_ThrowsTest {

	public static void main(String[] args) throws FileNotFoundException {
		govapp();
	}
	
	public static void govapp() throws FileNotFoundException{
		File f= new File("");
		FileInputStream fis= new FileInputStream(f);
		
	}
	
	public static void facebookapp(){
		File f=new File("");
		
		try{
		FileOutputStream fos= new FileOutputStream(f);
	}catch (FileNotFoundException e){
		System.out.println("Default profile will be uploaded");
	}
	}
}