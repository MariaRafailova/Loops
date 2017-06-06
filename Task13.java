import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number between 2 and 27:");
		int n = sc.nextInt();

		if(n>=2 && n<=27){
			
			for (int i = 100; i <= 999; i++) {

				int c = i % 10;
				int ab = i / 10;
				int b = ab % 10;
				int a = ab / 10;

				int sum = a + b + c;

				if (sum == n) {
					System.out.print(i + ",");
				}
			}
		}
		else {
			System.out.println("The number is out of range");
		}
		
	}
}
