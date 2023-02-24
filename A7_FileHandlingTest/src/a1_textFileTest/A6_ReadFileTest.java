package a1_textFileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A6_ReadFileTest {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:/Users/Rohini/Desktop/Workspace/batch251/FileHandlingTest/File/sample.txt");
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String x ="";
		while ((x= br.readLine())!=null){
			System.out.println(x);
		}
	}
}
