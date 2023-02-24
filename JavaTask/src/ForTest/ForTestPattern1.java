package ForTest;

public class ForTestPattern1 {
public static void main(String[] args) {
	int r=10;
	for(int a=0;a<r;a++){
		for(int b=r-a;b>1;b--){
			System.out.print(" ");
		}
		for(int b=0;b<=a;b++){
			System.out.print("* ");
	}
		System.out.println();
}
}
}