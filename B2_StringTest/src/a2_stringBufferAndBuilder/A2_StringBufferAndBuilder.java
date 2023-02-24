package a2_stringBufferAndBuilder;

public class A2_StringBufferAndBuilder {

	public static void main(String[] args) {
		
		int i=10;
		i++;
		System.out.println(i);
		
		
		
		String a= "Vcentry";//immutable
		a.concat("  Technologies");
		System.out.println(a);
		
		StringBuffer sb1= new StringBuffer("Vcentry");//muttable
		sb1.append(" Technologies");
		System.out.println(sb1);// since java 1.1
		//synchronized, slow, thread safe
		
		StringBuilder sb2=new StringBuilder("Vcentry");//muttable
		sb2.append(" Technologies");
		System.out.println(sb2);
		//non synchronized, fast, non thread safe
		
		
		
	}
}
