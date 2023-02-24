package ifTest;

public class IfTest2 {
	public static void main(String[] args) {
		
		int age=17;
		String Country="AUS";
		
		if (age>18){
			System.out.println("Allow to Vote");//if the age meets the requirement the output will be the first condition
			
		}else if (Country.equals("AUS")){
			System.out.println("He is AUS, So Allowed");

		}
		else {
			System.out.println("Under 18");
		}
	}

}
