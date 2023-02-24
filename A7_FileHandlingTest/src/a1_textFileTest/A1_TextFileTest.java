package a1_textFileTest;

import java.io.File;
import java.io.IOException;

public class A1_TextFileTest {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:/Users/Rohini/Desktop/Workspace/batch251/FileHandlingTest/File/sample.txt");
		
		f.createNewFile();
	}
}
