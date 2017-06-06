import java.util.Scanner;

public class Task25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int n = sc.nextInt();

		int multipl = 1;
		int nextNum = 2;

		do {
			multipl *= nextNum;
			nextNum++;
		} while (nextNum <= n);

		System.out.println(multipl);
	}
}
