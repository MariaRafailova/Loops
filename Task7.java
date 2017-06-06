import java.util.Scanner;

public class Task7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number:");
	int n = sc.nextInt();
	
	int count = 1;
	int nextNum = 4;
	System.out.print(3);
	
	do{
		if (nextNum % 3 == 0) {
			System.out.print("," + nextNum);
			count++;
		}
		nextNum++;
	}
	while(count != n);
}
}
