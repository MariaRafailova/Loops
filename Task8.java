import java.util.Scanner;

public class Task8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Въведете n:");
	int n = sc.nextInt();
	
	int number = n-1;
	for (int i = 1; i <=n; i++) {
		for(int k = 1; k <= n; k++){
			System.out.print(number);
		}
		System.out.println();
		number +=2;
	}
	
}
}
