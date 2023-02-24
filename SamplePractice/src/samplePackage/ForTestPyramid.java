package samplePackage;

public class ForTestPyramid {
public static void main(String[] args) {
	int r=5;
	for(int a=0;a<r;a++){
		for(int b=r-a;b>1;b--){
			System.out.print(" ");
		}
		for (int b=0;b<=a;b++){
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
