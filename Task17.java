import java.io.IOException;
import java.util.Scanner;

public class Task17 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a length from 3 to 20:");
		int b = sc.nextInt();
		System.out.println("Please enter a sign:");
		char c = (char) System.in.read();

		if (b >= 3 && b <= 20) {

			for (int i = 1; i <= b; i++) {
				System.out.print("*");
			}
			System.out.println();

			for (int i = 1; i <= (b - 2); i++) {
				System.out.print("*");
				for (int j = 1; j <= (b - 2); j++) {
					System.out.print(c);
				}
				System.out.print("*");
				
				System.out.println();
			}

			for (int i = 1; i <= b; i++) {
				System.out.print("*");
			}

		} else {
			System.out.println("The number is not in the range of 10 and 20");
		}

	}
}
