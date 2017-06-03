import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();
		System.out.println("Please enter B:");
		int b = sc.nextInt();

		int sum = 0;

		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.print("skip3" + ",");
			} else {
				sum += i * i;
				if (sum > 200) {					
					break;
				} else {
					System.out.print(i * i + ",");
				}
			}
		}
	}
}
