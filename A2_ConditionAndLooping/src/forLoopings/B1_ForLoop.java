package forLoopings;

public class B1_ForLoop {

	public static void main(String[] args) {
		int k=5,i,j;
		for(i=0;i<k;i++){
			for(j=k-i;j>1;j++){
				System.out.print(" ");
			}
				for(j=0;j<=i;j++){
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}

