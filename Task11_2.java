import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter a Number:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if(i < n-1){
				
				for (int j = 0; j < (n-i)-1; j++) {
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				for (int j = 0; j < 2*i-1; j++) {
					System.out.print(" ");
				}
				
				if (i != 0) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			else{
				for (int j = 0; j < 2*i+1; j++) {
					System.out.print("*");
				}
			}
		}
	}
}
