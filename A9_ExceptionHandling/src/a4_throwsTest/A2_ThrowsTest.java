package a4_throwsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A2_ThrowsTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		readfile();
	}
	public static void readfile() throws IOException, InterruptedException{
		validatefile();
	}
	public static void validatefile() throws IOException, InterruptedException{
		uploadfile();
	}
	public static void uploadfile() throws IOException, InterruptedException{
		File f=new File("");
		FileInputStream fis = new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		Thread.sleep(1000);
	}
}

