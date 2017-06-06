import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter N, between 10 and 5555:");
		int n = sc.nextInt();
		System.out.println("Please enter M, between 10 and 5555:");
		int m = sc.nextInt();

		if (n >= 10 && m >= 10 && n <= 5555 && m <= 5555 && n != m) {

			if (m > n) {
				for (int i = m; i > n; i--) {
					if (i % 50 == 0) {
						System.out.print(i + ",");
					}
				}
			} else {
				for (int i = n; i > m; i--) {
					if (i % 50 == 0) {
						System.out.print(i + ",");
					}
				}
			}

		} else {
			System.out.println("Please enter new numbers between 10 and 5555");
		}
	}
}
