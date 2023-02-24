package a2_propertyFiletext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class A1_PropertyTest {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Rohini\\Desktop\\Workspace\\batch251\\A7_FileHandlingTest\\File\\test.properties");
		FileInputStream fis= new FileInputStream(f);
		
		Properties prop= new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("password"));
		System.out.println(prop.get("domain"));
		System.out.println(prop.get("vcentry"));
		
		Enumeration e= prop.keys();
		while(e.hasMoreElements()){
			String key= (String) e.nextElement();
			System.out.println(key+"-"+prop.getProperty(key));//to get all the key and values from the file
		}
	}
}
