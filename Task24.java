import java.util.Scanner;

public class Task24 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a number from 10 to 30_000:");
	int n = sc.nextInt();
	
	if(n>=10 && n<=30000){
		
		int number = n;
		int reversed = 0;
		int remainder = 0;
		
		do{
			remainder = n%10;
			n = n/10;
			reversed = reversed*10 + remainder;
		} while(n > 0);
		
		if(reversed == number){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
	else {
		System.out.println("The number is out of range");
	}
}
}
