package a2_tryCatchTest;

public class A5_TryCatchThrowableTest {

public static void main(String[] args) {
		
		System.out.println("login app");
		
		try {
		
		add();
		int a = 1;
		int b = 1;
		int result = a/b;
		
		System.out.println("Result is - "+result);
		int [] x= new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		
		String name= null;
		name.concat(" chennai ");
		
		} catch(ArithmeticException e){
			System.out.println("Alert - You have entered less than 0");
			System.out.println("Log - "+ e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Alert - You have reached maximum index");
			System.out.println("Log - "+e.getMessage());
		} catch(Exception e){
			System.out.println("Alert - Sorry Something went wrong, Our support will call you");
			System.out.println("Log - "+e.getMessage());
		}catch(Throwable t){
			System.out.println("Sorry some error happened");
			System.out.println("Log - "+t.getMessage());			
		}
		System.out.println("logout app");
}

	public static void add(){
		add();
		
	}

}
