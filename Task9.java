import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();
		System.out.println("Please enter B:");
		int b = sc.nextInt();

		int sum = 0;

		int min =a;
		int max = b;
		
		if (a>b) {
			min = b;
			max = a;
		}
		
		for (int i = min; i <= max; i++) {
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
