package a1_textFileTest;

import java.io.File;
import java.io.IOException;

public class A2_FileExistTest {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:/Users/Rohini/Desktop/Workspace/batch251/FileHandlingTest/File/sample.txt");
		
		System.out.println(f.exists());
		if (f.exists()){
			System.out.println("file already present");
		} else {
			System.out.println("need to create file");
			f.createNewFile();
			
		}
	}
}
