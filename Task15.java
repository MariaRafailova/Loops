import java.util.Scanner;

public class Task15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number");
	int n = sc.nextInt();
	
	int sum =0;
	
	for (int i = 1; i <=n; i++) {
		sum +=i;
	}
	
	System.out.println(sum);
}
}
