package f1_propertyTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\D4_frameWorkTask\\file\\text.properties");
		FileReader fr=new FileReader(f);
		Properties prop=new Properties();
		prop.load(fr);
		System.setProperty("django", "http://djangovinoth.pythonanywhere.com/login/");
	}
}
