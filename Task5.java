import java.util.Scanner;

public class Task5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter the first number:");
	int first = sc.nextInt();
	System.out.println("Please enter the second number:");
	int second = sc.nextInt();
	
	if(first <= second){
		for (int i = first; i <= second; i++) {
			System.out.print(i + " ");
		}
	}
	else{
		for (int i = second; i <= first; i++) {
			System.out.print(i + " ");
		}
	}
}
}
